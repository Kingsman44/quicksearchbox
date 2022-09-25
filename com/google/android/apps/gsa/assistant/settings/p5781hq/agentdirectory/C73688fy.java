package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.fy */
/* compiled from: PG */
public final /* synthetic */ class C73688fy implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ gc f194906a;

    /* renamed from: b */
    public final /* synthetic */ View f194907b;

    public /* synthetic */ C73688fy(gc gcVar, View view) {
        this.f194906a = gcVar;
        this.f194907b = view;
    }

    public final void onGlobalLayout() {
        gc gcVar = this.f194906a;
        View view = this.f194907b;
        if (gcVar.b.getBottom() != view.getHeight()) {
            view.getLayoutParams().height = gcVar.b.getBottom();
            view.requestLayout();
        }
    }
}
