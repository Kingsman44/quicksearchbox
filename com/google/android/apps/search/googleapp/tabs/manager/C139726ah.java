package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133077b;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.tabs.manager.p10524a.C139716c;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ah */
/* compiled from: PG */
final class C139726ah implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139720ac f379801a;

    public C139726ah(C139720ac acVar) {
        this.f379801a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139716c cVar = (C139716c) bVar;
        C139720ac acVar = this.f379801a;
        String str = cVar.mo115189a().f362925e;
        C46459k.m82829b(acVar.f379773f.mo110974c(new C58759qy(str)), "Failed to close tab", new Object[0]);
        C133081f fVar = acVar.f379774g;
        if (fVar.f362841d.containsKey(str)) {
            fVar.f362842e.set(C133077b.m216050a(str));
            fVar.f362841d.remove(str);
            fVar.f362840c.mo50787a(C60866ct.f164955a, C133081f.f362838a);
        }
        acVar.mo115198l(true);
        C139712d dVar = acVar.f379772e.f379852b;
        if (dVar == null) {
            dVar = C139712d.f379748d;
        }
        String str2 = dVar.f379752c;
        if (!str2.isEmpty() && str2.equals(cVar.mo115189a().f362925e)) {
            acVar.mo115199m();
        }
        return C47392e.f123115a;
    }
}
