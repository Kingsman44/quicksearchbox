package com.google.android.apps.search.pronunciationlearning.content;

import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqf;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.e */
/* compiled from: PG */
public final /* synthetic */ class C141364e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C141366g f383761a;

    /* renamed from: b */
    public final /* synthetic */ boolean f383762b;

    /* renamed from: c */
    public final /* synthetic */ boolean f383763c;

    public /* synthetic */ C141364e(C141366g gVar, boolean z, boolean z2) {
        this.f383761a = gVar;
        this.f383762b = z;
        this.f383763c = z2;
    }

    public final Object apply(Object obj) {
        C141366g gVar = this.f383761a;
        boolean z = this.f383762b;
        boolean z2 = this.f383763c;
        C141372m mVar = (C141372m) obj;
        if (mVar == null) {
            return C141372m.f383778b;
        }
        C141371l lVar = (C141371l) mVar.toBuilder();
        if (z) {
            C141330c cVar = gVar.f383769d;
            cVar.mo116362b(C37200a.f98708r.mo40812e(aqf.f159732l, cVar.mo116361a((apx) null, (aqb) null)));
            C141366g.m229440b(C141374o.f383784d, lVar);
        }
        if (z2) {
            C141330c cVar2 = gVar.f383769d;
            cVar2.mo116362b(C37200a.f98709s.mo40812e(aqf.f159732l, cVar2.mo116361a((apx) null, (aqb) null)));
            C141366g.m229440b(C141374o.f383785e, lVar);
        }
        return (C141372m) lVar.build();
    }
}
