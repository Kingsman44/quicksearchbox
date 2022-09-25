package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.l */
/* compiled from: PG */
final class C32479l extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C32480m f87038a;

    public C32479l(C32480m mVar) {
        this.f87038a = mVar;
    }

    public final void getOutline(View view, Outline outline) {
        if (!this.f87038a.f87041b.isEmpty()) {
            C32480m mVar = this.f87038a;
            float f = mVar.f87040a;
            if (f > 0.0f) {
                outline.setRoundRect(mVar.f87041b, f);
                return;
            }
        }
        outline.setEmpty();
    }
}
