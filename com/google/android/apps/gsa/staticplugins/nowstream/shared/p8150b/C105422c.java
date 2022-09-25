package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8150b;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105404l;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105407o;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105578dy;
import com.google.p375ai.p378b.C7853mj;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.b.c */
/* compiled from: PG */
public final /* synthetic */ class C105422c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105424e f294047a;

    public /* synthetic */ C105422c(C105424e eVar) {
        this.f294047a = eVar;
    }

    public final void onClick(View view) {
        C105424e eVar = this.f294047a;
        if (((C7853mj) ((C105578dy) eVar.f294052d).f294542a.f63720e).f27530b) {
            C8142xb xbVar = eVar.f294055g;
            if (xbVar == C8142xb.ACETONE_OVERLAY_MOMO) {
                C89949q.m146523g(1240);
            } else if (xbVar == C8142xb.SEARCH_NOW_MONET) {
                C89949q.m146523g(1335);
            }
        }
        C105407o oVar = eVar.f294053e;
        ((C105404l) oVar).f294025a.mo28345s("onNewContentButtonClickedEvent", "MainFeedRecyclerViewEventsDispatcher", new Bundle());
    }
}
