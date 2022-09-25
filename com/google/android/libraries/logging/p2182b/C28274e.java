package com.google.android.libraries.logging.p2182b;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.logging.b.e */
/* compiled from: PG */
public final /* synthetic */ class C28274e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28281l f76947a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f76948b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f76949c;

    public /* synthetic */ C28274e(C28281l lVar, SettableFuture settableFuture, C60870cx cxVar) {
        this.f76947a = lVar;
        this.f76948b = settableFuture;
        this.f76949c = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C28281l lVar = this.f76947a;
        SettableFuture settableFuture = this.f76948b;
        C60870cx cxVar = this.f76949c;
        long longValue = ((Long) C60856cj.m92909r(settableFuture)).longValue();
        C58838bb.m90884s(lVar.f76962a == -1, "Duration set more than once");
        lVar.f76962a = longValue;
        return cxVar;
    }
}
