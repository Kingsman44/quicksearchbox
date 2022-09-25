package com.google.android.apps.search.podcasts.browser.p10558a;

import com.google.apps.tiktok.cache.C46370ah;
import com.google.common.base.C58833ax;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54311ao;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.f */
/* compiled from: PG */
final class C140169f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140175l f380840a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140169f(C140175l lVar) {
        super(1);
        this.f380840a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C69664n.m101061g(axVar, "it");
        if (!axVar.mo56113h()) {
            return C69496am.f185918a;
        }
        C140175l lVar = this.f380840a;
        C54297aa aaVar = ((C54311ao) ((C46370ah) axVar.mo56107c()).f121384a).f142681a;
        if (aaVar == null) {
            aaVar = C54297aa.f142650b;
        }
        C69664n.m101060f(aaVar, "it.get().value().feed");
        return lVar.mo115485c(aaVar);
    }
}
