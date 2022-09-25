package com.google.android.apps.gsa.staticplugins.p7391an.p7399f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.f.a */
/* compiled from: PG */
public final class C94016a {

    /* renamed from: a */
    private static final C59071e f262616a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.f.a");

    /* renamed from: b */
    private final Context f262617b;

    /* renamed from: c */
    private final C91097g f262618c;

    /* renamed from: d */
    private final C21370a f262619d;

    /* renamed from: e */
    private final C68214a f262620e;

    public C94016a(Context context, C91097g gVar, C21370a aVar, C68214a aVar2) {
        this.f262617b = context;
        this.f262618c = gVar;
        this.f262619d = aVar;
        this.f262620e = aVar2;
    }

    /* renamed from: c */
    private static final Intent m155196c(Query query, Optional optional) {
        String str = query.f252770i;
        String str2 = (String) query.f252779r.get("ct");
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        eVar.mo113714b("oi", "ddle");
        if (str2 != null) {
            eVar.mo113714b("ct", str2);
        }
        if (optional.isPresent()) {
            long longValue = ((Long) optional.get()).longValue();
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            gVar2.f373769a |= 4;
            gVar2.f373772d = longValue;
        }
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        intent.putExtra("SKIP_EXIT_ANIMATION", true);
        return intent;
    }

    /* renamed from: a */
    public final void mo88298a(Query query, Optional optional) {
        Intent intent;
        Query aN = query.mo84277aN();
        if (!optional.isPresent()) {
            C91097g gVar = this.f262618c;
            if (((C84486a) this.f262620e.mo27525b()).mo78207n()) {
                intent = m155196c(aN, Optional.empty());
            } else {
                intent = C89429a.m145446d(this.f262617b, aN);
                C89429a.m145452j(intent);
            }
            gVar.mo65089a(intent);
        } else if (((C84486a) this.f262620e.mo27525b()).mo78207n()) {
            this.f262618c.mo65089a(m155196c(aN, Optional.m71637of(Long.valueOf(this.f262619d.mo26871c()))));
        } else {
            ((C87348a) optional.get()).mo81004c(aN);
        }
    }

    /* renamed from: b */
    public final void mo88299b(DoodleData doodleData, Optional optional) {
        int i = doodleData.f252931L;
        if (i != 6) {
            if (doodleData.f252938d == 3 && i != 1) {
                if (this.f262618c.mo65089a(new Intent("android.intent.action.VIEW", Uri.parse(doodleData.f252941g)))) {
                    return;
                }
            }
            if (doodleData.f252938d == 4 && doodleData.f252931L == 2) {
                Uri uri = doodleData.f252950p;
                if (uri == null) {
                    ((C59052c) ((C59052c) f262616a.mo56226d()).mo56372aa(19409)).mo56386p("Missing fullpageInteractiveUri");
                    int i2 = C90755l.f253831a;
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    intent.putExtra("full_screen", true);
                    intent.putExtra("hide_status_bar", true);
                    intent.putExtra("screen_orientation", doodleData.f252952r);
                    if (this.f262618c.mo65089a(C87574a.f236603a.mo83277a(intent))) {
                        return;
                    }
                }
            }
            mo88298a(doodleData.f252937c, optional);
        }
    }
}
