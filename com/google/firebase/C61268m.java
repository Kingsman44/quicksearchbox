package com.google.firebase;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.firebase.m */
/* compiled from: PG */
public final class C61268m {

    /* renamed from: a */
    public String f165709a;

    /* renamed from: b */
    public String f165710b;

    /* renamed from: c */
    private String f165711c;

    /* renamed from: d */
    private String f165712d;

    /* renamed from: a */
    public final C61269n mo57877a() {
        return new C61269n(this.f165712d, this.f165711c, (String) null, (String) null, this.f165709a, (String) null, this.f165710b);
    }

    /* renamed from: b */
    public final void mo57878b(String str) {
        C143919bh.m233970m(str, "ApiKey must be set.");
        this.f165711c = str;
    }

    /* renamed from: c */
    public final void mo57879c(String str) {
        C143919bh.m233970m(str, "ApplicationId must be set.");
        this.f165712d = str;
    }
}
