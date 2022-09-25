package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.p */
/* compiled from: PG */
final class C129255p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129252o f355039a;

    public C129255p(C129252o oVar) {
        this.f355039a = oVar;
    }

    public final void onClick(View view) {
        C129252o oVar = this.f355039a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        c.mo24023e("assistant_tng_ma");
        Intent a = c.mo24020b().mo24031a();
        C46439e eVar = oVar.f355034j;
        C46438d b = C46438d.m82810b(oVar.f355035k.mo39653g(a));
        eVar.mo50428h(b.f121541a, (Object) null, oVar.f355037m);
    }
}
