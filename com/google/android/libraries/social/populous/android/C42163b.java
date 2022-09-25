package com.google.android.libraries.social.populous.android;

import android.util.Log;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.social.populous.android.b */
/* compiled from: PG */
final class C42163b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f110434a;

    /* renamed from: b */
    final /* synthetic */ AndroidLibAutocompleteSession f110435b;

    public C42163b(AndroidLibAutocompleteSession androidLibAutocompleteSession, String str) {
        this.f110435b = androidLibAutocompleteSession;
        this.f110434a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e(AndroidLibAutocompleteSession.f110424u, "Failed to get owner fields: ".concat(String.valueOf(th.getMessage())));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f110435b.f110351l.f111033d.addAll((C58485gu) obj);
        C42163b.super.mo44825n(this.f110434a);
    }
}
