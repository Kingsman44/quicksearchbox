package com.google.android.libraries.search.video.thirdparty;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.search.video.thirdparty.t */
/* compiled from: PG */
public final /* synthetic */ class C41618t implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C41623x f108777a;

    public /* synthetic */ C41618t(C41623x xVar) {
        this.f108777a = xVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C41623x xVar = this.f108777a;
        boolean z = false;
        if (xVar.f108800e != null && motionEvent.getAction() == 0) {
            z = true;
            if (xVar.f108804i) {
                if (xVar.f108800e.mo7675k()) {
                    xVar.f108800e.mo7663a();
                } else {
                    xVar.f108800e.mo7665c();
                }
            }
        }
        return z;
    }
}
