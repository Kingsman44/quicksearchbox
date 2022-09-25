package com.google.android.libraries.lens.view.infopanel;

import com.google.android.libraries.lens.view.infopanel.p2140b.C27018f;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27019g;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27020h;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27080g;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.protos.youtube.elements.C66166ck;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.infopanel.q */
/* compiled from: PG */
final class C27199q implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27195m f74366a;

    public C27199q(C27195m mVar) {
        this.f74366a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C27080g gVar = (C27080g) bVar;
        C27195m mVar = this.f74366a;
        mVar.f74350n.mo19974a(C37194a.f98539bw);
        AccountId accountId = mVar.f74339c;
        String str = gVar.f73815a;
        C66166ck ckVar = gVar.f73816b;
        C27019g gVar2 = (C27019g) C27020h.f73655c.createBuilder();
        gVar2.copyOnWrite();
        str.getClass();
        ((C27020h) gVar2.instance).f73657a = str;
        gVar2.copyOnWrite();
        ckVar.getClass();
        ((C27020h) gVar2.instance).f73658b = ckVar;
        C27018f fVar = new C27018f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C47243l.m84039a(fVar, (C27020h) gVar2.build());
        fVar.showNow(mVar.f74338b.getChildFragmentManager(), "elements-view-fragment");
        mVar.f74350n.mo19974a(C37194a.f98540bx);
        return C47392e.f123115a;
    }
}
