package com.google.android.apps.gsa.staticplugins.p7413as;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.corpora.C85753b;
import com.google.android.apps.gsa.search.core.corpora.IntentCorpus;
import com.google.android.apps.gsa.search.core.google.C85918cl;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.p6513aj.p6516c.C84542a;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.C91041i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.p3096r.C39905a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.as.a */
/* compiled from: PG */
public final class C94127a extends C86734a implements C84691a {

    /* renamed from: a */
    private final Context f262972a;

    /* renamed from: b */
    private final C85753b f262973b;

    /* renamed from: c */
    private final C91097g f262974c;

    /* renamed from: f */
    private final C84542a f262975f;

    /* renamed from: g */
    private final C86610af f262976g;

    public C94127a(Context context, C85753b bVar, C91097g gVar, C84542a aVar, C86610af afVar) {
        super(C118575h.WORKER_EXTERNAL_QUERY, "externalquery");
        this.f262972a = context;
        this.f262973b = bVar;
        this.f262974c = gVar;
        this.f262975f = aVar;
        this.f262976g = afVar;
    }

    /* renamed from: h */
    private final IntentCorpus m155340h(Query query) {
        if (!this.f262973b.f231875b.mo79409d()) {
            return null;
        }
        C85753b bVar = this.f262973b;
        Corpus b = bVar.f231875b.mo79408b(query.mo84346be());
        if (b instanceof IntentCorpus) {
            return (IntentCorpus) b;
        }
        return null;
    }

    /* renamed from: a */
    public final C60870cx mo78421a(Query query) {
        int i;
        IntentCorpus h = m155340h(query);
        if (h == null) {
            return C60856cj.m92900i(false);
        }
        String str = query.f252770i;
        if (h.f252914e.equals("map")) {
            i = 140;
        } else {
            i = h.f252914e.equals("flt") ? 958 : 0;
        }
        if (i != 0) {
            C89949q.m146523g(i);
        }
        Intent a = h.mo79404a(str);
        int i2 = h.f252918i;
        if (i2 == 2) {
            a.setClassName(h.f231863b, h.f231864c);
        } else if (i2 == 3) {
            a.addCategory("android.intent.category.BROWSABLE");
        }
        if (!C90722af.m148175c(this.f262972a, a, false)) {
            a = h.mo79404a(str);
        }
        this.f262975f.mo78261a(a);
        return C60856cj.m92900i(true);
    }

    /* renamed from: b */
    public final C60870cx mo78422b(Query query, C58833ax axVar, C58833ax axVar2) {
        C84542a aVar = this.f262975f;
        C22872h.m42743c(C86593a.class);
        Intent intent = null;
        Uri a = (query.mo84337bV() || query.mo84326bK() || !query.mo84391cX()) ? null : C39905a.m69320a(query.f252768g.toString());
        if (a != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW", a);
            intent2.addCategory("android.intent.category.BROWSABLE").putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 1).putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 2);
            if (axVar.mo56113h()) {
                intent2.setPackage((String) axVar.mo56107c());
                if (C91041i.m148716a((String) axVar.mo56107c()) && axVar2.mo56113h()) {
                    intent2.setComponent(new ComponentName((String) axVar.mo56107c(), (String) axVar2.mo56107c()));
                } else if (!C90722af.m148175c(aVar.f230073a, intent2, false)) {
                    intent2.setPackage((String) null);
                }
            }
            intent2.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_LAUNCH_NEW_TASK_OVERRIDE", true);
            C89429a.m145468z(aVar.f230073a, intent2, true, (String) axVar.mo56111f());
            C85919cm cmVar = aVar.f230074b;
            cmVar.f232290d.mo85139d(new C85918cl(cmVar, aVar.f230075c, query.f252768g, a.toString()));
            intent = intent2;
        }
        return C60856cj.m92900i(C58833ax.m90833j(intent));
    }

    /* renamed from: c */
    public final C60870cx mo78423c(Query query) {
        return C60856cj.m92900i(Boolean.valueOf(m155340h(query) != null));
    }

    /* renamed from: e */
    public final void mo78424e(Query query, Uri uri) {
        if (query.mo84325bJ()) {
            Intent a = C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", uri));
            a.putExtra("base_query", query.mo84484m());
            this.f262974c.mo65089a(a);
        }
    }

    /* renamed from: f */
    public final void mo78425f(Intent intent) {
        this.f262975f.mo78261a(intent);
    }

    /* renamed from: g */
    public final void mo78426g() {
        this.f262976g.mo80228i(new C87684al(C88244um.GO_BACK_FOR_LAUNCHING_EXTERNAL_ACTIVITY).mo81964a());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ExternalQueryWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
