package org.p5633c.p5634a;

import java.io.Serializable;

/* renamed from: org.c.a.q */
/* compiled from: PG */
public abstract class C72293q implements Serializable {

    /* renamed from: a */
    public static final C72293q f192436a = new C72292p("eras", (byte) 1);

    /* renamed from: b */
    public static final C72293q f192437b = new C72292p("centuries", (byte) 2);

    /* renamed from: c */
    public static final C72293q f192438c = new C72292p("weekyears", (byte) 3);

    /* renamed from: d */
    public static final C72293q f192439d = new C72292p("years", (byte) 4);

    /* renamed from: e */
    public static final C72293q f192440e = new C72292p("months", (byte) 5);

    /* renamed from: f */
    public static final C72293q f192441f = new C72292p("weeks", (byte) 6);

    /* renamed from: g */
    public static final C72293q f192442g = new C72292p("days", (byte) 7);

    /* renamed from: h */
    public static final C72293q f192443h = new C72292p("halfdays", (byte) 8);

    /* renamed from: i */
    public static final C72293q f192444i = new C72292p("hours", (byte) 9);

    /* renamed from: j */
    public static final C72293q f192445j = new C72292p("minutes", (byte) 10);

    /* renamed from: k */
    public static final C72293q f192446k = new C72292p("seconds", (byte) 11);

    /* renamed from: l */
    public static final C72293q f192447l = new C72292p("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;

    /* renamed from: m */
    public final String f192448m;

    protected C72293q(String str) {
        this.f192448m = str;
    }

    /* renamed from: a */
    public abstract C72291o mo63674a(C72132a aVar);

    public final String toString() {
        return this.f192448m;
    }
}
