package com.google.p339ab.p340a.p341a.p342a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ab.a.a.a.a */
/* compiled from: PG */
public enum C6620a implements C62957cd {
    KEY_TYPE_UNSPECIFIED(0),
    ADD_ROW(1),
    LEFT_PARENTHESIS(2),
    RIGHT_PARENTHESIS(3),
    FRACTION(4),
    FRACTION_WITH_BASE(5),
    EXPONENT(6),
    EXPONENT_THREE(7),
    EXPONENT_CUSTOM(8),
    VARIABLE(9),
    ROOT(10),
    ROOT_CUBED(11),
    ROOT_CUSTOM(12),
    FUNCTION(13),
    FUNCTION_G(14),
    FUNCTION_CUSTOM(15),
    PI(16),
    PI_OVER_TWO(17),
    PI_OVER_THREE(18),
    DIGIT(19),
    PERIOD(20),
    EQUALS(21),
    PLUS(22),
    SUBTRACT(23),
    DIVIDE(24),
    MULTIPLY(25),
    LESS(26),
    LESS_EQUAL(27),
    GREATER(28),
    GREATER_EQUAL(29),
    LOG(30),
    LOG_CUSTOM(31),
    NT_LOG(32),
    E(33),
    EXP(34),
    ABS(35),
    ABS_SINGLE(36),
    BIN_BASE(37),
    TRI_BASE(38),
    CUSTOM_BASE(39),
    DEGREE_BASE(40),
    SIN(41),
    CSC(42),
    ARCSIN(43),
    SINH(44),
    COS(45),
    SEC(46),
    ARCCOS(47),
    COSH(48),
    TAN(49),
    COT(50),
    TANH(51),
    ARCTAN(52),
    INTEGRAL(53),
    INTEGRAL_CUSTOM(54),
    DERIVATIVE(55),
    DERIVATIVE_VAR(56),
    LIMIT(57),
    LIMIT_PLUS(58),
    LIMIT_MINUS(59),
    THETA(60),
    FACTORIAL(61),
    PERCENTAGE(62),
    IMAGINARY(63),
    INF(64),
    ALPHA(65),
    BETA(66),
    GAMMA(67),
    LAMBDA(68),
    RHO(69),
    SIGMA(70),
    OMEGA(71),
    SUM(72),
    COMMA(73),
    PRIME(74),
    UNRECOGNIZED(-1);
    

    /* renamed from: ay */
    private final int f19758ay;

    private C6620a(int i) {
        this.f19758ay = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19758ay;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
