package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.a */
/* compiled from: PG */
public final /* synthetic */ class C116135a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116136b f322049a;

    /* renamed from: b */
    public final /* synthetic */ C116226r f322050b;

    /* renamed from: c */
    public final /* synthetic */ C116214f f322051c;

    public /* synthetic */ C116135a(C116136b bVar, C116226r rVar, C116214f fVar) {
        this.f322049a = bVar;
        this.f322050b = rVar;
        this.f322051c = fVar;
    }

    public final void onClick(View view) {
        C116136b bVar = this.f322049a;
        C116226r rVar = this.f322050b;
        C116214f fVar = this.f322051c;
        C116163af afVar = bVar.f322053b;
        int i = rVar.f322281b;
        int i2 = fVar.f322256e;
        C116129b bVar2 = afVar.f322097a.f322100b;
        Bundle bundle = new Bundle();
        bundle.putInt("groupIndex", Integer.valueOf(i).intValue());
        bundle.putInt("entryIndex", Integer.valueOf(i2).intValue());
        ((C116130c) bVar2).f322041a.mo28345s("onEntryClicked_int_int", "RecentlyEventsDispatcher", bundle);
    }
}
