package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123991o;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69238d;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bi */
/* compiled from: PG */
public final class C124081bi {

    /* renamed from: a */
    public static final C59071e f342709a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.i.bi");

    /* renamed from: b */
    public final Context f342710b;

    /* renamed from: c */
    public final AccountId f342711c;

    /* renamed from: d */
    public final C124048ad f342712d;

    /* renamed from: e */
    public final C60887da f342713e;

    /* renamed from: f */
    public final C123991o f342714f;

    /* renamed from: g */
    public final C124013j f342715g;

    /* renamed from: h */
    public final C60950i f342716h;

    /* renamed from: i */
    public final boolean f342717i;

    /* renamed from: j */
    public final C124108cg f342718j;

    /* renamed from: k */
    private final C46175b f342719k;

    /* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bi$a */
    /* compiled from: PG */
    public interface C124082a {
        /* renamed from: ac */
        C124081bi mo106278ac();
    }

    public C124081bi(Context context, AccountId accountId, C124048ad adVar, C46175b bVar, C60887da daVar, C123991o oVar, C124013j jVar, C60950i iVar, boolean z, C124108cg cgVar) {
        this.f342710b = context;
        this.f342711c = accountId;
        this.f342712d = adVar;
        this.f342719k = bVar;
        this.f342713e = daVar;
        this.f342714f = oVar;
        this.f342715g = jVar;
        this.f342716h = iVar;
        this.f342717i = z;
        this.f342718j = cgVar;
    }

    /* renamed from: i */
    private final C60870cx m203498i(C53306j jVar, C123777f fVar, C58485gu guVar, boolean z, Optional optional) {
        C60870cx cxVar;
        if (z) {
            cxVar = mo106276g(optional, jVar, fVar, guVar);
        } else {
            cxVar = mo106274e(optional, jVar, fVar, guVar);
        }
        C60870cx cxVar2 = cxVar;
        C58526ih ihVar = new C58526ih();
        return C47638k.m84751b(cxVar2).mo51520a(new C124075bc(this, new LinkedHashSet(), guVar, cxVar2, optional, ihVar), this.f342713e);
    }

