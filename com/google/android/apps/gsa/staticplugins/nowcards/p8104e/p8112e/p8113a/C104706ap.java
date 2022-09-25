package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104393d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C104706ap implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ C104712av f291587a;

    public /* synthetic */ C104706ap(C104712av avVar) {
        this.f291587a = avVar;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        C104712av avVar = this.f291587a;
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        FrameLayout frameLayout = avVar.f291627n;
        frameLayout.getClass();
        if (C104393d.m172602a(frameLayout, motionEvent)) {
            return true;
        }
        return false;
    }
}
