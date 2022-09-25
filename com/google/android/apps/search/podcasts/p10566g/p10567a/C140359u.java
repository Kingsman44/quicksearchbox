package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140370e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.show.C141119ad;
import com.google.android.apps.search.podcasts.show.C141120ae;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.podcasts.g.a.u */
/* compiled from: PG */
public final /* synthetic */ class C140359u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C140361w f381269a;

    /* renamed from: b */
    public final /* synthetic */ C140370e f381270b;

    public /* synthetic */ C140359u(C140361w wVar, C140370e eVar) {
        this.f381269a = wVar;
        this.f381270b = eVar;
    }

    public final void onClick(View view) {
        C140361w wVar = this.f381269a;
        C140370e eVar = this.f381270b;
        wVar.f381274b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C46496q d = wVar.f381273a.mo50483d(view);
        C141119ad adVar = (C141119ad) C141120ae.f383145c.createBuilder();
        C140646b bVar = eVar.f381312a;
        adVar.copyOnWrite();
        bVar.getClass();
        ((C141120ae) adVar.instance).f383147a = bVar;
        boolean z = eVar.f381314c;
        adVar.copyOnWrite();
        ((C141120ae) adVar.instance).f383148b = z;
        d.mo50509e(R.id.podcasts_action_to_show_actions_dialog, adVar.build());
    }
}
