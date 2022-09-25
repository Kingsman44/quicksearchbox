package com.google.lens.sdk;

import android.app.Activity;
import com.google.android.libraries.lens.p1995c.p1996a.C24080h;

/* renamed from: com.google.lens.sdk.c */
/* compiled from: PG */
public final /* synthetic */ class C62637c implements C24080h {

    /* renamed from: a */
    public final /* synthetic */ LensApi f169134a;

    /* renamed from: b */
    public final /* synthetic */ C62647m f169135b;

    /* renamed from: c */
    public final /* synthetic */ long f169136c;

    /* renamed from: d */
    public final /* synthetic */ Activity f169137d;

    public /* synthetic */ C62637c(LensApi lensApi, C62647m mVar, long j, Activity activity) {
        this.f169134a = lensApi;
        this.f169135b = mVar;
        this.f169136c = j;
        this.f169137d = activity;
    }

    /* renamed from: a */
    public final void mo29471a(int i) {
        LensApi lensApi = this.f169134a;
        C62647m mVar = this.f169135b;
        long j = this.f169136c;
        Activity activity = this.f169137d;
        if (i == 2) {
            if (mVar.mo58553n() == null) {
                C62646l g = mVar.mo58545g();
                g.mo58537c(Long.valueOf(j));
                mVar = g.mo58535a();
            }
            lensApi.mo58517c(mVar);
            return;
        }
        lensApi.mo58516b(activity);
    }
}
