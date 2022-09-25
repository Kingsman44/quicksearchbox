package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.C87354a;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7191w.C91144a;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.z */
/* compiled from: PG */
public final /* synthetic */ class C116527z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323103a;

    /* renamed from: b */
    public final /* synthetic */ Query f323104b;

    /* renamed from: c */
    public final /* synthetic */ Uri f323105c;

    /* renamed from: d */
    public final /* synthetic */ Uri f323106d;

    public /* synthetic */ C116527z(C116502ad adVar, Query query, Uri uri, Uri uri2) {
        this.f323103a = adVar;
        this.f323104b = query;
        this.f323105c = uri;
        this.f323106d = uri2;
    }

    public final void run() {
        C116502ad adVar = this.f323103a;
        Query query = this.f323104b;
        Uri uri = this.f323105c;
        Uri uri2 = this.f323106d;
        C22872h.m42743c(C86593a.class);
        if (((C85923cq) ((C116516o) adVar.f323016g.mo27525b()).f323069h.mo27525b()).mo79554e(uri, true) && "2".equals(C91144a.m148924a(uri, "gsas"))) {
            adVar.mo102742b(C118569b.SILK_GSAS_CLICKED_MEDIA_COUNT, C118575h.SILK_PANE_API);
            ((C91097g) ((C116516o) adVar.f323016g.mo27525b()).f323070i.mo27525b()).mo65089a(C87354a.m141349b(uri.toString()));
            return;
        }
        Query o = ((C85929cw) adVar.f323017h.mo27525b()).mo79574o(query, uri.toString());
        if (o != null) {
            if (o.mo84416cw()) {
                adVar.mo102742b(C118569b.SILK_GSAS_CLICKED_IMMERSIVE_COUNT, C118575h.SILK_UI_MODE_API);
            } else if (o.mo84263a("query-header-visibility") == 1) {
                adVar.mo102742b(C118569b.SILK_GSAS_CLICKED_NO_CORPUS_COUNT, C118575h.SILK_UI_MODE_API);
            }
            adVar.mo102741a(query, o, uri2);
            return;
        }
        C116819jn jnVar = adVar.f323019j;
        C22872h.m42743c(C86593a.class);
        if (jnVar.mo102965t(query)) {
            boolean z = jnVar.f324146F;
            jnVar.f324146F = true;
            if (true ^ z) {
                jnVar.mo80591ar();
            }
        } else {
            jnVar.mo102957j("resultsPageUserNavigation", query);
        }
        if (query.mo84429dJ()) {
            adVar.f323018i.mo102849k(query);
        }
        C116516o oVar = (C116516o) adVar.f323016g.mo27525b();
        if (oVar.f323063b.mo79502a(uri)) {
            new C90873ag(oVar.f323066e.mo78988c(uri), oVar.f323068g, "AdShield callback GetUpdatedUriWithAdSignals", new C116512k(oVar, uri2, query)).mo85223a(new C116513l(oVar, uri, uri2, query));
        } else {
            oVar.mo102744b(uri, uri2, query);
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 471;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