    /* renamed from: a */
    public final C58485gu mo106270a(C123623b bVar, List list, C53306j jVar, C123777f fVar) {
        C58485gu c = this.f342712d.mo106250c(jVar, list, true);
        C58485gu c2 = this.f342712d.mo106250c(jVar, list, false);
        C58480gp e = C58485gu.m89837e();
        if (!c.isEmpty()) {
            e.mo55395g(bVar.mo106077d(jVar, c, fVar));
        }
        if (!c2.isEmpty()) {
            e.mo55395g(bVar.f341552d.mo106061e(bVar.f341550b, jVar, fVar, c2, true));
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final C58485gu mo106271b(List list, C53306j jVar, boolean z, C123755bv bvVar, Optional optional, C123777f fVar) {
        List list2 = list;
        C53306j jVar2 = jVar;
        Optional optional2 = optional;
        C58485gu d = mo106273d(optional2, jVar, list, true);
        C58485gu d2 = mo106273d(optional2, jVar, list, false);
        ArrayList arrayList = new ArrayList();
        if (!d.isEmpty()) {
            arrayList.add(m203498i(jVar, fVar, d, true, optional));
        }
        if (!d2.isEmpty()) {
            arrayList.add(m203498i(jVar, fVar, d2, false, optional));
        }
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(C47636i.m84743b(arrayList).mo51519b(new C124064as(this, arrayList, z, jVar, bvVar, fVar, optional), this.f342713e));
        return e.mo55394f();
    }

    /* renamed from: c */
    public final C58485gu mo106272c(C123623b bVar, List list, C53306j jVar, C123777f fVar) {
        C58485gu c = this.f342712d.mo106250c(jVar, list, true);
        C58485gu c2 = this.f342712d.mo106250c(jVar, list, false);
        C58480gp e = C58485gu.m89837e();
        if (!c.isEmpty()) {
            e.mo55395g(bVar.f341552d.mo106064h(bVar.f341550b, jVar, fVar, c, false));
        }
        if (!c2.isEmpty()) {
            e.mo55395g(bVar.f341552d.mo106061e(bVar.f341550b, jVar, fVar, c2, false));
        }
        return e.mo55394f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C58485gu mo106273d(Optional optional, C53306j jVar, List list, boolean z) {
        if (optional.isPresent()) {
            return C124048ad.m203471a(this.f342710b, (AccountId) optional.get()).mo106250c(jVar, list, z);
        }
        return this.f342718j.mo106288a(list, z);
    }

    /* renamed from: e */
    public final C60870cx mo106274e(Optional optional, C53306j jVar, C123777f fVar, List list) {
        if (!optional.isPresent()) {
            return C123624c.m202993b(this.f342710b).mo106072b(jVar, fVar, list);
        }
        C123623b a = C123624c.m202992a(this.f342710b, (AccountId) optional.get());
        return a.f341552d.mo106062f(a.f341550b, jVar, fVar, list);
    }

    /* renamed from: f */
    public final C60870cx mo106275f(C53306j jVar, Set set, boolean z, C123755bv bvVar, C123777f fVar, boolean z2) {
        C53306j jVar2 = jVar;
        Set<Integer> e = set.isEmpty() ? this.f342712d.mo106252e(jVar) : set;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C69238d dVar = (C69238d) this.f342712d.f342627a.get(jVar);
        dVar.getClass();
        if (dVar.f185337a) {
            arrayList2.addAll(e);
        } else {
            C58485gu b = this.f342712d.mo106249b(jVar);
            for (Integer num : e) {
                if (b.contains(num)) {
                    arrayList.add(num);
                } else {
                    arrayList2.add(num);
                }
            }
        }
        return C60922j.m93045h(this.f342719k.mo50248e(), C47810es.m84966f(new C124074bb(this, arrayList, arrayList2, z2, jVar, z, bvVar, fVar, e)), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo106276g(Optional optional, C53306j jVar, C123777f fVar, List list) {
        if (optional.isPresent()) {
            C123623b a = C123624c.m202992a(this.f342710b, (AccountId) optional.get());
            C59104x b = C123623b.f341549a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.AccountDatabaseHelper");
            ((C59052c) ((C59052c) b).mo56372aa(35167)).mo56354G("#getProactiveDataForClientWithFreshness for client type %s and proactive data type %s", jVar, list);
            return a.f341552d.mo106063g(a.f341550b, jVar, fVar, list);
        }
        C123615ah b2 = C123624c.m202993b(this.f342710b);
        return b2.f341542c.mo106063g(b2.f341541b, jVar, fVar, list);
    }

    /* renamed from: h */
    public final List mo106277h(C53306j jVar, Map map, Map map2, Optional optional) {
        C123744bk bkVar;
        int a;
        boolean z;
        Map map3 = map2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(map2.keySet());
        for (Map.Entry entry : map.entrySet()) {
            C123744bk a2 = C123612ae.m202967a(((C123744bk) entry.getKey()).f341810e, ((C123744bk) entry.getKey()).f341812g);
            if (!map3.containsKey(a2)) {
                C123743bj bjVar = (C123743bj) ((C123744bk) entry.getKey()).toBuilder();
                bjVar.copyOnWrite();
                C123744bk bkVar2 = (C123744bk) bjVar.instance;
                bkVar2.f341815j = 1;
                bkVar2.f341807b = 4 | bkVar2.f341807b;
                bkVar = (C123744bk) bjVar.build();
                C53306j jVar2 = jVar;
            } else {
                Integer valueOf = Integer.valueOf(a2.f341810e);
                C123732az azVar = (C123732az) map3.get(a2);
                C123732az azVar2 = (C123732az) entry.getValue();
                int intValue = C124089bo.m203513a(valueOf).intValue();
                if (optional.isPresent()) {
                    z = C124048ad.m203471a(this.f342710b, (AccountId) optional.get()).mo106250c(jVar, C58485gu.m89846n(Integer.valueOf(intValue)), true).isEmpty();
                } else {
                    C53306j jVar3 = jVar;
                    z = this.f342718j.mo106288a(C58485gu.m89846n(Integer.valueOf(intValue)), true).isEmpty();
                }
                if ((!(!z) || azVar.f341774b.equals(azVar2.f341774b)) && azVar.f341775c.equals(azVar2.f341775c)) {
                    C123743bj bjVar2 = (C123743bj) ((C123744bk) entry.getKey()).toBuilder();
                    bjVar2.copyOnWrite();
                    C123744bk bkVar3 = (C123744bk) bjVar2.instance;
                    bkVar3.f341815j = 4;
                    bkVar3.f341807b = 4 | bkVar3.f341807b;
                    bkVar = (C123744bk) bjVar2.build();
                } else {
                    C123743bj bjVar3 = (C123743bj) ((C123744bk) entry.getKey()).toBuilder();
                    bjVar3.copyOnWrite();
                    C123744bk bkVar4 = (C123744bk) bjVar3.instance;
                    bkVar4.f341815j = 2;
                    bkVar4.f341807b = 4 | bkVar4.f341807b;
                    bkVar = (C123744bk) bjVar3.build();
                }
            }
            arrayList.add(bkVar);
            int i = bkVar.f341815j;
            int a3 = C123774cn.m203111a(i);
            if ((a3 != 0 && a3 == 3) || ((a = C123774cn.m203111a(i)) != 0 && a == 5)) {
                arrayList2.remove(a2);
            }
        }
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C123743bj bjVar4 = (C123743bj) ((C123744bk) arrayList2.get(i2)).toBuilder();
                bjVar4.copyOnWrite();
                C123744bk bkVar5 = (C123744bk) bjVar4.instance;
                bkVar5.f341815j = 3;
                bkVar5.f341807b |= 4;
                arrayList.add((C123744bk) bjVar4.build());
            }
        }
        return arrayList;
    }
}
