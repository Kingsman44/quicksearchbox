package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118083b;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.ae */
/* compiled from: PG */
public final class C117961ae extends C68247h {

    /* renamed from: a */
    private final C68283d f327390a;

    /* renamed from: c */
    private final C68283d f327391c;

    /* renamed from: d */
    private final C68283d f327392d;

    /* renamed from: e */
    private final C68283d f327393e;

    /* renamed from: f */
    private final C68283d f327394f;

    /* renamed from: g */
    private final C68283d f327395g;

    /* renamed from: h */
    private final C68283d f327396h;

    /* renamed from: i */
    private final C68283d f327397i;

    /* renamed from: j */
    private final C68283d f327398j;

    /* renamed from: k */
    private final C68283d f327399k;

    /* renamed from: l */
    private final C68283d f327400l;

    public C117961ae(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10, C68283d dVar11) {
        super(aVar2, new C68277d(C117961ae.class), aVar);
        this.f327390a = C68236af.m98549d(dVar);
        this.f327391c = C68236af.m98549d(dVar2);
        this.f327392d = C68236af.m98549d(dVar3);
        this.f327393e = C68236af.m98549d(dVar4);
        this.f327394f = C68236af.m98549d(dVar5);
        this.f327395g = C68236af.m98549d(dVar6);
        this.f327396h = C68236af.m98549d(dVar7);
        this.f327397i = C68236af.m98549d(dVar8);
        this.f327398j = C68236af.m98549d(dVar9);
        this.f327399k = C68236af.m98549d(dVar10);
        this.f327400l = C68236af.m98549d(dVar11);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C60870cx cxVar;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C118826c cVar2 = (C118826c) list.get(2);
        C118826c cVar3 = (C118826c) list.get(3);
        C58833ax axVar2 = (C58833ax) list.get(4);
        C68283d dVar = this.f327395g;
        C68283d dVar2 = this.f327396h;
        C68283d dVar3 = this.f327397i;
        C68283d dVar4 = this.f327398j;
        C118083b bVar = (C118083b) list.get(5);
        C89859i iVar = (C89859i) list.get(6);
        C58976aa aaVar = C58975e.f156826a;
        if (C57940c.m88583j(cVar) && (((C51195j) ((C58833ax) cVar.mo60292a()).mo56107c()).f133266a & 128) != 0) {
            cxVar = dVar.mo60297gq();
        } else if (axVar.mo56113h()) {
            iVar.mo83702b(C89849ae.ASSISTANT_AUTO_ACTION_DATA_RENDER_STARTED);
            cxVar = dVar2.mo60297gq();
        } else if (!C86253h.LEGACY_ASSISTANT_RESPONSE.equals(axVar2.mo56111f()) || bVar.mo103509c() == null) {
            iVar.mo83702b(C89849ae.ASSISTANT_AUTO_PUNT_RENDER_STARTED);
            cxVar = dVar3.mo60297gq();
        } else {
            cxVar = dVar4.mo60297gq();
        }
        return C60922j.m93044g(cxVar, C118047w.f327630a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f327390a.mo60297gq()), this.f327391c.mo60297gq(), this.f327392d.mo60297gq(), this.f327393e.mo60297gq(), this.f327394f.mo60297gq(), this.f327399k.mo60297gq(), this.f327400l.mo60297gq());
    }
}
