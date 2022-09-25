package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8156a;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a */
/* compiled from: PG */
public final class C105662a implements C91643a {

    /* renamed from: a */
    private final C21370a f294775a;

    /* renamed from: b */
    private final C87348a f294776b;

    /* renamed from: c */
    private final Query f294777c;

    /* renamed from: d */
    private final C68214a f294778d;

    /* renamed from: e */
    private final C91097g f294779e;

    public C105662a(C21370a aVar, C87348a aVar2, Query query, C91097g gVar, C68214a aVar3) {
        this.f294775a = aVar;
        this.f294776b = aVar2;
        this.f294777c = query;
        this.f294779e = gVar;
        this.f294778d = aVar3;
    }

    /* renamed from: c */
    private static Query m175811c(Query query, String str) {
        if (query.mo84355bn() != null) {
            return query;
        }
        if (!TextUtils.isEmpty(str)) {
            return query.mo84275aL(str);
        }
        return query.mo84275aL("and.gsa.now.widget");
    }

    /* renamed from: a */
    public final void mo85916a(String str, C90491g gVar) {
        Query b = this.f294776b.mo81003b();
        boolean z = false;
        if (gVar == null) {
            this.f294776b.mo81004c(m175811c(b, (String) null).mo84268aE(str, false));
            return;
        }
        if ((gVar.f252886a & 4096) != 0) {
            z = true;
        }
        Query O = this.f294777c.mo84252O(str, gVar, (Parcelable) null, !z, (C58881cr) null);
        String bn = b.mo84355bn();
        if (bn != null) {
            O = O.mo84275aL(bn);
        }
        Query c = m175811c(O, gVar.f252898m);
        if (((C84486a) this.f294778d.mo27525b()).mo78207n()) {
            Intent intent = new Intent("android.intent.action.MAIN");
            C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
            String str2 = c.f252770i;
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            str2.getClass();
            gVar2.f373769a |= 1;
            gVar2.f373770b = str2;
            long c2 = this.f294775a.mo26871c();
            eVar.copyOnWrite();
            C137418g gVar3 = (C137418g) eVar.instance;
            gVar3.f373769a |= 4;
            gVar3.f373772d = c2;
            int a = C137415d.m223276a(c.mo84263a("query-header-visibility"));
            eVar.copyOnWrite();
            C137418g gVar4 = (C137418g) eVar.instance;
            int i = a - 1;
            if (a != 0) {
                gVar4.f373774f = i;
                gVar4.f373769a |= 8;
                if (c.mo84348bg() != null) {
                    String bg = c.mo84348bg();
                    bg.getClass();
                    eVar.mo113714b("ibp", bg);
                }
                if (c.mo84357bp() != null) {
                    String bp = c.mo84357bp();
                    bp.getClass();
                    eVar.mo113714b("ved", bp);
                }
                if (c.mo84349bh() != null) {
                    String bh = c.mo84349bh();
                    bh.getClass();
                    eVar.mo113714b("ludocid", bh);
                }
                C136128i l = C136129j.m221208l();
                l.mo112776k(C139779t.SEARCH);
                l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                C136127h.m221196a(intent, l.mo112766a());
                intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
                intent.putExtra("SKIP_EXIT_ANIMATION", true);
                String bn2 = c.mo84355bn();
                if (!TextUtils.isEmpty(bn2)) {
                    intent.putExtra("source", bn2);
                }
                this.f294779e.mo65089a(intent);
                return;
            }
            throw null;
        }
        this.f294776b.mo81004c(c);
    }

    /* renamed from: b */
    public final C91097g mo86021b() {
        return this.f294779e;
    }
}
