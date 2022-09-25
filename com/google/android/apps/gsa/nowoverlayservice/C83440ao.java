package com.google.android.apps.gsa.nowoverlayservice;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ao */
/* compiled from: PG */
final class C83440ao extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C83444as f227432a;

    public C83440ao(C83444as asVar) {
        this.f227432a = asVar;
    }

    public final void getOutline(View view, Outline outline) {
        C83444as asVar = this.f227432a;
        float f = asVar.f227442F;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        Rect rect = asVar.f227459j;
        if (i < 0) {
            outline.setRect(rect);
        } else {
            outline.setRoundRect(rect, f);
        }
    }
}
