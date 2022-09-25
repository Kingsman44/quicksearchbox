package com.google.common.base;

/* renamed from: com.google.common.base.j */
/* compiled from: PG */
final class C58900j extends C58912v {

    /* renamed from: a */
    static final C58912v f156738a = new C58900j();

    private C58900j() {
    }

    /* renamed from: c */
    public final boolean mo56144c(char c) {
        if (!(c == ' ' || c == 133 || c == 5760)) {
            if (c != 8199) {
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
