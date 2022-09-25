package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7148ui.C90667d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.cards.C91691f;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104429af;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.as */
/* compiled from: PG */
public final class C104317as {

    /* renamed from: a */
    public static final C59071e f290184a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.as");

    /* renamed from: b */
    public final C8194z f290185b;

    /* renamed from: c */
    public final C7718hj f290186c;

    /* renamed from: d */
    public final Context f290187d;

    /* renamed from: e */
    public final boolean f290188e;

    /* renamed from: f */
    public final C91728l f290189f;

    /* renamed from: g */
    public final C91713a f290190g;

    /* renamed from: h */
    public final C90667d f290191h;

    /* renamed from: i */
    public final Object f290192i = new Object();

    /* renamed from: j */
    private final C89291a f290193j;

    /* renamed from: k */
    private final C91647a f290194k;

    /* renamed from: l */
    private final C91692g f290195l;

    /* renamed from: m */
    private final boolean f290196m;

    /* renamed from: n */
    private final C104348l f290197n;

    /* renamed from: o */
    private final C104337bl f290198o;

    /* renamed from: p */
    private final boolean f290199p;

    /* renamed from: q */
    private final View f290200q;

    /* renamed from: r */
    private final C91671j f290201r;

    /* renamed from: s */
    private final C91857e f290202s;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C91691f mo94077a() {
        if (this.f290188e) {
            Context context = this.f290187d;
            C91692g gVar = this.f290195l;
            C104348l lVar = this.f290197n;
            C91857e eVar = this.f290202s;
            eVar.getClass();
            return new C104332bg(context, gVar, lVar, eVar, (String) null, lVar.f290320o, (C104429af) null, lVar.f290321p, lVar.f290322q, lVar.f290323r, lVar.f290325t, this.f290198o, this.f290200q);
        }
        Context context2 = this.f290187d;
        C91692g gVar2 = this.f290195l;
        C104348l lVar2 = this.f290197n;
        C91671j jVar = this.f290201r;
        jVar.getClass();
        return new C104328bc(context2, gVar2, lVar2, jVar, this.f290199p);
    }

    public C104317as(C8194z zVar, boolean z, C7718hj hjVar, Context context, View view, C91671j jVar, C104348l lVar, C91857e eVar, C90667d dVar, boolean z2, C89291a aVar, C91728l lVar2, C91713a aVar2, C91647a aVar3, C91692g gVar, C104337bl blVar, boolean z3) {
        C91671j jVar2 = jVar;
        boolean z4 = z2;
        this.f290196m = z;
        this.f290185b = zVar;
        this.f290186c = hjVar;
        this.f290187d = context;
        this.f290200q = view;
        this.f290193j = aVar;
        this.f290188e = z4;
        this.f290189f = lVar2;
        this.f290190g = aVar2;
        this.f290194k = aVar3;
        this.f290195l = gVar;
        this.f290191h = dVar;
        this.f290197n = lVar;
        this.f290201r = jVar2;
        this.f290199p = z3;
        this.f290202s = eVar;
        this.f290198o = blVar;
        if (z4) {
            eVar.getClass();
        } else if (jVar2 == null) {
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo94078b() {
        C8194z zVar = this.f290185b;
        if (zVar != null) {
            int i = zVar.f28779a;
            if ((i & 4) != 0 && this.f290196m) {
                C7718hj hjVar = this.f290186c;
                C7536ax axVar = zVar.f28782d;
                if (axVar == null) {
                    axVar = C7536ax.f26084o;
                }
                boolean z = false;
                boolean z2 = !zVar.f28783e || !this.f290188e;
                C7708h hVar = null;
                for (C7708h hVar2 : hjVar.f26935G) {
                    C7681g a = C7681g.m22802a(hVar2.f26897b);
                    if (a == null) {
                        a = C7681g.INVALID;
                    }
                    C7681g a2 = C7681g.m22802a(axVar.f26090e);
                    if (a2 == null) {
                        a2 = C7681g.DETAILS;
                    }
                    if (a == a2) {
                        C9141ad g = C91992k.m150979g(this.f290187d, this.f290193j, false, axVar);
                        if (g != null) {
                            mo94077a().mo86200g(g);
                        }
                        if (z2) {
                            if (g == null || (g.f31535a & 8) == 0) {
                                C91647a aVar = this.f290194k;
                                C7681g a3 = C7681g.m22802a(hVar2.f26897b);
                                if (a3 == null) {
                                    a3 = C7681g.INVALID;
                                }
                                aVar.mo85968c(hjVar, a3, (C7526an) null);
                            } else {
                                C91647a aVar2 = this.f290194k;
                                C7681g a4 = C7681g.m22802a(hVar2.f26897b);
                                if (a4 == null) {
                                    a4 = C7681g.INVALID;
                                }
                                C7526an anVar = g.f31540f;
                                if (anVar == null) {
                                    anVar = C7526an.f26049l;
                                }
                                aVar2.mo85968c(hjVar, a4, anVar);
                            }
                        }
                        hVar = hVar2;
                    }
                }
                if (hVar == null) {
                    ((C59052c) ((C59052c) f290184a.mo56226d()).mo56372aa(21944)).mo56386p("No entryAction handled.");
                    int i2 = C90755l.f253831a;
                    return;
                }
                C90667d dVar = this.f290191h;
                if (dVar != null) {
                    if (zVar.f28783e || hVar.f26906k) {
                        z = true;
                    }
                    dVar.mo84964a(zVar, z, true);
                }
                if (hVar.f26902g) {
                    this.f290190g.mo86208b(C7642eo.OTHER);
                }
            } else if ((i & 2) != 0) {
                C91728l lVar = this.f290189f;
                C7918ou ouVar = zVar.f28781c;
                if (ouVar == null) {
                    ouVar = C7918ou.f27824h;
                }
                lVar.mo86223j(ouVar, new C104316ar(this));
            } else {
                C90667d dVar2 = this.f290191h;
                if (dVar2 != null) {
                    dVar2.mo84964a(zVar, zVar.f28783e, true);
                }
            }
        }
    }
}
