package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.engine.dictation.e;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dk */
/* compiled from: PG */
final class C126100dk extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ bj f347518a;

    /* renamed from: b */
    final /* synthetic */ at f347519b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126100dk(bj bjVar, at atVar) {
        super(1);
        this.f347518a = bjVar;
        this.f347519b = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C126087cy cyVar = (C126087cy) obj;
        C69664n.m101061g(cyVar, "it");
        boolean z = true;
        int i = cyVar.f347495f + 1;
        e eVar = this.f347518a.d;
        if (eVar == null) {
            eVar = e.b;
        }
        C69664n.m101060f(eVar, "orationContext.contextBeforeCaret");
        boolean g = C126106dq.m206193g(eVar);
        e eVar2 = this.f347518a.e;
        if (eVar2 == null) {
            eVar2 = e.b;
        }
        C69664n.m101060f(eVar2, "orationContext.contextAfterCaret");
        boolean g2 = C126106dq.m206193g(eVar2);
        if (this.f347518a.c <= 0) {
            z = false;
        }
        C126084cv cvVar = new C126084cv(g, g2, z, this.f347519b.a);
        C125065at atVar = C125065at.f345040b;
        C126083cu cuVar = new C126083cu((byte[]) null);
        C69664n.m101060f(atVar, "getDefaultInstance()");
        return C126087cy.m206173e(cyVar, (C126292aa) null, (C60870cx) null, false, cvVar, (C125112cm) null, i, atVar, false, cuVar, (C58485gu) null, 515);
    }
}
