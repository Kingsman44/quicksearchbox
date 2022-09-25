package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.staticplugins.p7765da.p7771f.C99316a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54462a;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54466c;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54472i;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54473j;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54480q;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54481r;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54484u;
import com.google.p4017at.p4086k.p4087a.p4088a.p4089a.C54485v;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57531a;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57583b;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57594bk;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57595bl;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57598bo;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57599bp;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57600bq;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57608by;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57612cb;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57613cc;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57614cd;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57646g;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57647h;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57651l;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57653n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.u */
/* compiled from: PG */
public final class C99313u implements C99316a {

    /* renamed from: a */
    public final C22871g f277772a;

    /* renamed from: b */
    private final C99295c f277773b;

    /* renamed from: c */
    private final C68214a f277774c;

    public C99313u(C99295c cVar, C22871g gVar, C68214a aVar) {
        this.f277773b = cVar;
        this.f277772a = gVar;
        this.f277774c = aVar;
    }

    /* renamed from: l */
    private final C60870cx m164687l(C54462a aVar, String str, String str2) {
        if (str != null) {
            aVar.copyOnWrite();
            C54466c cVar = (C54466c) aVar.instance;
            C54466c cVar2 = C54466c.f143013d;
            C62995dn dnVar = cVar.f143016b;
            if (!dnVar.f170058b) {
                cVar.f143016b = dnVar.mo58980a();
            }
            cVar.f143016b.put(0, str);
        }
        return this.f277772a.mo28209i(m164690o(str2, new C99299g(aVar)), "Get the list of SearchResults from response", C99300h.f277756a);
    }

    /* renamed from: m */
    private final C60870cx m164688m(C54481r rVar, String str) {
        return m164690o(str, new C99308p(rVar));
    }

    /* renamed from: n */
    private final C60870cx m164689n(C54485v vVar, String str) {
        return m164690o(str, new C99298f(vVar));
    }

    /* renamed from: o */
    private final C60870cx m164690o(String str, C99312t tVar) {
        return this.f277772a.mo28206f(mo91403d(str, tVar), "Retry network operation", RuntimeException.class, new C99307o(this, str, tVar));
    }

    /* renamed from: q */
    private final C54481r m164692q(C57663x xVar, String str, boolean z, int i) {
        C57594bk bkVar = (C57594bk) C57595bl.f153864e.createBuilder();
        bkVar.copyOnWrite();
        ((C57595bl) bkVar.instance).f153868c = true;
        C57601br j = mo91409j(i);
        bkVar.copyOnWrite();
        j.getClass();
        ((C57595bl) bkVar.instance).f153866a = j;
        if (xVar != null) {
            bkVar.copyOnWrite();
            ((C57595bl) bkVar.instance).f153867b = xVar;
        }
        if (z) {
            bkVar.copyOnWrite();
            ((C57595bl) bkVar.instance).f153869d = 2;
        }
        C54480q qVar = (C54480q) C54481r.f143043c.createBuilder();
        qVar.copyOnWrite();
        C57595bl blVar = (C57595bl) bkVar.build();
        blVar.getClass();
        ((C54481r) qVar.instance).f143045a = blVar;
        if (str != null) {
            qVar.copyOnWrite();
            ((C54481r) qVar.instance).f143046b = str;
        }
        return (C54481r) qVar.build();
    }

