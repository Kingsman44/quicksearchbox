package com.google.android.apps.gsa.nowoverlayservice;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.av */
/* compiled from: PG */
final class C83447av implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C83468bb f227478a;

    public C83447av(C83468bb bbVar) {
        this.f227478a = bbVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        C83468bb bbVar = this.f227478a;
        if (bbVar.f227561l) {
            bbVar.mo76796e();
            return false;
        }
        C83471be beVar = bbVar.f227554e;
        if (!beVar.f236843at) {
            return false;
        }
        beVar.mo81810ar();
        return false;
    }
}
