package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116186o;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.l */
/* compiled from: PG */
public final /* synthetic */ class C116220l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116226r f322271a;

    public /* synthetic */ C116220l(C116226r rVar) {
        this.f322271a = rVar;
    }

    public final void onClick(View view) {
        C116226r rVar = this.f322271a;
        C116186o oVar = rVar.f322298s.f322245a.f322193B;
        if (oVar != null) {
            int i = rVar.f322281b;
            C116129b bVar = oVar.f322157a;
            Bundle bundle = new Bundle();
            bundle.putInt("groupIndex", Integer.valueOf(i).intValue());
            ((C116130c) bVar).f322041a.mo28345s("onExpandButtonClicked_int", "RecentlyEventsDispatcher", bundle);
        }
    }
}
