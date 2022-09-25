package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.q */
/* compiled from: PG */
final class C105649q extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C105474ab f294749a;

    public C105649q(C105474ab abVar) {
        this.f294749a = abVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C105474ab abVar = this.f294749a;
        abVar.f294197e.mo86303b(recyclerView, abVar.f63126Q.mo28342l(), i);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C105474ab abVar = this.f294749a;
        abVar.f294197e.mo86305d(abVar.f63126Q.mo28342l(), i, i2);
    }
}
