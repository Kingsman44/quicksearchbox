package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.gcm.a.e;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7881nk;
import com.google.p375ai.p378b.C7882nl;
import com.google.p375ai.p378b.C7884nn;
import com.google.p375ai.p378b.C7885no;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7887nq;
import com.google.p375ai.p378b.C7891nu;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7963ql;
import com.google.p375ai.p378b.p380b.C7542c;
import com.google.p375ai.p378b.p380b.C7545f;
import com.google.p375ai.p378b.p380b.C7546g;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.av */
/* compiled from: PG */
public final class C85637av {

    /* renamed from: a */
    public static final C59071e f231462a = C59071e.m91332i("com.google.android.apps.gsa.search.core.av");

    /* renamed from: b */
    public final C68214a f231463b;

    /* renamed from: c */
    public final C85651bb f231464c;

    /* renamed from: d */
    private final C90929bz f231465d;

    /* renamed from: e */
    private final C91376f f231466e;

    /* renamed from: f */
    private final C86319j f231467f;

    /* renamed from: g */
    private final SharedPreferences f231468g;

    /* renamed from: h */
    private final e f231469h;

    /* renamed from: i */
    private final C68214a f231470i;

    /* renamed from: j */
    private final C68214a f231471j;

    public C85637av(C90929bz bzVar, C68214a aVar, C91376f fVar, C86319j jVar, C85651bb bbVar, SharedPreferences sharedPreferences, e eVar, C68214a aVar2, C68214a aVar3) {
        this.f231465d = bzVar;
        this.f231463b = aVar;
        this.f231466e = fVar;
        this.f231467f = jVar;
        this.f231464c = bbVar;
        this.f231468g = sharedPreferences;
        this.f231469h = eVar;
        this.f231470i = aVar2;
        this.f231471j = aVar3;
    }

    /* renamed from: a */
    public final List mo79115a(C7882nl nlVar) {
        try {
            C7950pz pzVar = (C7950pz) C91763c.m150327a(C7642eo.OPT_IN).toBuilder();
            pzVar.copyOnWrite();
            C7952qa qaVar = (C7952qa) pzVar.instance;
            qaVar.f27920a |= 1;
            qaVar.f27921b = true;
            pzVar.copyOnWrite();
            C7952qa qaVar2 = (C7952qa) pzVar.instance;
            nlVar.getClass();
            qaVar2.f27929j = nlVar;
            qaVar2.f27920a |= 2048;
            C7963ql qlVar = this.f231466e.mo85696a((C7952qa) pzVar.build(), C91376f.f254951b).f254946a;
            if (qlVar == null) {
                C59104x c = f231462a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NowOptInHelper");
                ((C59052c) ((C59052c) c).mo56372aa(7409)).mo56386p("Network error while attempting to opt-in.");
                return null;
            } else if ((qlVar.f27971a & 64) != 0) {
                C7884nn nnVar = qlVar.f27976f;
                if (nnVar == null) {
                    nnVar = C7884nn.f27661b;
                }
                return nnVar.f27663a;
            } else {
                C59104x c2 = f231462a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NowOptInHelper");
                ((C59052c) ((C59052c) c2).mo56372aa(7408)).mo56386p("No opt in response was returned from server.");
                return null;
            }
        } catch (Exception e) {
            C59104x c3 = f231462a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "NowOptInHelper");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(7407)).mo56386p("Exception while attempting to authenticate");
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo79116b(Account account, C7891nu nuVar) {
        return mo79118d(account, 26, C7880nj.AUTO_ACTIVATION, nuVar, true);
    }

