package com.google.android.libraries.onegoogle.popovercontainer;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.i */
/* compiled from: PG */
final class C31047i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ ExpandableDialogView f83634a;

    public C31047i(ExpandableDialogView expandableDialogView) {
        this.f83634a = expandableDialogView;
    }

    /* renamed from: a */
    private final boolean m57963a(MotionEvent motionEvent) {
        return !this.f83634a.f83567a.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return m57963a(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Runnable runnable;
        boolean a = m57963a(motionEvent);
        if (!a || (runnable = this.f83634a.f83582j) == null) {
            return a;
        }
        C31036ak akVar = ((C31058t) runnable).f83648a;
        akVar.mo36730c();
        akVar.dismiss();
        return true;
    }
}
