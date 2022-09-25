package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.Context;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ap */
/* compiled from: PG */
final class C138564ap extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C138558am f376891a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138564ap(C138558am amVar, Context context) {
        super(context);
        this.f376891a = amVar;
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i, fwVar, geVar);
        if (i > 0) {
            this.f376891a.mo114326d().mo114402c();
        } else if (i - scrollVerticallyBy < 0) {
            this.f376891a.mo114326d().mo114406h();
        }
        return scrollVerticallyBy;
    }
}
