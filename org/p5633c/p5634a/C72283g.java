package org.p5633c.p5634a;

import java.io.Serializable;

/* renamed from: org.c.a.g */
/* compiled from: PG */
public abstract class C72283g implements Serializable {

    /* renamed from: c */
    public static final C72283g f192387c;

    /* renamed from: d */
    public static final C72283g f192388d;

    /* renamed from: e */
    public static final C72283g f192389e;

    /* renamed from: f */
    public static final C72283g f192390f;

    /* renamed from: g */
    public static final C72283g f192391g;

    /* renamed from: h */
    public static final C72283g f192392h;

    /* renamed from: i */
    public static final C72283g f192393i;

    /* renamed from: j */
    public static final C72283g f192394j;

    /* renamed from: k */
    public static final C72283g f192395k;

    /* renamed from: l */
    public static final C72283g f192396l;

    /* renamed from: m */
    public static final C72283g f192397m;

    /* renamed from: n */
    public static final C72283g f192398n;

    /* renamed from: o */
    public static final C72283g f192399o;

    /* renamed from: p */
    public static final C72283g f192400p;

    /* renamed from: q */
    public static final C72283g f192401q;

    /* renamed from: r */
    public static final C72283g f192402r;

    /* renamed from: s */
    public static final C72283g f192403s;
    private static final long serialVersionUID = -42615285973990L;

    /* renamed from: t */
    public static final C72283g f192404t;

    /* renamed from: u */
    public static final C72283g f192405u;

    /* renamed from: v */
    public static final C72283g f192406v;

    /* renamed from: w */
    public static final C72283g f192407w;

    /* renamed from: x */
    public static final C72283g f192408x;

    /* renamed from: y */
    public static final C72283g f192409y;

    /* renamed from: z */
    public final String f192410z;

    static {
        C72293q qVar = C72293q.f192436a;
        f192387c = new C72270f("era", (byte) 1, qVar, (C72293q) null);
        C72293q qVar2 = C72293q.f192439d;
        f192388d = new C72270f("yearOfEra", (byte) 2, qVar2, qVar);
        C72293q qVar3 = C72293q.f192437b;
        f192389e = new C72270f("centuryOfEra", (byte) 3, qVar3, qVar);
        f192390f = new C72270f("yearOfCentury", (byte) 4, qVar2, qVar3);
        f192391g = new C72270f("year", (byte) 5, qVar2, (C72293q) null);
        C72293q qVar4 = C72293q.f192442g;
        f192392h = new C72270f("dayOfYear", (byte) 6, qVar4, qVar2);
        C72293q qVar5 = C72293q.f192440e;
        f192393i = new C72270f("monthOfYear", (byte) 7, qVar5, qVar2);
        f192394j = new C72270f("dayOfMonth", (byte) 8, qVar4, qVar5);
        C72293q qVar6 = C72293q.f192438c;
        f192395k = new C72270f("weekyearOfCentury", (byte) 9, qVar6, qVar3);
        f192396l = new C72270f("weekyear", (byte) 10, qVar6, (C72293q) null);
        C72293q qVar7 = C72293q.f192441f;
        f192397m = new C72270f("weekOfWeekyear", (byte) 11, qVar7, qVar6);
        f192398n = new C72270f("dayOfWeek", (byte) 12, qVar4, qVar7);
        C72293q qVar8 = C72293q.f192443h;
        f192399o = new C72270f("halfdayOfDay", (byte) 13, qVar8, qVar4);
        C72293q qVar9 = C72293q.f192444i;
        f192400p = new C72270f("hourOfHalfday", (byte) 14, qVar9, qVar8);
        f192401q = new C72270f("clockhourOfHalfday", (byte) 15, qVar9, qVar8);
        f192402r = new C72270f("clockhourOfDay", (byte) 16, qVar9, qVar4);
        f192403s = new C72270f("hourOfDay", (byte) 17, qVar9, qVar4);
        C72293q qVar10 = C72293q.f192445j;
        f192404t = new C72270f("minuteOfDay", (byte) 18, qVar10, qVar4);
        f192405u = new C72270f("minuteOfHour", (byte) 19, qVar10, qVar9);
        C72293q qVar11 = C72293q.f192446k;
        f192406v = new C72270f("secondOfDay", (byte) 20, qVar11, qVar4);
        f192407w = new C72270f("secondOfMinute", (byte) 21, qVar11, qVar10);
        C72293q qVar12 = C72293q.f192447l;
        f192408x = new C72270f("millisOfDay", (byte) 22, qVar12, qVar4);
        f192409y = new C72270f("millisOfSecond", (byte) 23, qVar12, qVar11);
    }

    protected C72283g(String str) {
        this.f192410z = str;
    }

    /* renamed from: a */
    public abstract C72233e mo63646a(C72132a aVar);

    /* renamed from: b */
    public abstract C72293q mo63647b();

    /* renamed from: c */
    public abstract C72293q mo63648c();

    public final String toString() {
        return this.f192410z;
    }
}
