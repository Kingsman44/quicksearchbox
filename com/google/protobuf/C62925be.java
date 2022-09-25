package com.google.protobuf;

import java.lang.reflect.Field;

/* renamed from: com.google.protobuf.be */
/* compiled from: PG */
final class C62925be implements Comparable {

    /* renamed from: a */
    public final Field f169875a;

    /* renamed from: b */
    public final C62928bh f169876b;

    /* renamed from: c */
    public final Class f169877c;

    /* renamed from: d */
    public final int f169878d;

    /* renamed from: e */
    public final Field f169879e;

    /* renamed from: f */
    public final int f169880f;

    /* renamed from: g */
    public final boolean f169881g;

    /* renamed from: h */
    public final boolean f169882h;

    /* renamed from: i */
    public final C63009ea f169883i;

    /* renamed from: j */
    public final Class f169884j;

    /* renamed from: k */
    public final Object f169885k;

    /* renamed from: l */
    public final C62959cf f169886l;

    public C62925be(Field field, int i, C62928bh bhVar, Class cls, Field field2, int i2, boolean z, boolean z2, C63009ea eaVar, Class cls2, Object obj, C62959cf cfVar) {
        this.f169875a = field;
        this.f169876b = bhVar;
        this.f169877c = cls;
        this.f169878d = i;
        this.f169879e = field2;
        this.f169880f = i2;
        this.f169881g = z;
        this.f169882h = z2;
        this.f169883i = eaVar;
        this.f169884j = cls2;
        this.f169885k = obj;
        this.f169886l = cfVar;
    }

    /* renamed from: a */
    public static C62925be m95394a(int i, C62928bh bhVar, C63009ea eaVar, Class cls, boolean z, C62959cf cfVar) {
        m95395b(i);
        C62972cr.m95549i(bhVar, "fieldType");
        C62972cr.m95549i(eaVar, "oneof");
        C62972cr.m95549i(cls, "oneofStoredType");
        if (bhVar.f169951aa == C62927bg.SCALAR) {
            return new C62925be((Field) null, i, bhVar, (Class) null, (Field) null, 0, false, z, eaVar, cls, (Object) null, cfVar);
        }
        String valueOf = String.valueOf(bhVar);
        StringBuilder sb = new StringBuilder("Oneof is only supported for scalar fields. Field ");
        int i2 = i;
        sb.append(i);
        sb.append(" is of type ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static void m95395b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + i);
        }
    }

    /* renamed from: c */
    public static boolean m95396c(int i) {
        return i != 0 && (i & (i + -1)) == 0;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f169878d - ((C62925be) obj).f169878d;
    }
}
