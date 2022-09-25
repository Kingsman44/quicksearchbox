package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.api.m */
/* compiled from: PG */
public final class C143841m {

    /* renamed from: a */
    public final C143707a f389916a;

    /* renamed from: b */
    public final C143840l f389917b;

    /* renamed from: c */
    public final String f389918c;

    public C143841m(String str, C143707a aVar, C143840l lVar) {
        C143919bh.m233971n(aVar, "Cannot construct an Api with a null ClientBuilder");
        C143919bh.m233971n(lVar, "Cannot construct an Api with a null ClientKey");
        this.f389918c = str;
        this.f389916a = aVar;
        this.f389917b = lVar;
    }
}
