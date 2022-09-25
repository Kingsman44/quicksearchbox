package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123913k;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124116cn;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124166o;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.w */
/* compiled from: PG */
public final class C123878w implements C123913k {

    /* renamed from: j */
    public static final /* synthetic */ int f342177j = 0;

    /* renamed from: k */
    private static final Duration f342178k = Duration.ofHours(1);

    /* renamed from: a */
    public final C123827a f342179a;

    /* renamed from: b */
    public final Context f342180b;

    /* renamed from: c */
    public final Executor f342181c;

    /* renamed from: d */
    public final C124166o f342182d;

    /* renamed from: e */
    public final Duration f342183e;

    /* renamed from: f */
    public final C60950i f342184f;

    /* renamed from: g */
    public final Duration f342185g;

    /* renamed from: h */
    public final C124100bz f342186h;

    /* renamed from: i */
    public final C58974d f342187i;

    /* renamed from: l */
    private final Executor f342188l;

    /* renamed from: m */
    private final long f342189m;

    /* renamed from: n */
    private final Queue f342190n = new ArrayDeque();

    public C123878w(C123827a aVar, Context context, Executor executor, Executor executor2, C124166o oVar, C60950i iVar, long j, long j2, C62910ar arVar, C124100bz bzVar, C130603a aVar2) {
        this.f342179a = aVar;
        this.f342180b = context;
        this.f342188l = executor;
        this.f342181c = executor2;
        this.f342182d = oVar;
        this.f342184f = iVar;
        this.f342189m = j;
        this.f342183e = Duration.ofDays(j2);
        this.f342185g = Duration.ofSeconds(arVar.f169860a);
        this.f342186h = bzVar;
        this.f342187i = aVar2.mo109739a("PCP.LocalCalendar");
    }

    /* renamed from: b */
    public static C58485gu m203183b() {
        return C58485gu.m89847o(C53306j.OPA_SMARTSPACE, C53306j.BLUECHIP_SMARTSPACE_TNG);
    }

    /* renamed from: c */
    static List m203184c(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C123787p pVar = (C123787p) it.next();
            String valueOf = String.valueOf(pVar.f341951b);
            if (!map.containsKey(valueOf)) {
                arrayList.add(pVar);
            } else if (!Arrays.equals(C124116cn.m203541a(pVar), (byte[]) map.get(valueOf))) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo106151a() {
        Instant a = this.f342184f.mo57444a();
        while (!this.f342190n.isEmpty()) {
            Instant instant = (Instant) this.f342190n.peek();
            instant.getClass();
            if (!instant.plus(f342178k).isBefore(a)) {
                break;
            }
            this.f342190n.poll();
        }
        if (((long) this.f342190n.size()) < this.f342189m) {
            this.f342190n.add(a);
            C31520m c = C31167ax.m58112a().mo36912c();
            C123862g gVar = new C123862g(this);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(gVar), this.f342181c);
            C123863h hVar = new C123863h(this);
            C60870cx h = C60922j.m93045h(n, C47810es.m84966f(hVar), this.f342181c);
            C123867l lVar = new C123867l(this, c);
            C60856cj.m92911t(h, C47810es.m84974n(lVar), this.f342188l);
            return h;
        }
        C95883aa.m158983d(this.f342187i.mo56226d(), "PCP LocalCalendarDataController fetch throttled", 35279, C38505d.f101863a, Integer.valueOf(C89885b.PCP_CALENDAR_REFRESH_THROTTLED_VALUE));
        return C60866ct.f164955a;
    }
}
