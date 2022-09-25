package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C104705ao implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C104712av f291586a;

    public /* synthetic */ C104705ao(C104712av avVar) {
        this.f291586a = avVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C104712av avVar = this.f291586a;
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        avVar.f291629p = true;
        avVar.mo94318I(true);
        return false;
    }
}
