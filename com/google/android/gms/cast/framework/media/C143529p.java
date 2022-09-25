package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.cast.framework.media.p */
/* compiled from: PG */
public final /* synthetic */ class C143529p implements C143712ae {

    /* renamed from: a */
    public final /* synthetic */ C143535v f389208a;

    public /* synthetic */ C143529p(C143535v vVar) {
        this.f389208a = vVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        C143535v vVar = this.f389208a;
        Status a = ((C143493az) adVar).mo117629a();
        int i = a.f389621g;
        if (i != 0) {
            vVar.f389213a.mo118889g(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), a.f389622h}), new Object[0]);
        }
        vVar.f389222j = null;
        if (!vVar.f389220h.isEmpty()) {
            vVar.mo118837h();
        }
    }
}
