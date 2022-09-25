package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.conversation.p1852f.C22574a;
import com.google.android.libraries.gsa.conversation.p1852f.C22584k;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.ab */
/* compiled from: PG */
public final class C117914ab extends C68247h {

    /* renamed from: a */
    private final C68283d f327279a;

    /* renamed from: c */
    private final C68283d f327280c;

    /* renamed from: d */
    private final C68283d f327281d;

    /* renamed from: e */
    private final C68283d f327282e;

    /* renamed from: f */
    private final C68283d f327283f;

    /* renamed from: g */
    private final C68283d f327284g;

    /* renamed from: h */
    private final C68283d f327285h;

    /* renamed from: i */
    private final C68283d f327286i;

    /* renamed from: j */
    private final C68283d f327287j;

    /* renamed from: k */
    private final C68283d f327288k;

    public C117914ab(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10) {
        super(aVar2, new C68277d(C117914ab.class), aVar);
        this.f327279a = C68236af.m98549d(dVar);
        this.f327280c = C68236af.m98549d(dVar2);
        this.f327281d = C68236af.m98549d(dVar3);
        this.f327282e = C68236af.m98549d(dVar4);
        this.f327283f = C68236af.m98549d(dVar5);
        this.f327284g = C68236af.m98549d(dVar6);
        this.f327285h = C68236af.m98549d(dVar7);
        this.f327286i = C68236af.m98549d(dVar8);
        this.f327287j = C68236af.m98549d(dVar9);
        this.f327288k = C68236af.m98549d(dVar10);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C84605a aVar = (C84605a) list.get(1);
        C86251f fVar = (C86251f) list.get(2);
        C85005h hVar = (C85005h) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        C58833ax axVar2 = (C58833ax) list.get(5);
        C58833ax axVar3 = (C58833ax) list.get(6);
        C84370p pVar = (C84370p) list.get(7);
        C68283d dVar = this.f327287j;
        C85700a aVar2 = (C85700a) list.get(8);
        if (!axVar.mo56113h()) {
            throw new IllegalStateException("No network TTS result.");
        } else if (!axVar2.mo56113h()) {
            throw new IllegalStateException("No network assistant response.");
        } else if (!axVar3.mo56113h()) {
            throw new IllegalStateException("No network search result.");
        } else if ((((C51195j) axVar2.mo56107c()).f133266a & 128) != 0) {
            fVar.mo79948d((C86232bo) axVar3.mo56107c());
            hVar.mo78641z((C51195j) axVar2.mo56107c(), query);
            String str = ((C51195j) axVar2.mo56107c()).f133271f;
            C22574a aVar3 = new C22574a();
            aVar3.mo27666b(str);
            C22584k a = aVar3.mo27665a();
            aVar2.mo79322d(C89849ae.ASSISTANT_AUTO_ONLINE_CLIENTOP_RENDER_STARTED);
            C52081en enVar = ((C51195j) axVar2.mo56107c()).f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            pVar.mo77923e(C60856cj.m92900i(C58833ax.m90834k(enVar)), aVar.mo78369a(fVar.f233151j), C58833ax.m90834k(new C84349ah(query)), C58833ax.m90834k(a), C60856cj.m92900i(axVar), C60856cj.m92900i(C58833ax.m90834k((C86232bo) axVar3.mo56107c())));
            return C118826c.f331423b;
        } else {
            aVar2.mo79322d(C89849ae.ASSISTANT_AUTO_ONLINE_ACTION_DATA_RENDER_STARTED);
            return dVar.mo60297gq();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327279a.mo60297gq(), this.f327280c.mo60297gq(), this.f327281d.mo60297gq(), this.f327282e.mo60297gq(), this.f327283f.mo60297gq(), this.f327284g.mo60297gq(), this.f327285h.mo60297gq(), this.f327286i.mo60297gq(), this.f327288k.mo60297gq());
    }
}
