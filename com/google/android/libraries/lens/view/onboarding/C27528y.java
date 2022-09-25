package com.google.android.libraries.lens.view.onboarding;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.libraries.lens.view.onboarding.y */
/* compiled from: PG */
final class C27528y implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27525w f75301a;

    public C27528y(C27525w wVar) {
        this.f75301a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C27474ag agVar = (C27474ag) bVar;
        C27525w wVar = this.f75301a;
        wVar.mo33065h();
        if (wVar.f75289m.mo30536f("android.permission.CAMERA")) {
            wVar.mo33062e();
            return C47392e.f123116b;
        }
        int i = agVar.f75132a;
        wVar.mo33068k(true, false, 146848);
        return C47392e.f123115a;
    }
}
