package com.google.android.apps.gsa.staticplugins.p8793w.p8828j;

import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85718f;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118083b;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.j.b */
/* compiled from: PG */
public final /* synthetic */ class C118088b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118090d f327716a;

    /* renamed from: b */
    public final /* synthetic */ Query f327717b;

    public /* synthetic */ C118088b(C118090d dVar, Query query) {
        this.f327716a = dVar;
        this.f327717b = query;
    }

    public final Object apply(Object obj) {
        C118090d dVar = this.f327716a;
        Query query = this.f327717b;
        C118083b bVar = (C118083b) obj;
        if (bVar.mo103508b().mo56113h()) {
            if (dVar.f327721c.mo79746e(C90086ek.f250336bH) && bVar.mo103507a().mo56113h()) {
                dVar.f327720b.mo28212l("Offline query logging", new C118087a(dVar, query, bVar));
            }
            C86232bo boVar = (C86232bo) bVar.mo103508b().mo56107c();
            if (boVar instanceof C86261p) {
                SettableFuture settableFuture = ((C86261p) boVar).f233169b.f232931a;
                if (C90918bo.m148517d(settableFuture)) {
                    return C58833ax.m90834k(C85718f.m137720b((C51195j) C90918bo.m148515b(settableFuture)));
                }
            }
            if (boVar.mo79893q() != null && C90918bo.m148517d(boVar.mo79893q())) {
                return C58833ax.m90834k(C85718f.m137719a((ActionData) C90918bo.m148515b(boVar.mo79893q())));
            }
        }
        return C58836b.f156633a;
    }
}
