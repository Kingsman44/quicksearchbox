package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130809k;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130702a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3860as.C49802p;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayDeque;
import java.util.Deque;
import p3186j$.time.Duration;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.bh */
/* compiled from: PG */
public final class C130771bh implements C130809k {

    /* renamed from: a */
    public static final /* synthetic */ int f357984a = 0;

    /* renamed from: b */
    private static final Duration f357985b = Duration.ofHours(3);

    /* renamed from: c */
    private static final Duration f357986c = Duration.ofHours(3);

    /* renamed from: d */
    private final C58974d f357987d = C58974d.m91136j();

    /* renamed from: e */
    private final C130702a f357988e;

    /* renamed from: f */
    private final C60887da f357989f;

    /* renamed from: g */
    private final C60950i f357990g;

    /* renamed from: h */
    private final Deque f357991h = new ArrayDeque();

    public C130771bh(C130702a aVar, C60887da daVar, C60950i iVar) {
        this.f357988e = aVar;
        this.f357989f = daVar;
        this.f357990g = iVar;
    }

    /* renamed from: e */
    private static C58485gu m213148e(C49802p pVar, LocalDate localDate) {
        return (C58485gu) Collection.EL.stream(pVar.f128647a).filter(new C130758av(localDate)).flatMap(C130762az.f357970a).map(new C130764ba(localDate)).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    private static C58485gu m213149f(C49802p pVar, LocalDate localDate) {
        return (C58485gu) Collection.EL.stream(pVar.f128647a).filter(new C130759aw(localDate)).flatMap(C130760ax.f357968a).map(new C130761ay(localDate)).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    private static C58714pg m213150g(LocalDateTime localDateTime, Duration duration) {
        return C58714pg.m90504g(localDateTime.minus(duration), localDateTime.plus(duration));
    }

    /* renamed from: a */
    public final C60870cx mo109813a() {
        LocalDateTime c = this.f357990g.mo57446c(ZoneId.systemDefault());
        C60870cx a = this.f357988e.mo109798a();
        C130755as asVar = new C130755as(this, c);
        return C60922j.m93044g(a, C47810es.m84963c(asVar), this.f357989f);
    }

    /* renamed from: b */
    public final C60870cx mo109814b() {
        LocalDateTime c = this.f357990g.mo57446c(ZoneId.systemDefault());
        C60870cx a = this.f357988e.mo109798a();
        C130753aq aqVar = new C130753aq(this, c);
        return C60922j.m93044g(a, C47810es.m84963c(aqVar), this.f357989f);
    }

    /* renamed from: c */
    public final C130769bf mo109815c(C49802p pVar, LocalDateTime localDateTime) {
        C130769bf bfVar;
        C58714pg g = m213150g(localDateTime, f357985b);
        LocalDate localDate = localDateTime.mo43126j();
        double sum = Stream.CC.concat(Collection.EL.stream(m213149f(pVar, localDate)), Collection.EL.stream(m213149f(pVar, localDate.plusDays(1)))).filter(new C130767bd(g)).mapToDouble(C130766bc.f357974a).sum();
        C58714pg g2 = m213150g(localDateTime, f357986c);
        LocalDate localDate2 = localDateTime.mo43126j();
        double sum2 = Stream.CC.concat(Collection.EL.stream(m213148e(pVar, localDate2.minusDays(1))), Collection.EL.stream(m213148e(pVar, localDate2))).filter(new C130765bb(g2)).mapToDouble(C130766bc.f357974a).sum();
        if (sum > sum2 && sum >= 0.5d) {
            bfVar = C130769bf.MORNING;
        } else if (sum2 <= sum || sum2 < 0.5d) {
            bfVar = C130769bf.NONE;
        } else {
            bfVar = C130769bf.EVENING;
        }
        mo109816d(localDateTime, "Timestamp %s | morning %.2f | evening %.2f result %s", localDateTime, Double.valueOf(sum), Double.valueOf(sum2), bfVar);
        return bfVar;
    }

    /* renamed from: d */
    public final void mo109816d(LocalDateTime localDateTime, String str, Object... objArr) {
        synchronized (this) {
            for (LocalDateTime between : this.f357991h) {
                if (Duration.between(between, localDateTime).abs().compareTo(Duration.ofSeconds(10)) < 0) {
                    return;
                }
            }
            this.f357991h.addLast(localDateTime);
            while (this.f357991h.size() > 10) {
                this.f357991h.removeFirst();
            }
            ((C58970a) ((C58970a) this.f357987d.mo56224b()).mo56372aa(38970)).mo56368U(str, objArr);
        }
    }
}
