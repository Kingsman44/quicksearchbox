package com.google.android.libraries.lens.view.onboarding;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.lens.view.p2078at.C25502ah;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.onboarding.v */
/* compiled from: PG */
public final /* synthetic */ class C27524v implements C25502ah {

    /* renamed from: a */
    public final /* synthetic */ C27525w f75273a;

    /* renamed from: b */
    public final /* synthetic */ boolean f75274b;

    /* renamed from: c */
    public final /* synthetic */ int f75275c;

    /* renamed from: d */
    public final /* synthetic */ boolean f75276d;

    public /* synthetic */ C27524v(C27525w wVar, boolean z, int i, boolean z2) {
        this.f75273a = wVar;
        this.f75274b = z;
        this.f75275c = i;
        this.f75276d = z2;
    }

    /* renamed from: a */
    public final void mo30529a(boolean z) {
        C27525w wVar = this.f75273a;
        boolean z2 = this.f75274b;
        int i = this.f75275c;
        boolean z3 = this.f75276d;
        wVar.f75294r = false;
        if (z) {
            C25504aj ajVar = wVar.f75289m;
            if (ajVar.mo30536f(ajVar.mo30532b()) || (wVar.f75288l && C62632i.m94823h(wVar.f75285i.mo32701h()))) {
                wVar.mo33060c();
                wVar.mo33063f(C62722b.OK);
                wVar.mo33066i();
            } else if (z2) {
                wVar.mo33069l(false, i);
            }
        } else {
            if (z3) {
                Fragment a = wVar.mo33059a();
                if (a instanceof C27510h) {
                    C27515m a2 = ((C27510h) a).mo17754z();
                    a2.f75245h = wVar.mo33073p("android.permission.CAMERA");
                    View view = a2.f75239b.getView();
                    view.getClass();
                    a2.mo33053a(view);
                } else {
                    wVar.mo33070m(0);
                }
            }
            wVar.mo33060c();
            wVar.mo33064g();
        }
    }
}