    /* renamed from: c */
    public final boolean mo79117c(Account account, int i, int i2, C7880nj njVar, C7891nu nuVar, List list, List list2, boolean z) {
        C90748e.m148224b();
        list.getClass();
        if (!((Boolean) C60856cj.m92910s(this.f231465d.mo85145j(new C85636au(this, account)))).booleanValue()) {
            return false;
        }
        C7881nk nkVar = (C7881nk) C7882nl.f27651i.createBuilder();
        nkVar.copyOnWrite();
        C7882nl nlVar = (C7882nl) nkVar.instance;
        nlVar.f27654b = njVar.f27650D;
        nlVar.f27653a |= 1;
        nkVar.copyOnWrite();
        C7882nl nlVar2 = (C7882nl) nkVar.instance;
        int i3 = 2;
        nlVar2.f27653a |= 2;
        nlVar2.f27656d = i;
        nkVar.copyOnWrite();
        C7882nl nlVar3 = (C7882nl) nkVar.instance;
        if (i2 != 0) {
            nlVar3.f27657e = i2;
            nlVar3.f27653a |= 4;
            nkVar.copyOnWrite();
            C7882nl nlVar4 = (C7882nl) nkVar.instance;
            nlVar4.f27658f = nuVar.f27730O;
            nlVar4.f27653a |= 8;
            nkVar.copyOnWrite();
            C7882nl nlVar5 = (C7882nl) nkVar.instance;
            C62971cq cqVar = nlVar5.f27655c;
            if (!cqVar.mo58948c()) {
                nlVar5.f27655c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) nlVar5.f27655c);
            if (list2 != null) {
                nkVar.copyOnWrite();
                C7882nl nlVar6 = (C7882nl) nkVar.instance;
                C62971cq cqVar2 = nlVar6.f27659g;
                if (!cqVar2.mo58948c()) {
                    nlVar6.f27659g = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) list2, (List) nlVar6.f27659g);
            }
            List a = mo79115a((C7882nl) nkVar.build());
            if (a == null) {
                return false;
            }
            C7886np npVar = C7886np.GOOGLE_NOW_CARDS;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C7887nq) it.next()).f27683b == npVar.f27679o) {
                    this.f231464c.mo79152o(account.name, i, z);
                    if (!z || njVar == C7880nj.AUTO_ACTIVATION_SKIP) {
                        this.f231464c.mo79158u();
                    }
                    int i4 = this.f231468g.getInt("temp_units", -1);
                    if (i4 != -1) {
                        C86317h a2 = this.f231467f.mo80040a();
                        if (i4 == 0) {
                            i3 = 1;
                        }
                        a2.mo80038f(i3);
                    }
                    ((C91480f) this.f231470i.mo27525b()).mo85824d();
                    this.f231469h.d(account);
                    ((C91306ak) this.f231471j.mo27525b()).mo85598k();
                }
            }
            return true;
        }
        throw null;
    }

    /* renamed from: d */
    public final boolean mo79118d(Account account, int i, C7880nj njVar, C7891nu nuVar, boolean z) {
        C7885no noVar = (C7885no) C7887nq.f27680c.createBuilder();
        noVar.copyOnWrite();
        C7887nq nqVar = (C7887nq) noVar.instance;
        nqVar.f27682a |= 1;
        nqVar.f27683b = 7;
        if (mo79117c(account, 2, 4, njVar, nuVar, Collections.singletonList((C7887nq) noVar.build()), Collections.emptyList(), z)) {
            C58976aa aaVar = C58975e.f156826a;
            C7542c cVar = (C7542c) C7546g.f26108h.createBuilder();
            cVar.copyOnWrite();
            C7546g gVar = (C7546g) cVar.instance;
            gVar.f26111b = i;
            gVar.f26110a |= 1;
            cVar.copyOnWrite();
            C7546g gVar2 = (C7546g) cVar.instance;
            gVar2.f26113d = nuVar.f27730O;
            gVar2.f26110a |= 4;
            int a = C7545f.m22782a(4);
            if (a != 0) {
                cVar.copyOnWrite();
                C7546g gVar3 = (C7546g) cVar.instance;
                gVar3.f26114e = a;
                gVar3.f26110a |= 8;
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 163;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C7546g gVar4 = (C7546g) cVar.build();
            gVar4.getClass();
            ufVar2.f164072F = gVar4;
            ufVar2.f164146b |= 256;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return false;
    }
}
