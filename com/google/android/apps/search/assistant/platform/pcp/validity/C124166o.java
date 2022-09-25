package com.google.android.apps.search.assistant.platform.pcp.validity;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123610ac;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123641r;
import com.google.android.apps.search.assistant.platform.pcp.p9328e.C123701a;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import dagger.C68214a;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.o */
/* compiled from: PG */
public final class C124166o implements C47102r, C124167p {

    /* renamed from: a */
    public final C123604t f342895a;

    /* renamed from: b */
    public final Context f342896b;

    /* renamed from: c */
    public final C21370a f342897c;

    /* renamed from: d */
    public final Executor f342898d;

    /* renamed from: e */
    public final C68214a f342899e;

    /* renamed from: f */
    public final C124100bz f342900f;

    /* renamed from: g */
    public final C62910ar f342901g;

    /* renamed from: h */
    public final C123615ah f342902h;

    /* renamed from: i */
    public final C46128f f342903i;

    /* renamed from: j */
    public final C123701a f342904j;

    /* renamed from: k */
    public final C62910ar f342905k;

    /* renamed from: l */
    public final boolean f342906l;

    /* renamed from: m */
    public final boolean f342907m;

    /* renamed from: n */
    public final C62910ar f342908n;

    /* renamed from: o */
    public final C58974d f342909o;

    /* renamed from: p */
    private final C46175b f342910p;

    /* renamed from: q */
    private final Executor f342911q;

    public C124166o(C123604t tVar, C46175b bVar, Context context, C21370a aVar, Executor executor, Executor executor2, C68214a aVar2, C124100bz bzVar, C46128f fVar, C123701a aVar3, C130603a aVar4, C62910ar arVar, C62910ar arVar2, boolean z, boolean z2, C62910ar arVar3) {
        this.f342895a = tVar;
        this.f342910p = bVar;
        this.f342896b = context;
        this.f342897c = aVar;
        this.f342898d = executor;
        this.f342911q = executor2;
        this.f342899e = aVar2;
        this.f342900f = bzVar;
        this.f342903i = fVar;
        this.f342904j = aVar3;
        C130603a aVar5 = aVar4;
        this.f342909o = aVar4.mo109740b(this);
        this.f342901g = arVar;
        this.f342905k = arVar2;
        this.f342906l = z;
        this.f342907m = z2;
        this.f342908n = arVar3;
        this.f342902h = C123624c.m202993b(context);
    }

    /* renamed from: g */
    public static void m203600g(Map map, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i2));
            map.put(valueOf, hashSet);
            return;
        }
        Set set = (Set) map.get(valueOf);
        set.getClass();
        if (set.add(Integer.valueOf(i2))) {
            map.put(valueOf, set);
        }
    }

    /* renamed from: a */
    public final C60870cx mo106308a(Optional optional, List list, Optional optional2, Optional optional3) {
        C42850e eVar;
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_id, data_type, client_type, contextual_triggering_condition FROM ClientProactiveData WHERE contextual_triggering_condition IS NOT NULL");
        if (optional2.isPresent()) {
            azVar.f112130a.append(" AND client_type = ? ");
            azVar.f112131b.add(Long.valueOf((long) ((C53306j) optional2.get()).f139793X));
        }
        if (optional3.isPresent()) {
            azVar.f112130a.append(" AND data_type = ? ");
            azVar.f112131b.add(Long.valueOf((long) ((Integer) optional3.get()).intValue()));
        }
        if (!list.isEmpty()) {
            azVar.f112130a.append(" AND data_id IN(?");
            azVar.f112131b.add((String) list.get(0));
            for (int i = 1; i < list.size(); i++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add((String) list.get(i));
            }
            azVar.f112130a.append(")");
        }
        if (optional.isPresent()) {
            eVar = C123624c.m202992a(this.f342896b, (AccountId) optional.get()).f341550b;
        } else {
            eVar = C123624c.m202993b(this.f342896b).f341541b;
        }
        C124157f fVar = new C124157f(this, eVar, azVar, optional);
        return C60856cj.m92905n(C47810es.m84965e(fVar), this.f342898d);
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        this.f342900f.f342762a.mo41704s("ALARM_TRIGGERED");
        return mo106309c();
    }

    /* renamed from: c */
    public final C60870cx mo106309c() {
        ((C58970a) ((C58970a) this.f342909o.mo56224b()).mo56372aa(35439)).mo56386p("processValidityUpdateForAllData");
        C31520m c = C31167ax.m58112a().mo36912c();
        C60870cx h = C60922j.m93045h(this.f342910p.mo50248e(), C47810es.m84966f(new C124159h(this)), this.f342898d);
        C124164m mVar = new C124164m(this, c);
        C60856cj.m92911t(h, C47810es.m84974n(mVar), this.f342911q);
        return h;
    }

    /* renamed from: d */
    public final C60870cx mo106310d(List list) {
        return mo106311e(list, C58485gu.m89845m());
    }

    /* renamed from: e */
    public final C60870cx mo106311e(List list, List list2) {
        C123615ah ahVar = this.f342902h;
        C123610ac acVar = ahVar.f341542c;
        C60870cx a = ahVar.f341541b.mo45937a(C123641r.f341572a);
        return C47638k.m84751b(a).mo51521b(new C124158g(this, a, list2, list), this.f342898d);
    }

    /* renamed from: f */
    public final C60870cx mo106312f(Optional optional, C124169r rVar, boolean z) {
        if (optional.isPresent()) {
            C124155d dVar = new C124155d(this, optional, rVar, z);
            return C60856cj.m92905n(C47810es.m84965e(dVar), this.f342898d);
        }
        C124156e eVar = new C124156e(this, rVar, z);
        return C60856cj.m92905n(C47810es.m84965e(eVar), this.f342898d);
    }

    /* renamed from: h */
    public final void mo106313h(C60870cx cxVar, C124169r rVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C124165n(this, rVar)), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final boolean mo106314i(Optional optional, int i, C53306j jVar) {
        if (optional.isPresent()) {
            C124048ad a = C124048ad.m203471a(this.f342896b, (AccountId) optional.get());
            if (!a.mo106255h(jVar) || !a.mo106249b(jVar).contains(Integer.valueOf(i))) {
                return false;
            }
            return true;
        } else if ((jVar.equals(C53306j.OPA_SMARTSPACE) || jVar.equals(C53306j.BLUECHIP_SMARTSPACE_TNG)) && i == 100003) {
            return true;
        } else {
            return false;
        }
    }
}
