package com.google.android.apps.gsa.staticplugins.p7705cs;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6640cd.C85077a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C89984aw;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.cs.a */
/* compiled from: PG */
public final class C98526a extends C86734a implements C85077a {

    /* renamed from: a */
    private final C86124t f275107a;

    /* renamed from: b */
    private final C91097g f275108b;

    public C98526a(C91097g gVar, C86124t tVar) {
        super(C118575h.WORKER_PUFFY, "puffy");
        this.f275107a = tVar;
        this.f275108b = gVar;
    }

    /* renamed from: a */
    public final void mo78691a() {
        if (this.f275107a.mo79746e(C89984aw.f246646d)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1368;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f275108b.mo65089a(C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("file").encodedAuthority("/android_asset").appendPath("puffygame").appendPath("puffy.html").build()).putExtra("WEBVIEW_ALLOW_FILE_URL_ACCESS", true).putExtra("WEBVIEW_DISABLE_HARDWARE_ACCELERATION", this.f275107a.mo79746e(C89984aw.f246644b)).putExtra("full_screen", true).putExtra("hide_status_bar", true).putExtra("screen_orientation", 1)));
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
