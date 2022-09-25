package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95851b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60099ks;
import com.google.common.p4552o.C60102kv;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60105ky;
import com.google.common.p4552o.C60106kz;
import com.google.common.p4552o.C60227la;
import com.google.common.p4552o.C60228lb;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.e */
/* compiled from: PG */
public final class C95299e {

    /* renamed from: a */
    public static final C59071e f266645a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.f.e");

    /* renamed from: h */
    private static final C58528ij f266646h = C58528ij.m90012L("000018d1-00005033", "legacy-bt", "legacy-wired");

    /* renamed from: b */
    public final C60103kw f266647b;

    /* renamed from: c */
    public String f266648c;

    /* renamed from: d */
    public boolean f266649d = true;

    /* renamed from: e */
    public int f266650e;

    /* renamed from: f */
    public final AtomicBoolean f266651f = new AtomicBoolean(false);

    /* renamed from: g */
    public boolean f266652g = false;

    /* renamed from: i */
    private final C95851b f266653i;

    /* renamed from: j */
    private final C21370a f266654j;

    /* renamed from: k */
    private final C60298nk f266655k;

    /* renamed from: l */
    private long f266656l;

    /* renamed from: m */
    private final C89656k f266657m;

    /* renamed from: n */
    private final C84516aa f266658n;

    public C95299e(C21370a aVar, C95851b bVar, C89656k kVar, C84516aa aaVar) {
        this.f266654j = aVar;
        this.f266653i = bVar;
        this.f266657m = kVar;
        this.f266658n = aaVar;
        this.f266647b = (C60103kw) C60106kz.f162531p.createBuilder();
        this.f266655k = (C60298nk) C60300nm.f163138H.createBuilder();
        this.f266648c = String.valueOf(C90719ac.f253778a.mo85083a());
    }

