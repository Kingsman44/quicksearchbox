package com.google.android.libraries.assistant.contexttrigger;

import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d */
/* compiled from: PG */
public final class C17658d {

    /* renamed from: a */
    public final boolean f50788a;

    /* renamed from: b */
    public final boolean f50789b;

    /* renamed from: c */
    public final boolean f50790c;

    /* renamed from: d */
    private final boolean f50791d;

    /* renamed from: e */
    private final boolean f50792e;

    /* renamed from: f */
    private final boolean f50793f;

    public C17658d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f50791d = z;
        this.f50792e = z2;
        this.f50793f = z3;
        this.f50788a = z4;
        this.f50789b = z5;
        this.f50790c = z6;
    }

    /* renamed from: a */
    public final boolean mo23421a(C48900b bVar) {
        C48900b bVar2 = C48900b.UNSPECIFIED;
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            return this.f50793f;
        }
        if (ordinal == 2) {
            return this.f50791d;
        }
        if (ordinal != 3) {
            return ordinal == 5;
        }
        return this.f50792e;
    }
}
