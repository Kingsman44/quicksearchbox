package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.q */
/* compiled from: PG */
public final class C113574q {

    /* renamed from: a */
    public final Context f314473a;

    public C113574q(Context context) {
        this.f314473a = context;
    }

    /* renamed from: a */
    public final LinearLayoutManager mo100314a(C48674ai aiVar) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f314473a);
        linearLayoutManager.setOrientation(1);
        if (aiVar != C48674ai.INTENT_LAUNCHER) {
            linearLayoutManager.setReverseLayout(true);
        }
        return linearLayoutManager;
    }

    /* renamed from: b */
    public final C0653fo mo100315b(int i) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f314473a, i);
        gridLayoutManager.setOrientation(1);
        return gridLayoutManager;
    }
}
