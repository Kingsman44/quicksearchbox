package com.google.android.libraries.lens.view.onboarding;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25538u;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.onboarding.x */
/* compiled from: PG */
final class C27527x implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27525w f75300a;

    public C27527x(C27525w wVar) {
        this.f75300a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C27483ap apVar = (C27483ap) bVar;
        C27525w wVar = this.f75300a;
        boolean z = false;
        if (wVar.f75293q) {
            wVar.f75293q = false;
            wVar.f75283g.mo19974a(C37194a.f98483at.mo40815i(C62722b.OK));
        }
        wVar.mo33065h();
        Fragment a = wVar.mo33059a();
        if (a instanceof C27485ar) {
            ((C27485ar) a).dismiss();
            wVar.f75280d.getChildFragmentManager().mo467ah();
        }
        if (wVar.f75287k.mo30590a() == C25538u.GALLERY_STARTUP) {
            C25504aj ajVar = wVar.f75289m;
            if (ajVar.mo30536f(ajVar.mo30532b())) {
                wVar.mo33060c();
                if (!wVar.f75289m.mo30536f("android.permission.CAMERA")) {
                    wVar.mo33064g();
                }
                return C47392e.f123116b;
            }
            wVar.mo33069l(true, apVar.f75156a);
        } else if (wVar.f75289m.mo30536f("android.permission.CAMERA")) {
            wVar.mo33060c();
            C25504aj ajVar2 = wVar.f75289m;
            if (!ajVar2.mo30536f(ajVar2.mo30532b())) {
                wVar.mo33064g();
            }
            return C47392e.f123116b;
        } else {
            if (!C62632i.m94823h(wVar.f75285i.mo32701h()) || !wVar.f75288l) {
                z = true;
            }
            wVar.mo33068k(true, z, apVar.f75156a);
        }
        return C47392e.f123115a;
    }
}
