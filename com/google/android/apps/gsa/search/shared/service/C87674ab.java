package com.google.android.apps.gsa.search.shared.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* renamed from: com.google.android.apps.gsa.search.shared.service.ab */
/* compiled from: PG */
final class C87674ab implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C87676ad f237010a;

    /* renamed from: b */
    private final int f237011b;

    public C87674ab(C87676ad adVar, int i) {
        this.f237010a = adVar;
        this.f237011b = i;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C87676ad adVar = this.f237010a;
        adVar.mo81955a(this.f237011b, i, intent, adVar.f237014b);
        return true;
    }
}
