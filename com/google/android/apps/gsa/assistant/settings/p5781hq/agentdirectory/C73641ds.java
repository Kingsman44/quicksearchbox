package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.ViewTreeObserver;
import com.google.assistant.p3861at.C50498zh;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ds */
/* compiled from: PG */
final class C73641ds implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C50498zh f194812a;

    /* renamed from: b */
    final /* synthetic */ du f194813b;

    public C73641ds(du duVar, C50498zh zhVar) {
        this.f194813b = duVar;
        this.f194812a = zhVar;
    }

    public final void onGlobalLayout() {
        this.f194813b.l.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f194813b.l(this.f194812a);
    }
}
