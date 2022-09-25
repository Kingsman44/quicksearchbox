package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.MotionEvent;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104408s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.am */
/* compiled from: PG */
public final /* synthetic */ class C104703am implements C104408s {

    /* renamed from: a */
    public final /* synthetic */ C104712av f291584a;

    public /* synthetic */ C104703am(C104712av avVar) {
        this.f291584a = avVar;
    }

    /* renamed from: a */
    public final void mo94149a(MotionEvent motionEvent) {
        C104712av avVar = this.f291584a;
        if (avVar.f291629p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                avVar.mo94312C();
            } else if (actionMasked == 1) {
                avVar.mo94313D();
            } else if (actionMasked == 3) {
                avVar.mo94313D();
            } else if (actionMasked == 4) {
                avVar.mo94313D();
            }
        }
    }
}
