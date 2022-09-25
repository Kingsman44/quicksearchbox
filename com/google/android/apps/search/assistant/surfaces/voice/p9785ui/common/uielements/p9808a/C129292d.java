package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.p9808a;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.a.d */
/* compiled from: PG */
final class C129292d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129289c f355117a;

    public C129292d(C129289c cVar) {
        this.f355117a = cVar;
    }

    public final void onClick(View view) {
        C129289c cVar = this.f355117a;
        C58976aa aaVar = C58975e.f156826a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        c.mo24023e("assistant_tng_ma");
        Intent a = c.mo24020b().mo24031a();
        C46439e eVar = cVar.f355112h;
        C46438d b = C46438d.m82810b(cVar.f355111g.mo39653g(a));
        eVar.mo50428h(b.f121541a, (Object) null, cVar.f355114j);
    }
}