    /* renamed from: a */
    public final C60291nd mo89231a(String str, C124548d dVar) {
        C60291nd ndVar = (C60291nd) C60292ne.f163113l.createBuilder();
        if (C58837ba.m90859h(str)) {
            C59104x b = f266645a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) b).mo56372aa(14849)).mo56389s("modelId is missing %s", str);
        } else {
            try {
                int parseInt = Integer.parseInt(str, 16);
                ndVar.copyOnWrite();
                C60292ne neVar = (C60292ne) ndVar.instance;
                neVar.f163115a |= 32;
                neVar.f163118d = parseInt;
            } catch (NumberFormatException unused) {
                if (f266646h.contains(str) || this.f266652g) {
                    ndVar.copyOnWrite();
                    C60292ne neVar2 = (C60292ne) ndVar.instance;
                    str.getClass();
                    neVar2.f163115a |= 128;
                    neVar2.f163120f = str;
                } else {
                    C59104x b2 = f266645a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                    ((C59052c) ((C59052c) b2).mo56372aa(14848)).mo56386p("Cannot parse model id");
                }
            }
        }
        if (dVar != null) {
            String M = dVar.mo106472M();
            if (M != null) {
                ndVar.copyOnWrite();
                C60292ne neVar3 = (C60292ne) ndVar.instance;
                neVar3.f163115a |= 16;
                neVar3.f163117c = M;
            }
            String S = dVar.mo106478S();
            if (S != null) {
                ndVar.copyOnWrite();
                C60292ne neVar4 = (C60292ne) ndVar.instance;
                neVar4.f163115a |= 64;
                neVar4.f163119e = S;
            }
        }
        C95311q.m157571e(this.f266658n, this.f266657m, ndVar);
        return ndVar;
    }

    /* renamed from: b */
    public final void mo89232b(boolean z) {
        if (this.f266649d) {
            C59104x d = f266645a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) d).mo56372aa(14852)).mo56355H("session previously ended %s %b", this.f266648c, ((C60106kz) this.f266647b.instance).f162535c);
            if (((C60106kz) this.f266647b.instance).f162535c) {
                return;
            }
        }
        if (z) {
            C60103kw kwVar = this.f266647b;
            kwVar.copyOnWrite();
            C60106kz kzVar = (C60106kz) kwVar.instance;
            C60106kz kzVar2 = C60106kz.f162531p;
            kzVar.f162533a |= 8;
            kzVar.f162535c = true;
        }
        long b = this.f266654j.mo26870b();
        long j = this.f266656l;
        C60103kw kwVar2 = this.f266647b;
        kwVar2.copyOnWrite();
        C60106kz kzVar3 = (C60106kz) kwVar2.instance;
        C60106kz kzVar4 = C60106kz.f162531p;
        kzVar3.f162533a |= 2;
        kzVar3.f162534b = (int) (b - j);
        C60298nk nkVar = this.f266655k;
        C60103kw kwVar3 = this.f266647b;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60106kz kzVar5 = (C60106kz) kwVar3.build();
        C60300nm nmVar2 = C60300nm.f163138H;
        kzVar5.getClass();
        nmVar.f163163q = kzVar5;
        nmVar.f163147a |= 268435456;
        C58976aa aaVar = C58975e.f156826a;
        Objects.requireNonNull(this.f266655k);
        mo89234d(this.f266655k);
        this.f266649d = true;
    }

    /* renamed from: c */
    public final void mo89233c(String str, C124548d dVar, C60105ky kyVar) {
        this.f266651f.set(true);
        this.f266649d = false;
        this.f266650e = 1;
        this.f266656l = this.f266654j.mo26870b();
        this.f266647b.clear();
        this.f266655k.clear();
        C60291nd a = mo89231a(str, dVar);
        C60298nk nkVar = this.f266655k;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60292ne neVar = (C60292ne) a.build();
        C60300nm nmVar2 = C60300nm.f163138H;
        neVar.getClass();
        nmVar.f163151e = neVar;
        nmVar.f163147a |= 512;
        C60103kw kwVar = this.f266647b;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162541i = kyVar.f162530s;
        kzVar.f162533a |= 2048;
    }

    /* renamed from: d */
    public final void mo89234d(C60298nk nkVar) {
        String c = this.f266657m.mo83548c("user_group_name");
        if (c != null) {
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60300nm nmVar2 = C60300nm.f163138H;
            nmVar.f163147a |= 1048576;
            nmVar.f163157k = c;
        }
        this.f266653i.mo89822a(nkVar);
    }

    /* renamed from: e */
    public final void mo89235e(String str, C124548d dVar, boolean z) {
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60291nd a = mo89231a(str, dVar);
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60292ne neVar = (C60292ne) a.build();
        neVar.getClass();
        nmVar.f163151e = neVar;
        nmVar.f163147a |= 512;
        C60227la laVar = (C60227la) C60228lb.f162953c.createBuilder();
        laVar.copyOnWrite();
        C60228lb lbVar = (C60228lb) laVar.instance;
        lbVar.f162955a |= 1;
        lbVar.f162956b = z;
        nkVar.copyOnWrite();
        C60300nm nmVar2 = (C60300nm) nkVar.instance;
        C60228lb lbVar2 = (C60228lb) laVar.build();
        lbVar2.getClass();
        nmVar2.f163167u = lbVar2;
        nmVar2.f163148b |= 4;
        mo89234d(nkVar);
    }

    /* renamed from: f */
    public final void mo89236f(C60292ne neVar) {
        C60292ne neVar2 = ((C60300nm) this.f266655k.instance).f163151e;
        if (neVar2 == null) {
            neVar2 = C60292ne.f163113l;
        }
        C60291nd ndVar = (C60291nd) neVar2.toBuilder();
        if ((neVar.f163115a & 32) != 0 && (neVar2.f163115a & 32) == 0) {
            int i = neVar.f163118d;
            ndVar.copyOnWrite();
            C60292ne neVar3 = (C60292ne) ndVar.instance;
            neVar3.f163115a |= 32;
            neVar3.f163118d = i;
        }
        if ((neVar.f163115a & 128) != 0 && (neVar2.f163115a & 128) == 0) {
            String str = neVar.f163120f;
            ndVar.copyOnWrite();
            C60292ne neVar4 = (C60292ne) ndVar.instance;
            str.getClass();
            neVar4.f163115a |= 128;
            neVar4.f163120f = str;
        }
        C60298nk nkVar = this.f266655k;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60292ne neVar5 = (C60292ne) ndVar.build();
        neVar5.getClass();
        nmVar.f163151e = neVar5;
        nmVar.f163147a |= 512;
    }

    /* renamed from: g */
    public final void mo89237g(int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C60103kw kwVar = this.f266647b;
        C60099ks ksVar = (C60099ks) C60102kv.f162504e.createBuilder();
        ksVar.copyOnWrite();
        C60102kv kvVar = (C60102kv) ksVar.instance;
        kvVar.f162506a |= 2;
        kvVar.f162508c = z;
        ksVar.copyOnWrite();
        C60102kv kvVar2 = (C60102kv) ksVar.instance;
        kvVar2.f162507b = i - 1;
        kvVar2.f162506a |= 1;
        kwVar.mo57065a(ksVar);
    }
}
