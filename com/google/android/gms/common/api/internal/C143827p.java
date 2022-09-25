package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.p */
/* compiled from: PG */
final class C143827p extends C143769bq {

    /* renamed from: a */
    final /* synthetic */ Dialog f389889a;

    /* renamed from: b */
    final /* synthetic */ C143828q f389890b;

    public C143827p(C143828q qVar, Dialog dialog) {
        this.f389890b = qVar;
        this.f389889a = dialog;
    }

    /* renamed from: a */
    public final void mo119157a() {
        this.f389890b.f389891a.mo119279b();
        if (this.f389889a.isShowing()) {
            this.f389889a.dismiss();
        }
    }
}
