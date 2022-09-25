package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dn */
/* compiled from: PG */
final class C126103dn extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C126088cz f347525a;

    /* renamed from: b */
    final /* synthetic */ C126106dq f347526b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126103dn(C126088cz czVar, C126106dq dqVar) {
        super(1);
        this.f347525a = czVar;
        this.f347526b = dqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C126087cy cyVar = (C126087cy) obj;
        C69664n.m101061g(cyVar, "it");
        C126083cu a = C126083cu.m206170a(cyVar.f347498i, false, false, false, this.f347525a, 7);
        C125064as asVar = (C125064as) this.f347526b.mo107336a().toBuilder();
        C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        xVar.f330894a |= 1;
        xVar.f330895b = " ";
        wVar.copyOnWrite();
        C118606x xVar2 = (C118606x) wVar.instance;
        xVar2.f330894a |= 2;
        xVar2.f330896c = true;
        asVar.mo106794b(wVar);
        C118605w wVar2 = (C118605w) C118606x.f330892g.createBuilder();
        String str = this.f347525a.f347500a;
        wVar2.copyOnWrite();
        C118606x xVar3 = (C118606x) wVar2.instance;
        str.getClass();
        xVar3.f330894a |= 1;
        xVar3.f330895b = str;
        wVar2.copyOnWrite();
        C118606x xVar4 = (C118606x) wVar2.instance;
        xVar4.f330894a |= 2;
        xVar4.f330896c = true;
        asVar.mo106794b(wVar2);
        C125065at atVar = (C125065at) asVar.build();
        C69664n.m101060f(atVar, "build()");
        return C126087cy.m206173e(cyVar, (C126292aa) null, (C60870cx) null, false, (C126084cv) null, (C125112cm) null, 0, atVar, false, a, (C58485gu) null, 703);
    }
}
