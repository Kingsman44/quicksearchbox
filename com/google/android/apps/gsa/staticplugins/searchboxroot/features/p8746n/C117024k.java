package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import android.content.Context;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84426ah;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88541a;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C116850e;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17013j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.k */
/* compiled from: PG */
public final class C117024k implements Elector {

    /* renamed from: a */
    public final Context f324878a;

    /* renamed from: b */
    public final C21370a f324879b;

    /* renamed from: c */
    public final C86124t f324880c;

    /* renamed from: d */
    public final C68214a f324881d;

    /* renamed from: e */
    public final C117025g f324882e;

    /* renamed from: f */
    public final C116850e f324883f;

    /* renamed from: g */
    public final C68214a f324884g;

    /* renamed from: h */
    public final C86130z f324885h;

    /* renamed from: i */
    public final C68214a f324886i;

    /* renamed from: j */
    public final C68214a f324887j;

    /* renamed from: k */
    public final C68214a f324888k;

    /* renamed from: l */
    public final C68214a f324889l;

    /* renamed from: m */
    public final C68214a f324890m;

    /* renamed from: n */
    public final C68214a f324891n;

    /* renamed from: o */
    public final C68214a f324892o;

    /* renamed from: p */
    public final C22871g f324893p;

    /* renamed from: q */
    public final C86054o f324894q;

    /* renamed from: r */
    public final i f324895r;

    /* renamed from: s */
    public final C68214a f324896s;

    /* renamed from: t */
    public final C68214a f324897t;

    /* renamed from: u */
    public final C68214a f324898u;

    /* renamed from: v */
    public final C84474e f324899v;

    /* renamed from: w */
    public final C17013j f324900w;

    /* renamed from: x */
    private final C68214a f324901x;

    /* renamed from: y */
    private final C88541a f324902y;

    /* renamed from: z */
    private C117022i f324903z = null;

    public C117024k(Context context, C21370a aVar, C86124t tVar, C84474e eVar, C68214a aVar2, C86130z zVar, C117025g gVar, C116850e eVar2, C68214a aVar3, C68214a aVar4, C86054o oVar, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, i iVar, C22871g gVar2, C68214a aVar12, C68214a aVar13, C68214a aVar14, C17013j jVar) {
        this.f324878a = context;
        this.f324879b = aVar;
        this.f324880c = tVar;
        this.f324899v = eVar;
        this.f324881d = aVar2;
        this.f324885h = zVar;
        this.f324882e = gVar;
        this.f324883f = eVar2;
        this.f324884g = aVar3;
        this.f324886i = aVar4;
        this.f324894q = oVar;
        this.f324901x = aVar5;
        this.f324887j = aVar6;
        this.f324888k = aVar7;
        this.f324889l = aVar8;
        this.f324902y = new C88541a();
        this.f324890m = aVar9;
        this.f324891n = aVar10;
        this.f324892o = aVar11;
        this.f324895r = iVar;
        this.f324893p = gVar2;
        this.f324896s = aVar12;
        this.f324897t = aVar13;
        this.f324898u = aVar14;
        this.f324900w = jVar;
    }

    /* renamed from: a */
    public final C117022i mo103103a() {
        C117022i iVar = this.f324903z;
        if (iVar != null) {
            return iVar;
        }
        C117022i iVar2 = new C117022i(this.f324882e, this.f324901x);
        this.f324903z = iVar2;
        return iVar2;
    }

    /* renamed from: b */
    public final void mo103104b(C88613q qVar) {
        C84426ah e;
        if (this.f324903z == null) {
            qVar.f239499a.mo55395g(mo103103a());
            qVar.mo82277f(this.f324902y);
            C84418a aVar = (C84418a) this.f324881d.mo27525b();
            if (aVar != null && (e = aVar.mo77987e()) != null) {
                qVar.mo82277f(e);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void setElections(Object obj) {
        C88613q qVar = (C88613q) obj;
    }
}
