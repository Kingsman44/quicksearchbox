package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.C85852aj;
import com.google.android.apps.gsa.search.core.google.C85853ak;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6502ae.C84462c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.C91052l;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21471s;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21478z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.k */
/* compiled from: PG */
public final class C84444k implements C84418a {

    /* renamed from: d */
    private static final C59071e f229787d = C59071e.m91332i("com.google.android.apps.gsa.search.core.ae.a.k");

    /* renamed from: a */
    public final C22871g f229788a;

    /* renamed from: b */
    public final C68214a f229789b;

    /* renamed from: c */
    public final SettableFuture f229790c = new SettableFuture();

    /* renamed from: e */
    private final Context f229791e;

    /* renamed from: f */
    private final C90929bz f229792f;

    /* renamed from: g */
    private final C22871g f229793g;

    /* renamed from: h */
    private final C84413ad f229794h;

    /* renamed from: i */
    private final C86124t f229795i;

    /* renamed from: j */
    private final C86130z f229796j;

    /* renamed from: k */
    private final SharedPreferences f229797k;

    /* renamed from: l */
    private final String f229798l;

    /* renamed from: m */
    private final C68214a f229799m;

    /* renamed from: n */
    private final C68214a f229800n;

    /* renamed from: o */
    private final Object f229801o = new Object();

    /* renamed from: p */
    private final C68214a f229802p;

    /* renamed from: q */
    private final C68214a f229803q;

    /* renamed from: r */
    private final C68214a f229804r;

    /* renamed from: s */
    private C84431am f229805s;

    /* renamed from: t */
    private C85852aj f229806t;

    public C84444k(Context context, String str, C90929bz bzVar, C22871g gVar, C22871g gVar2, C68214a aVar, C86130z zVar, C86124t tVar, C84413ad adVar, SharedPreferences sharedPreferences, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        C86124t tVar2 = tVar;
        C84413ad adVar2 = adVar;
        this.f229791e = context;
        this.f229798l = str;
        this.f229792f = bzVar;
        this.f229788a = gVar;
        this.f229793g = gVar2;
        this.f229794h = adVar2;
        this.f229795i = tVar2;
        this.f229796j = zVar;
        this.f229789b = aVar;
        this.f229797k = sharedPreferences;
        this.f229799m = aVar2;
        this.f229800n = aVar3;
        this.f229802p = aVar4;
        this.f229803q = aVar5;
        this.f229804r = aVar6;
        if (zVar.mo79767g(R.bool.icing_sources_enabled)) {
            adVar2.mo77968e(gVar, new C84435b(this, aVar));
            adVar2.mo77967d(new C84436c(this, aVar));
            tVar2.mo79738i(new C84437d(gVar2, aVar, tVar2));
        }
    }

    /* renamed from: a */
    public final bg mo77984a() {
        return (bg) this.f229799m.mo27525b();
    }

    /* renamed from: b */
    public final C85852aj mo77985b() {
        C85852aj ajVar;
        synchronized (this.f229801o) {
            if (this.f229806t == null) {
                C21471s sVar = (C21471s) this.f229802p.mo27525b();
                C21478z zVar = (C21478z) this.f229803q.mo27525b();
                this.f229806t = new C85853ak(this.f229791e, (C84425ag) this.f229789b.mo27525b());
            }
            ajVar = this.f229806t;
        }
        return ajVar;
    }

    /* renamed from: c */
    public final C84425ag mo77986c() {
        return (C84425ag) this.f229789b.mo27525b();
    }

    /* renamed from: e */
    public final C84426ah mo77987e() {
        return (C84426ah) this.f229804r.mo27525b();
    }

    /* renamed from: f */
    public final C84431am mo77988f() {
        C84431am amVar;
        synchronized (this.f229801o) {
            if (this.f229805s == null) {
                SharedPreferences sharedPreferences = this.f229797k;
                C84432an anVar = new C84432an(this.f229791e, this.f229796j, new C84462c(this.f229798l), sharedPreferences, this.f229795i);
                C84433ao aoVar = new C84433ao(this.f229791e, sharedPreferences, this.f229795i);
                if (!this.f229796j.mo79767g(R.bool.icing_sources_enabled)) {
                    ((C59052c) ((C59052c) f229787d.mo56224b()).mo56372aa(9256)).mo56386p("All icing sources disabled");
                } else {
                    aoVar.mo78011b(anVar.mo78014a((GetGlobalSearchSourcesCall$GlobalSearchSource) null));
                    C91052l lVar = new C91052l(this.f229792f, new C84441h(this, aoVar, anVar, sharedPreferences));
                    ((C86054o) this.f229800n.mo27525b()).mo79675i(new C84442i(this, lVar));
                    this.f229794h.mo77967d(new C84438e(this, aoVar, lVar));
                    this.f229794h.mo77968e(this.f229788a, new C84439f(this, aoVar, lVar));
                    C84443j jVar = new C84443j(this, aoVar, anVar, lVar);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.icing.GlobalSearchAppRegistered3");
                    intentFilter.addAction("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
                    this.f229791e.getApplicationContext().registerReceiver(jVar, intentFilter);
                    this.f229793g.mo28212l("push-icing-flags", new C84434ap((C84425ag) this.f229789b.mo27525b(), this.f229795i));
                }
                this.f229805s = aoVar;
            }
            amVar = this.f229805s;
        }
        return amVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo78022g(C84431am amVar, C91043j jVar, int i) {
        if (mo78023h(i)) {
            ((C84425ag) this.f229789b.mo27525b()).mo77999f(true);
            ((C84425ag) this.f229789b.mo27525b()).mo77994b(jVar);
            return;
        }
        amVar.mo78012c();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("IcingComponentsImpl");
        fVar.mo85285l((C90964a) this.f229789b.mo27525b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo78023h(int i) {
        return i == 0 && this.f229796j.mo79767g(R.bool.icing_sources_enabled);
    }
}
