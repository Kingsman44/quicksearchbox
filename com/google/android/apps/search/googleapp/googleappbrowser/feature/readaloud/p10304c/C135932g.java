package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

import android.view.View;
import com.google.android.apps.gsa.h.l.a;
import com.google.android.apps.gsa.h.l.b;
import com.google.android.apps.gsa.h.l.c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.assistant.p3897e.p3921j.C52582xb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.g */
/* compiled from: PG */
final class C135932g implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C135933h f370217a;

    public C135932g(C135933h hVar) {
        this.f370217a = hVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.googleapp_actionbutton_listen;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_record_voice_over_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.googleapp_browser_actionbutton_listen;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 110105;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        C52582xb xbVar;
        c cVar = this.f370217a.f370223f;
        a createBuilder = b.e.createBuilder();
        String str = this.f370217a.f370222e.mo46468a().f113329b;
        createBuilder.copyOnWrite();
        b bVar = createBuilder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        C135933h hVar = this.f370217a;
        if (hVar.f370224g || hVar.f370225h) {
            xbVar = C52582xb.GOOGLE_APP_BROWSER_DOGFOODER;
        } else {
            xbVar = C52582xb.GOOGLE_APP_BROWSER;
        }
        createBuilder.copyOnWrite();
        b bVar2 = createBuilder.instance;
        bVar2.c = xbVar.f138062i;
        bVar2.a |= 2;
        boolean z = this.f370217a.f370226i;
        createBuilder.copyOnWrite();
        b bVar3 = createBuilder.instance;
        bVar3.a |= 4;
        bVar3.d = z;
        cVar.mo41490e(createBuilder.build());
    }
}
