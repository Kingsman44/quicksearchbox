package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.m */
/* compiled from: PG */
public final /* synthetic */ class C116147m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116148n f322069a;

    /* renamed from: b */
    public final /* synthetic */ String f322070b;

    public /* synthetic */ C116147m(C116148n nVar, String str) {
        this.f322069a = nVar;
        this.f322070b = str;
    }

    public final void onClick(View view) {
        C116148n nVar = this.f322069a;
        String str = this.f322070b;
        C116129b bVar = nVar.f322071a.f322165a;
        Bundle bundle = new Bundle();
        bundle.putString("query", str);
        ((C116130c) bVar).f322041a.mo28345s("onMyActivityCardClicked_java.lang.String", "RecentlyEventsDispatcher", bundle);
    }
}
