package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115449s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115450t;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115648x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.y */
/* compiled from: PG */
public final /* synthetic */ class C115829y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115652aa f321226a;

    /* renamed from: b */
    public final /* synthetic */ int f321227b;

    public /* synthetic */ C115829y(C115652aa aaVar, int i) {
        this.f321226a = aaVar;
        this.f321227b = i;
    }

    public final void onClick(View view) {
        C115652aa aaVar = this.f321226a;
        int i = this.f321227b;
        C115648x xVar = aaVar.f320833a;
        C58976aa aaVar2 = C58975e.f156826a;
        C115449s sVar = ((C115724cs) xVar).f320972a.f320973e;
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        ((C115450t) sVar).f320288a.mo28345s("onMediaItemRequested_int", "SpeakrPlaylistEventsDispatcher", bundle);
    }
}
