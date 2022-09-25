package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b;

import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95301g;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.c */
/* compiled from: PG */
public final class C124827c implements C124825a {

    /* renamed from: a */
    public static final C59071e f344384a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.c");

    /* renamed from: g */
    private static final C58528ij f344385g = C58528ij.m90012L("000018d1-00005033", "legacy-bt", "legacy-wired");

    /* renamed from: b */
    public final C60103kw f344386b;

    /* renamed from: c */
    public final C60298nk f344387c;

    /* renamed from: d */
    public boolean f344388d;

    /* renamed from: e */
    public final Instant f344389e;

    /* renamed from: f */
    public boolean f344390f = false;

    /* renamed from: h */
    private final C60950i f344391h;

    /* renamed from: i */
    private final C95301g f344392i;

    public C124827c(C60950i iVar, C95301g gVar, Optional optional, Optional optional2, Optional optional3) {
        this.f344391h = iVar;
        this.f344392i = gVar;
        this.f344388d = false;
        if (optional.isPresent()) {
            C124829e eVar = (C124829e) optional.get();
            C63042fg fgVar = eVar.f344397c;
            this.f344389e = C62950b.m95474e(fgVar == null ? C63042fg.f170152c : fgVar);
            C60300nm nmVar = eVar.f344396b;
            C60298nk nkVar = (C60298nk) (nmVar == null ? C60300nm.f163138H : nmVar).toBuilder();
            this.f344387c = nkVar;
            C60106kz kzVar = ((C60300nm) nkVar.instance).f163163q;
            this.f344386b = (C60103kw) (kzVar == null ? C60106kz.f162531p : kzVar).toBuilder();
            return;
        }
        this.f344389e = iVar.mo57444a();
        this.f344386b = (C60103kw) C60106kz.f162531p.createBuilder();
        this.f344387c = (C60298nk) C60300nm.f163138H.createBuilder();
        optional2.ifPresent(new C124826b(this, optional3));
    }

    /* renamed from: e */
    private static void m204614e(C60291nd ndVar, String str, boolean z) {
        try {
            int parseInt = Integer.parseInt(str, 16);
            ndVar.copyOnWrite();
            C60292ne neVar = (C60292ne) ndVar.instance;
            C60292ne neVar2 = C60292ne.f163113l;
            neVar.f163115a |= 32;
            neVar.f163118d = parseInt;
        } catch (NumberFormatException unused) {
            if (f344385g.contains(str) || z) {
                ndVar.copyOnWrite();
                C60292ne neVar3 = (C60292ne) ndVar.instance;
                C60292ne neVar4 = C60292ne.f163113l;
                str.getClass();
                neVar3.f163115a |= 128;
                neVar3.f163120f = str;
                return;
            }
            C59104x b = f344384a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) b).mo56372aa(36367)).mo56386p("Cannot parse model id");
        }
    }

    /* renamed from: a */
    public final void mo106661a(boolean z) {
        if (this.f344388d) {
            C59104x d = f344384a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) d).mo56372aa(36364)).mo56389s("session previously ended %b", Boolean.valueOf(((C60106kz) this.f344386b.instance).f162535c));
            if (((C60106kz) this.f344386b.instance).f162535c) {
                return;
            }
        }
        if (z) {
            C60103kw kwVar = this.f344386b;
            kwVar.copyOnWrite();
            C60106kz kzVar = (C60106kz) kwVar.instance;
            C60106kz kzVar2 = C60106kz.f162531p;
            kzVar.f162533a |= 8;
            kzVar.f162535c = true;
        }
        Duration between = Duration.between(this.f344389e, this.f344391h.mo57444a());
        C60103kw kwVar2 = this.f344386b;
        long millis = between.toMillis();
        kwVar2.copyOnWrite();
        C60106kz kzVar3 = (C60106kz) kwVar2.instance;
        C60106kz kzVar4 = C60106kz.f162531p;
        kzVar3.f162533a |= 2;
        kzVar3.f162534b = (int) millis;
        C60298nk nkVar = this.f344387c;
        C60103kw kwVar3 = this.f344386b;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60106kz kzVar5 = (C60106kz) kwVar3.build();
        C60300nm nmVar2 = C60300nm.f163138H;
        kzVar5.getClass();
        nmVar.f163163q = kzVar5;
        nmVar.f163147a |= 268435456;
        C60298nk nkVar2 = this.f344387c;
        C95301g gVar = this.f344392i;
        String x = gVar.f266666d.mo79758x(C90122ft.f250879r);
        if (x != null) {
            nkVar2.copyOnWrite();
            C60300nm nmVar3 = (C60300nm) nkVar2.instance;
            nmVar3.f163147a |= 1048576;
            nmVar3.f163157k = x;
        }
        gVar.f266663a.mo89822a(nkVar2);
        C58976aa aaVar = C58975e.f156826a;
        Objects.requireNonNull(this.f344387c);
        this.f344388d = true;
    }

    /* renamed from: b */
    public final void mo106662b(String str) {
        C59104x b = f344384a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
        ((C59052c) ((C59052c) b).mo56372aa(36365)).mo56389s("logOobeScreen %s", str);
        this.f344386b.mo57066b(str);
    }

    /* renamed from: c */
    public final C60291nd mo106663c(String str, C124679cr crVar) {
        C60291nd ndVar = (C60291nd) C60292ne.f163113l.createBuilder();
        if (this.f344390f && !C58837ba.m90859h(str)) {
            m204614e(ndVar, str, true);
        } else if (crVar != null && (crVar.f343958a & 32) != 0) {
            m204614e(ndVar, crVar.f343964g, true);
        } else if (!C58837ba.m90859h(str)) {
            m204614e(ndVar, str, false);
        } else {
            C59104x b = f344384a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) b).mo56372aa(36362)).mo56389s("modelId is missing %s", str);
        }
        if (crVar != null) {
            if ((crVar.f343958a & 512) != 0) {
                String str2 = crVar.f343968k;
                ndVar.copyOnWrite();
                C60292ne neVar = (C60292ne) ndVar.instance;
                str2.getClass();
                neVar.f163115a |= 16;
                neVar.f163117c = str2;
            }
            if ((crVar.f343958a & 1024) != 0) {
                String str3 = crVar.f343969l;
                ndVar.copyOnWrite();
                C60292ne neVar2 = (C60292ne) ndVar.instance;
                str3.getClass();
                neVar2.f163115a |= 64;
                neVar2.f163119e = str3;
            }
        }
        C95301g gVar = this.f344392i;
        C95311q.m157571e(gVar.f266665c, gVar.f266664b, ndVar);
        return ndVar;
    }

    /* renamed from: d */
    public final void mo106664d(C60291nd ndVar) {
        C60298nk nkVar = this.f344387c;
        C60292ne neVar = ((C60300nm) nkVar.instance).f163151e;
        if (neVar == null) {
            neVar = C60292ne.f163113l;
        }
        C60291nd ndVar2 = (C60291nd) neVar.toBuilder();
        ndVar2.mergeFrom((C60292ne) ndVar.build());
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60292ne neVar2 = (C60292ne) ndVar2.build();
        neVar2.getClass();
        nmVar.f163151e = neVar2;
        nmVar.f163147a |= 512;
    }
}
