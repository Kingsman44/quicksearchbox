package com.google.android.apps.gsa.staticplugins.p7872dw.p7875c;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.c.h */
/* compiled from: PG */
public final /* synthetic */ class C100260h implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C100274v f280387a;

    public /* synthetic */ C100260h(C100274v vVar) {
        this.f280387a = vVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C100274v vVar = this.f280387a;
        if (motionEvent.getActionMasked() != 2) {
            return false;
        }
        if (vVar.f280405e.hasFocus()) {
            vVar.f280405e.clearFocus();
            C90772bp.m148317y(vVar.f280401a, vVar.f280405e);
            return false;
        } else if (!vVar.f280404d.hasFocus()) {
            return false;
        } else {
            vVar.f280404d.clearFocus();
            C90772bp.m148317y(vVar.f280401a, vVar.f280405e);
            return false;
        }
    }
}
