package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104460w;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.i */
/* compiled from: PG */
final class C104345i implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C104348l f290291a;

    public C104345i(C104348l lVar) {
        this.f290291a = lVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C104460w wVar;
        C58881cr crVar = this.f290291a.f290317l;
        if ((crVar != null && !((Boolean) crVar.mo6453a()).booleanValue()) || (wVar = this.f290291a.f290323r) == null) {
            return false;
        }
        wVar.mo94165i(motionEvent);
        return false;
    }
}
