package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import android.support.p033v7.p040e.C0422d;
import com.google.android.apps.search.googleapp.discover.p10248y.C135216ad;
import com.google.android.apps.search.googleapp.discover.p10248y.C135268s;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.l */
/* compiled from: PG */
public final class C134880l extends C0422d {

    /* renamed from: a */
    final /* synthetic */ C135216ad f367183a;

    /* renamed from: b */
    final /* synthetic */ C135216ad f367184b;

    public C134880l(C135216ad adVar, C135216ad adVar2) {
        this.f367183a = adVar;
        this.f367184b = adVar2;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f367184b.mo112171c().size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f367183a.mo112171c().size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        return mo1383e(i, i2);
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        return ((C135268s) this.f367183a.mo112171c().get(i)).mo112198a((C135268s) this.f367184b.mo112171c().get(i2));
    }
}
