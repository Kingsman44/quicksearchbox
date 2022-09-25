package com.facebook.p313c;

/* renamed from: com.facebook.c.c */
/* compiled from: PG */
public final class C6032c {

    /* renamed from: a */
    public static volatile C6037d f17760a;

    private C6032c() {
    }

    /* renamed from: a */
    public static C6037d m15511a() {
        if (f17760a == null) {
            synchronized (C6032c.class) {
                if (f17760a == null) {
                    f17760a = new C6024b();
                }
            }
        }
        return f17760a;
    }
}
