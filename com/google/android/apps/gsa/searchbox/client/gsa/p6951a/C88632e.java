package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.location.Location;
import android.util.Pair;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6792b.C85874e;
import com.google.android.apps.gsa.search.core.google.p6792b.C85876g;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6990an.C89208aa;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58832aw;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import dagger.C68214a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.e */
/* compiled from: PG */
public final class C88632e extends C90880an {

    /* renamed from: a */
    public String f239597a;

    /* renamed from: b */
    public long f239598b;

    /* renamed from: c */
    public int f239599c = 1;

    /* renamed from: d */
    public int f239600d = 1;

    /* renamed from: e */
    private final C86124t f239601e;

    /* renamed from: f */
    private final C84474e f239602f;

    /* renamed from: g */
    private final C86054o f239603g;

    /* renamed from: h */
    private final C88633f f239604h;

    /* renamed from: i */
    private final C21370a f239605i;

    /* renamed from: j */
    private final C74637ae f239606j;

    /* renamed from: k */
    private final C88644q f239607k;

    /* renamed from: l */
    private final C68214a f239608l;

    /* renamed from: m */
    private final C85171a f239609m;

    /* renamed from: n */
    private final C68214a f239610n;

    /* renamed from: o */
    private final C68214a f239611o;

    /* renamed from: p */
    private final C84486a f239612p;

    public C88632e(C86124t tVar, C84474e eVar, C84486a aVar, C86054o oVar, C68214a aVar2, C88633f fVar, C74637ae aeVar, C21370a aVar3, C88644q qVar, C85171a aVar4, C68214a aVar5, C68214a aVar6) {
        super("RefreshZeroPrefixSuggestions", 2, 12);
        this.f239601e = tVar;
        this.f239602f = eVar;
        this.f239612p = aVar;
        this.f239603g = oVar;
        this.f239608l = aVar2;
        this.f239604h = fVar;
        this.f239606j = aeVar;
        this.f239605i = aVar3;
        this.f239607k = qVar;
        this.f239609m = aVar4;
        this.f239610n = aVar5;
        this.f239611o = aVar6;
    }

    /* renamed from: b */
    private final void m143284b(C85876g gVar, Query query, int i) {
        int i2;
        int i3 = i;
        String F = this.f239603g.mo79659F();
        String str = this.f239597a;
        this.f239597a = null;
        HashMap hashMap = new HashMap();
        if (!(str == null || i3 == 7 || !((C86338r) this.f239610n.mo27525b()).getBoolean("signed_out_search", true))) {
            hashMap.put("pq", str);
            hashMap.put("pq_sec", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f239605i.mo26870b() - this.f239598b)));
        }
        if (!(i3 == 7 || (i2 = this.f239599c) == 1)) {
            int i4 = i2 - 1;
            if (i2 != 0) {
                hashMap.put("gs_pcrt", String.valueOf(i4));
            } else {
                throw null;
            }
        }
        if (this.f239601e.mo79746e(C90120fr.f250817ai) && this.f239602f.mo78070O() && ((long) ((C86338r) this.f239610n.mo27525b()).getInt("onboarding_num_searches_performed", 0)) < this.f239601e.mo79743a(C90120fr.f250816ah)) {
            hashMap.put("nolsbt", "1");
        }
        Query aS = !hashMap.isEmpty() ? query.mo84282aS(hashMap) : query;
        Location a = this.f239606j.mo71018a();
        long time = a != null ? a.getTime() : 0;
        C85874e c = gVar.mo79509c(aS, true);
        C54229ar arVar = c == null ? null : c.f232188c;
        if (arVar != null && C58832aw.m90831a(F, this.f239603g.mo79659F())) {
            C89208aa b = C88644q.m143296b(i);
            int i5 = this.f239599c;
            if (i5 != 0) {
                if (i5 == 2 || i5 == 8) {
                    C88644q qVar = this.f239607k;
                    ((C118831d) qVar.f239639b.mo6453a()).mo104025g(1);
                    Pair a2 = qVar.mo82297a(b, C54229ar.f142352d);
                    if (a2 != null && C58832aw.m90831a(a2.first, F) && a2.second != null && (((C88639l) a2.second).f239627a instanceof C54229ar) && C58832aw.m90831a(((C54229ar) ((C88639l) a2.second).f239627a).f142355b, arVar.f142355b)) {
                        ((C118831d) qVar.f239640c.mo6453a()).mo104025g(1);
                    }
                }
                ((C42876ab) this.f239611o.mo27525b()).mo46039a(new C88631d(this), C60826bg.f164896a);
                long b2 = this.f239605i.mo26870b();
                this.f239607k.mo82299e(b, F, arVar, b2, time);
                C54229ar arVar2 = arVar;
                this.f239604h.mo82295b(i, F, arVar, b2, time);
                if ((this.f239601e.mo79746e(C90085ej.f250103G) || this.f239612p.mo78205l()) && i3 == 1) {
                    this.f239609m.mo78773n();
                }
                if (i3 == 1 && !arVar2.f142355b.isEmpty()) {
                    this.f239609m.mo78777s(arVar2.f142355b);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C85876g gVar = (C85876g) this.f239608l.mo27525b();
        int i = this.f239600d;
        if (i == 1 || i == 2) {
            m143284b(gVar, Query.f252741b.mo84242E(), 1);
        }
        int i2 = this.f239600d;
        if (i2 != 1 && (i2 == 1 || i2 == 3)) {
            m143284b(gVar, Query.f252741b.mo84242E().mo84244G(true), 7);
        }
        return C118826c.f331422a;
    }
}
