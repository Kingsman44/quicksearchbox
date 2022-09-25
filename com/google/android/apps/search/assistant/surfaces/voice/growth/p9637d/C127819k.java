package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.k */
/* compiled from: PG */
final class C127819k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C127817j f351806a;

    public C127819k(C127817j jVar) {
        this.f351806a = jVar;
    }

    public final void onClick(View view) {
        C127817j jVar = this.f351806a;
        C46439e eVar = jVar.f351801e;
        C127118j jVar2 = jVar.f351803g;
        C127454b bVar = C127454b.TRY_SAYING_SUGGESTION_TEXT_QUERY;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        String obj = ((TextView) view.findViewById(R.id.assistant_input_trysaying_query)).getText().toString();
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        obj.getClass();
        amp.f135386a |= 1;
        amp.f135387b = obj;
        amo amo = amo.TRUSTED;
        amm.copyOnWrite();
        C51682amp amp2 = (C51682amp) amm.instance;
        amp2.f135388c = amo.f135383d;
        amp2.f135386a |= 2;
        eVar.mo50428h(C46438d.m82810b(jVar2.mo107931g(C127407d.m208363c(bVar, (C51682amp) amm.build()))).f121541a, (Object) null, jVar.f351805i);
    }
}
