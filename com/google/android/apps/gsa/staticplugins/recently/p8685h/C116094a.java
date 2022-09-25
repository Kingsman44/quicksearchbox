package com.google.android.apps.gsa.staticplugins.recently.p8685h;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116191t;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.h.a */
/* compiled from: PG */
public final /* synthetic */ class C116094a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116096c f321909a;

    /* renamed from: b */
    public final /* synthetic */ C116226r f321910b;

    public /* synthetic */ C116094a(C116096c cVar, C116226r rVar) {
        this.f321909a = cVar;
        this.f321910b = rVar;
    }

    public final void onClick(View view) {
        C116096c cVar = this.f321909a;
        C116226r rVar = this.f321910b;
        C116191t tVar = cVar.f321924m;
        int i = rVar.f322281b;
        C116129b bVar = tVar.f322162a;
        Bundle bundle = new Bundle();
        bundle.putInt("groupIndex", Integer.valueOf(i).intValue());
        ((C116130c) bVar).f322041a.mo28345s("onQueryClicked_int", "RecentlyEventsDispatcher", bundle);
    }
}
