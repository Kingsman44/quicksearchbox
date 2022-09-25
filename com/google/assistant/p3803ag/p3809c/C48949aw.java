package com.google.assistant.p3803ag.p3809c;

/* renamed from: com.google.assistant.ag.c.aw */
/* compiled from: PG */
public final class C48949aw {
    /* renamed from: a */
    public static /* synthetic */ String m85319a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CONDITION_NOT_SET" : "NOT" : "OR" : "AND" : "LEAF";
    }

    /* renamed from: b */
    public static int m85320b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
