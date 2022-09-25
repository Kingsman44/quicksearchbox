package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.AgendaHubActivity;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.b */
/* compiled from: PG */
public final /* synthetic */ class C114643b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114678d f318062a;

    public /* synthetic */ C114643b(C114678d dVar) {
        this.f318062a = dVar;
    }

    public final void onClick(View view) {
        C114678d dVar = this.f318062a;
        dVar.f318176e.mo65089a(new Intent(dVar.f318180i, AgendaHubActivity.class));
    }
}
