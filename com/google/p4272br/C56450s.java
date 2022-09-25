package com.google.p4272br;

/* renamed from: com.google.br.s */
/* compiled from: PG */
public final class C56450s extends RuntimeException {
    public C56450s() {
        super("error parsing regexp: trailing backslash at end of expression");
    }

    public C56450s(String str, String str2) {
        super("error parsing regexp: " + str + ": `" + str2 + "`");
    }
}
