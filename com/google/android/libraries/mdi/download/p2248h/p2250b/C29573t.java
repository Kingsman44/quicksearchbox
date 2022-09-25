package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.b.t */
/* compiled from: PG */
public final class C29573t {

    /* renamed from: a */
    public Executor f80125a;

    /* renamed from: b */
    public C58881cr f80126b;

    /* renamed from: c */
    public C58833ax f80127c = C58836b.f156633a;

    /* renamed from: d */
    public final C58881cr f80128d = C29572s.f80124a;

    /* renamed from: e */
    public C29575v f80129e = C29575v.SINGLE_VARIANT;

    /* renamed from: a */
    public final C29576w mo34770a() {
        C58838bb.m90866a(this.f80125a, "Must call setBackgroundExecutor() before build().");
        C58838bb.m90866a(this.f80126b, "Must call setMobileDataDownloadSupplier() before build().");
        return new C29576w(this);
    }
}
