package com.google.protobuf;

/* renamed from: com.google.protobuf.fd */
/* compiled from: PG */
final class C63039fd implements C62998dq {

    /* renamed from: a */
    public final C63012ed f170147a;

    /* renamed from: b */
    public final int[] f170148b;

    /* renamed from: c */
    public final C62925be[] f170149c;

    /* renamed from: d */
    public final MessageLite f170150d;

    /* renamed from: e */
    private final boolean f170151e;

    public C63039fd(C63012ed edVar, boolean z, int[] iArr, C62925be[] beVarArr, Object obj) {
        this.f170147a = edVar;
        this.f170151e = z;
        this.f170148b = iArr;
        this.f170149c = beVarArr;
        C62972cr.m95549i(obj, "defaultInstance");
        this.f170150d = (MessageLite) obj;
    }

    /* renamed from: a */
    public final MessageLite mo58989a() {
        return this.f170150d;
    }

    /* renamed from: b */
    public final C63012ed mo58990b() {
        return this.f170147a;
    }

    /* renamed from: c */
    public final boolean mo58991c() {
        return this.f170151e;
    }
}
