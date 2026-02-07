package com.omnibridge.codec;

/**
 * MTI: The DNA of an ISO-8583 message.
 * We use Java 21 Records for built-in immutability.
 */
public record MTI(String value) {
    public MTI {
        // Validation: Every MTI must be exactly 4 digits.
        if (value == null || !value.matches("\\d{4}")) {
            throw new IllegalArgumentException("Invalid MTI: Must be 4 digits");
        }
    }

    // Modern switch expression (Venkat-style)
    public String getCategory() {
        return switch (value.charAt(1)) {
            case '1' -> "Authorization";
            case '2' -> "Financial";
            case '4' -> "Reversal";
            default -> "Other";
        };
    }
}