package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105416x;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105417y;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fl */
/* compiled from: PG */
final class C105619fl implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C105620fm f294681a;

    public C105619fl(C105620fm fmVar) {
        this.f294681a = fmVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C105416x xVar = this.f294681a.f294683b;
        ((C105417y) xVar).f294032a.mo28345s("onSurveyShown", "SmileScaleSurveyEventsDispatcher", new Bundle());
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
