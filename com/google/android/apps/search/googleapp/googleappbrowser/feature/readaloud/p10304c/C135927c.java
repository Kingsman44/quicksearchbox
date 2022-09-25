package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

import com.google.android.apps.gsa.h.l.a;
import com.google.android.apps.gsa.h.l.b;
import com.google.android.apps.gsa.h.l.c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.assistant.p3897e.p3921j.C52582xb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.c */
/* compiled from: PG */
final class C135927c implements C43541a {

    /* renamed from: a */
    final /* synthetic */ C135928d f370199a;

    public C135927c(C135928d dVar) {
        this.f370199a = dVar;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.googleapp_browser_actionbutton_listen;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 110105;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo46596c() {
        return this.f370199a.f370205e.requireContext().getString(R.string.googleapp_actionbutton_listen);
    }

    /* renamed from: d */
    public final void mo46597d() {
        C52582xb xbVar;
        c cVar = this.f370199a.f370207g;
        a createBuilder = b.e.createBuilder();
        String str = this.f370199a.f370206f.mo46468a().f113329b;
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        C135928d dVar = this.f370199a;
        if (dVar.f370208h || dVar.f370209i) {
            xbVar = C52582xb.GOOGLE_APP_BROWSER_DOGFOODER;
        } else {
            xbVar = C52582xb.GOOGLE_APP_BROWSER;
        }
        createBuilder.copyOnWrite();
        b bVar2 = createBuilder.instance;
        bVar2.c = xbVar.f138062i;
        bVar2.a |= 2;
        boolean z = this.f370199a.f370210j;
        createBuilder.copyOnWrite();
        b bVar3 = createBuilder.instance;
        bVar3.a |= 4;
        bVar3.d = z;
        cVar.mo41490e(createBuilder.build());
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo46598e() {
        return true;
    }
}