    /* renamed from: r */
    private final C54485v m164693r(C57566aj ajVar, Set set, String str, int i) {
        if (!set.isEmpty() || str != null) {
            C57598bo boVar = (C57598bo) C57599bp.f153875d.createBuilder();
            boVar.copyOnWrite();
            ajVar.getClass();
            ((C57599bp) boVar.instance).f153879c = ajVar;
            C57601br j = mo91409j(i);
            boVar.copyOnWrite();
            j.getClass();
            ((C57599bp) boVar.instance).f153877a = j;
            boVar.copyOnWrite();
            C57599bp bpVar = (C57599bp) boVar.instance;
            C62971cq cqVar = bpVar.f153878b;
            if (!cqVar.mo58948c()) {
                bpVar.f153878b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) set, (List) bpVar.f153878b);
            C57599bp bpVar2 = (C57599bp) boVar.build();
            C54484u uVar = (C54484u) C54485v.f143052c.createBuilder();
            uVar.copyOnWrite();
            bpVar2.getClass();
            ((C54485v) uVar.instance).f143054a = bpVar2;
            if (str != null) {
                uVar.copyOnWrite();
                ((C54485v) uVar.instance).f143055b = str;
            }
            return (C54485v) uVar.build();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final C60870cx mo91400a(C57566aj ajVar, C57569am amVar, C58833ax axVar, String str) {
        return m164687l(m164691p(ajVar, amVar, (String) null, 28), (String) axVar.mo56111f(), str);
    }

    /* renamed from: b */
    public final C60870cx mo91401b(String str, String str2) {
        C54472i iVar = (C54472i) C54473j.f143029b.createBuilder();
        C57651l lVar = (C57651l) C57653n.f153960d.createBuilder();
        C57601br j = mo91409j(28);
        lVar.copyOnWrite();
        j.getClass();
        ((C57653n) lVar.instance).f153962a = j;
        lVar.copyOnWrite();
        str.getClass();
        ((C57653n) lVar.instance).f153963b = str;
        long currentTimeMillis = System.currentTimeMillis();
        Random random = new Random();
        int nextInt = random.nextInt();
        int nextInt2 = random.nextInt();
        lVar.copyOnWrite();
        ((C57653n) lVar.instance).f153964c = "t_" + Integer.toString(Math.abs(nextInt), 36) + Long.toString(Math.abs(currentTimeMillis ^ ((long) nextInt2)), 36);
        iVar.copyOnWrite();
        C57653n nVar = (C57653n) lVar.build();
        nVar.getClass();
        ((C54473j) iVar.instance).f143031a = nVar;
        return this.f277772a.mo28209i(m164690o(str2, new C99303k((C54473j) iVar.build())), "Get ListProto from response", C99304l.f277760a);
    }

    /* renamed from: c */
    public final C60870cx mo91402c(C57572ap apVar, String str) {
        return this.f277772a.mo28209i(m164690o(str, new C99305m(this, apVar)), "Get ListProtos from ListListsResponse.", C99306n.f277763a);
    }

    /* renamed from: d */
    public final C60870cx mo91403d(String str, C99312t tVar) {
        C60870cx cxVar;
        C22871g gVar = this.f277772a;
        C99295c cVar = this.f277773b;
        if (C58837ba.m90859h(str)) {
            cxVar = cVar.mo91397a((String) null);
        } else {
            Account w = cVar.f277747a.mo79689w(str);
            if (w == null) {
                cxVar = C60856cj.m92899h(new C99315w(str.concat(" is not a known account name")));
            } else {
                cxVar = C60922j.m93045h(cVar.f277747a.mo79671e("oauth2:https://www.googleapis.com/auth/googlenow", w, new C91032p()), new C99293a(cVar), C60826bg.f164896a);
            }
        }
        return gVar.mo28210j(cxVar, "Apply responseFutureInterface", new C99311s(this, tVar));
    }

    /* renamed from: e */
    public final C60870cx mo91404e(C57663x xVar, String str) {
        return m164688m(m164692q(xVar, (String) null, false, 28), str);
    }

    /* renamed from: f */
    public final C60870cx mo91405f(C57566aj ajVar, Set set, String str) {
        return this.f277772a.mo28209i(m164689n(m164693r(ajVar, set, (String) null, 28), str), "transform RemoveItemsResponse to Done", C99297e.f277753a);
    }

    /* renamed from: g */
    public final C60870cx mo91406g(Set set, String str) {
        C57608by byVar = (C57608by) C57614cd.f153898e.createBuilder();
        C57601br j = mo91409j(28);
        byVar.copyOnWrite();
        j.getClass();
        ((C57614cd) byVar.instance).f153902c = j;
        byVar.copyOnWrite();
        ((C57614cd) byVar.instance).f153903d = 100;
        if (!set.isEmpty()) {
            C57612cb cbVar = (C57612cb) C57613cc.f153895b.createBuilder();
            C58565jt jtVar = new C58565jt(((C58759qy) set).f156534a);
            while (jtVar.hasNext()) {
                cbVar.mo54520a((C57665z) jtVar.next());
            }
            byVar.copyOnWrite();
            C57614cd cdVar = (C57614cd) byVar.instance;
            C57613cc ccVar = (C57613cc) cbVar.build();
            ccVar.getClass();
            cdVar.f153901b = ccVar;
            cdVar.f153900a = 2;
        }
        return this.f277772a.mo28209i(m164690o(str, new C99309q(byVar)), "Get the list of SearchResults from response", C99310r.f277769a);
    }

    /* renamed from: h */
    public final C60870cx mo91407h(String str, boolean z, String str2, int i) {
        return m164688m(m164692q((C57663x) null, str, z, i), str2);
    }

    /* renamed from: i */
    public final C60870cx mo91408i(C57566aj ajVar, String str, String str2, int i) {
        return m164689n(m164693r(ajVar, C58733pz.f156496a, str, i), str2);
    }

    /* renamed from: j */
    public final C57601br mo91409j(int i) {
        C57600bq bqVar = (C57600bq) C57601br.f153881b.createBuilder();
        C57646g gVar = (C57646g) C57648i.f153953c.createBuilder();
        gVar.copyOnWrite();
        ((C57648i) gVar.instance).f153955a = C57647h.m88510a(i);
        String str = (String) this.f277774c.mo27525b();
        gVar.copyOnWrite();
        str.getClass();
        ((C57648i) gVar.instance).f153956b = str;
        C57648i iVar = (C57648i) gVar.build();
        bqVar.copyOnWrite();
        iVar.getClass();
        ((C57601br) bqVar.instance).f153883a = iVar;
        return (C57601br) bqVar.build();
    }

    /* renamed from: k */
    public final C60870cx mo91410k(C57566aj ajVar, String str, String str2, int i) {
        return m164687l(m164691p(ajVar, (C57569am) null, str, i), (String) null, str2);
    }

    /* renamed from: p */
    private final C54462a m164691p(C57566aj ajVar, C57569am amVar, String str, int i) {
        if (amVar == null && str == null) {
            throw new IllegalArgumentException();
        }
        C57531a aVar = (C57531a) C57583b.f153841e.createBuilder();
        aVar.copyOnWrite();
        ((C57583b) aVar.instance).f153846d = 2;
        C57601br j = mo91409j(i);
        aVar.copyOnWrite();
        j.getClass();
        ((C57583b) aVar.instance).f153843a = j;
        aVar.copyOnWrite();
        ajVar.getClass();
        ((C57583b) aVar.instance).f153844b = ajVar;
        if (amVar != null) {
            aVar.mo54490a(amVar);
        }
        C54462a aVar2 = (C54462a) C54466c.f143013d.createBuilder();
        aVar2.copyOnWrite();
        C57583b bVar = (C57583b) aVar.build();
        bVar.getClass();
        ((C54466c) aVar2.instance).f143015a = bVar;
        if (str != null) {
            aVar2.copyOnWrite();
            ((C54466c) aVar2.instance).f143017c = str;
        }
        return aVar2;
    }
}
