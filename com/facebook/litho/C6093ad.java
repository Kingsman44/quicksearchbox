package com.facebook.litho;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.litho.ad */
/* compiled from: PG */
final class C6093ad implements View.OnTouchListener {

    /* renamed from: a */
    public C6154cb f17992a;

    /* renamed from: b */
    public C6154cb f17993b;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C6154cb cbVar = this.f17993b;
        if (cbVar != null) {
            C6153ca.m16221a(cbVar, view, motionEvent);
        }
        C6154cb cbVar2 = this.f17992a;
        if (cbVar2 == null) {
            return false;
        }
        C6349gb.m17045a();
        if (C6153ca.f18186d == null) {
            C6153ca.f18186d = new C6350gc();
        }
        C6350gc gcVar = C6153ca.f18186d;
        gcVar.f18789a = view;
        gcVar.f18790b = motionEvent;
        Object N = cbVar2.f18197b.mo13127l().mo12795N(cbVar2, C6153ca.f18186d);
        C6350gc gcVar2 = C6153ca.f18186d;
        gcVar2.f18789a = null;
        gcVar2.f18790b = null;
        return N != null && ((Boolean) N).booleanValue();
    }
}
