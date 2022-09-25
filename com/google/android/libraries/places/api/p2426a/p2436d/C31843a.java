package com.google.android.libraries.places.api.p2426a.p2436d;

import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.android.libraries.places.api.a.d.a */
/* compiled from: PG */
public final class C31843a {

    /* renamed from: a */
    public volatile boolean f85470a;

    /* renamed from: b */
    private volatile String f85471b;

    /* renamed from: c */
    private volatile Locale f85472c;

    /* renamed from: a */
    public final synchronized String mo37400a() {
        C58838bb.m90884s(mo37402c(), "ApiConfig must be initialized.");
        this.f85471b.getClass();
        return this.f85471b;
    }

    /* renamed from: b */
    public final synchronized Locale mo37401b() {
        C58838bb.m90884s(mo37402c(), "ApiConfig must be initialized.");
        return Locale.getDefault();
    }

    /* renamed from: c */
    public final synchronized boolean mo37402c() {
        return this.f85471b != null;
    }

    /* renamed from: d */
    public final synchronized void mo37403d(String str) {
        C58838bb.m90866a(str, "API Key must not be null.");
        C58838bb.m90869d(!str.isEmpty(), "API Key must not be empty.");
        this.f85471b = str;
        this.f85472c = null;
        this.f85470a = false;
    }
}
