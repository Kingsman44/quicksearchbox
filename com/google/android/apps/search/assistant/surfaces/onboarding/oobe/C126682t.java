package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36673a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36675c;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36684d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.t */
/* compiled from: PG */
final class C126682t implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C126681s f348861a;

    public C126682t(C126681s sVar) {
        this.f348861a = sVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C36684d dVar = (C36684d) bVar;
        C126681s sVar = this.f348861a;
        String b = dVar.mo40323b();
        Optional a = dVar.mo40322a();
        if (a.isPresent() && b.equals("OobeAccountFragment")) {
            C36675c cVar = sVar.f348858j;
            C60870cx c = cVar.f95562b.mo50246c((AccountId) a.get());
            C36673a aVar = new C36673a(cVar);
            C60922j.m93045h(c, C47810es.m84966f(aVar), cVar.f95563c);
        } else if (!sVar.f348854f.mo107667a(b, a) && sVar.f348851c.getActivity() != null) {
            sVar.f348852d.mo19974a(C37176a.f97255iB.mo40805c(C62722b.OK));
            sVar.f348857i.mo40257u();
            sVar.f348851c.getActivity().finish();
        }
        return C47392e.f123115a;
    }
}
