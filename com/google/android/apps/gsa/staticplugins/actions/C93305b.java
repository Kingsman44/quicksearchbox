package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6774b.C85645c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86356b;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.C93271c;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93314a;
import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.b */
/* compiled from: PG */
public final class C93305b {

    /* renamed from: a */
    private final C93271c f260201a;

    /* renamed from: b */
    private final C69464a f260202b;

    /* renamed from: c */
    private final C69464a f260203c;

    /* renamed from: d */
    private final C87541c f260204d;

    /* renamed from: e */
    private final C86602c f260205e;

    /* renamed from: f */
    private final C86124t f260206f;

    /* renamed from: g */
    private final C86054o f260207g;

    public C93305b(C93271c cVar, C69464a aVar, C69464a aVar2, C87541c cVar2, C86602c cVar3, C86124t tVar, C86054o oVar) {
        this.f260201a = cVar;
        this.f260202b = aVar;
        this.f260203c = aVar2;
        this.f260204d = cVar2;
        this.f260205e = cVar3;
        this.f260206f = tVar;
        this.f260207g = oVar;
    }

    /* renamed from: a */
    public final C85645c mo87627a(C89356b bVar, Query query, ActionData actionData, C58833ax axVar, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        Query query2 = query;
        C86356b a = aVar.mo80113a(query);
        a.getClass();
        C93271c cVar = this.f260201a;
        cVar.getClass();
        C93314a aVar3 = (C93314a) this.f260202b.mo17428b();
        aVar3.getClass();
        ((C119071a) this.f260203c.mo17428b()).getClass();
        this.f260204d.getClass();
        C86602c cVar2 = this.f260205e;
        cVar2.getClass();
        aVar2.getClass();
        this.f260206f.getClass();
        bVar.getClass();
        this.f260207g.getClass();
        C58833ax j = C58833ax.m90833j(playbackStatus);
        query.getClass();
        actionData.getClass();
        axVar.getClass();
        return new C93429y(a, cVar, aVar3, cVar2, aVar2, bVar, j, query, actionData, axVar);
    }
}
