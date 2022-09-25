package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.p */
/* compiled from: PG */
public final class C96862p implements C118549h {

    /* renamed from: a */
    public static final C59071e f270821a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bu.p");

    /* renamed from: b */
    public final String f270822b;

    /* renamed from: c */
    public final C29409fd f270823c;

    /* renamed from: d */
    public final Set f270824d;

    /* renamed from: e */
    public final Set f270825e;

    /* renamed from: f */
    private final C22871g f270826f;

    /* renamed from: g */
    private final C22871g f270827g;

    /* renamed from: h */
    private final C86054o f270828h;

    /* renamed from: i */
    private final C58495hd f270829i;

    /* renamed from: j */
    private final C58485gu f270830j;

    public C96862p(String str, Set set, Set set2, C29409fd fdVar, Map map, Map map2, Set set3, C22871g gVar, C22871g gVar2, C86054o oVar) {
        this.f270822b = str;
        this.f270823c = fdVar;
        C96754a aVar = C96754a.f270637a;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55433l((Map) Collection.EL.stream(map.entrySet()).collect(C58370cn.m89403c(C96850d.f270805a, C96851e.f270806a, aVar)));
        gzVar.mo55433l((Map) Collection.EL.stream(map2.entrySet()).collect(C58370cn.m89403c(C96852f.f270807a, C96851e.f270806a, aVar)));
        gzVar.mo55432k((Iterable) Collection.EL.stream(set3).map(C96853g.f270808a).collect(C58370cn.f155946a));
        this.f270829i = gzVar.mo55427f(false);
        this.f270830j = (C58485gu) Collection.EL.stream(map.keySet()).map(C96854h.f270809a).collect(C58370cn.f155946a);
        this.f270826f = gVar;
        this.f270827g = gVar2;
        this.f270824d = set;
        this.f270825e = set2;
        this.f270828h = oVar;
    }

    /* renamed from: c */
    private final C60870cx m160473c(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65753ak akVar = (C65753ak) it.next();
            if (this.f270829i.containsKey(akVar)) {
                e.mo55395g((C28746bx) this.f270829i.get(akVar));
            }
        }
        C60870cx b = this.f270826f.mo28202b("[MDD] Refresh GDD Populators", new C96855i(this, e.mo55394f()));
        C96860n nVar = new C96860n();
        C60856cj.m92911t(b, C47810es.m84974n(nVar), C60826bg.f164896a);
        return b;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m160474d() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f270822b
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            switch(r1) {
                case -2105562759: goto L_0x002a;
                case -1202768674: goto L_0x0020;
                case -69128772: goto L_0x0016;
                case 437964371: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r1 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0016:
            java.lang.String r1 = "MDD.CHARGING.PERIODIC.TASK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            if (r0 == r3) goto L_0x003a
            return r2
        L_0x003a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7565bu.C96862p.m160474d():boolean");
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C96833az.f270792i);
        akVar.mo58887l(r0);
        if (akVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C96833az.f270792i);
            akVar.mo58887l(r02);
            Object l = akVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C96833az azVar = (C96833az) obj;
            C60870cx i = C60856cj.m92900i(C58485gu.m89845m());
            if (m160474d()) {
                C62963cj cjVar = new C62963cj(azVar.f270795b, C96833az.f270790c);
                long j = azVar.f270799g;
                i = m160473c(cjVar);
                this.f270827g.mo28211k(i, "[MDD] AgsaMddBackgroundTask.notify (one-off)", new C96859m(this, j));
            }
            if (!azVar.f270796d || azVar.f270797e.isEmpty()) {
                return C118826c.m197213c(i);
            }
            C58833ax j2 = C58833ax.m90833j(this.f270828h.mo79668a());
            if (!j2.mo56113h()) {
                return C118826c.m197213c(this.f270827g.mo28210j(i, "[MDD] download group in foreground", new C96856j(this, azVar)));
            }
            return C118826c.m197213c(this.f270827g.mo28210j(i, "[MDD] download group in foreground", new C96857k(this, azVar, j2)));
        }
        C60870cx i2 = C60856cj.m92900i(C58485gu.m89845m());
        if (m160474d()) {
            i2 = m160473c(this.f270830j);
        }
        return this.f270827g.mo28209i(this.f270827g.mo28205e(C118826c.m197213c(this.f270826f.mo28210j(i2, "[MDD] handle periodic task", new C96858l(this))), "[MDD] AgsaMddBackgroundTask.notifyFailed (periodic)", Exception.class, new C96834b(this)), "[MDD] AgsaMddBackgroundTask.notifyListeners (periodic)", new C96849c(this));
    }

    /* renamed from: b */
    public final C60870cx mo90365b(C96833az azVar, C58833ax axVar) {
        String str = azVar.f270797e;
        C29409fd fdVar = this.f270823c;
        C28739bq m = C28740br.m53599m();
        m.mo34338d(azVar.f270797e);
        int a = C96832ay.m160436a(azVar.f270798f);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            i = 2;
        }
        C29436g gVar = (C29436g) m;
        gVar.f79810j = i;
        gVar.f79802b = axVar;
        C60870cx d = fdVar.mo34715d(m.mo34335a());
        C96861o oVar = new C96861o(azVar);
        C60856cj.m92911t(d, C47810es.m84974n(oVar), C60826bg.f164896a);
        return d;
    }
}
