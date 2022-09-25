package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a.p9787a.p9788a.C128981a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a.p9787a.p9788a.C128982b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9786a.p9787a.p9788a.C128984d;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.a.g */
/* compiled from: PG */
final class C128991g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128989f f354418a;

    public C128991g(C128989f fVar) {
        this.f354418a = fVar;
    }

    public final void onClick(View view) {
        C128989f fVar = this.f354418a;
        C46439e eVar = fVar.f354412d;
        C128984d dVar = fVar.f354416h;
        Class<UserRecoverableAuthException> cls = UserRecoverableAuthException.class;
        C46438d dVar2 = new C46438d(C47633f.m84733g(dVar.f354399a.mo51024a(fVar.f354410b)).mo51515h(new C128982b(), dVar.f354400b).mo51513e(cls, C128981a.f354398a, dVar.f354400b));
        eVar.mo50428h(dVar2.f121541a, (Object) null, fVar.f354415g);
        fVar.f354411c.mo107933i();
        fVar.f354414f.mo108811c(view);
    }
}
