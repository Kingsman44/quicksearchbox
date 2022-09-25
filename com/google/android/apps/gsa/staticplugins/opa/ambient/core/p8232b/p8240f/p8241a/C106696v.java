package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.C106617a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.C106703g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106727g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106728h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.assistant.p3860as.C49802p;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayDeque;
import java.util.Deque;
import p3186j$.time.Duration;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.v */
/* compiled from: PG */
public final class C106696v implements C106703g {

    /* renamed from: a */
    public final C106617a f297381a;

    /* renamed from: b */
    public final C60887da f297382b;

    /* renamed from: c */
    private final C58974d f297383c;

    /* renamed from: d */
    private final C106728h f297384d;

    /* renamed from: e */
    private final C86124t f297385e;

    /* renamed from: f */
    private final C60950i f297386f;

    /* renamed from: g */
    private final ZoneId f297387g;

    /* renamed from: h */
    private final Deque f297388h = new ArrayDeque();

    /* renamed from: i */
    private final C106601a f297389i;

    public C106696v(C106617a aVar, C60887da daVar, C86124t tVar, C106728h hVar, C60950i iVar, ZoneId zoneId, C106601a aVar2, C83564a aVar3) {
        this.f297381a = aVar;
        this.f297382b = daVar;
        this.f297385e = tVar;
        this.f297384d = hVar;
        this.f297386f = iVar;
        this.f297387g = zoneId;
        this.f297389i = aVar2;
        this.f297383c = aVar3.mo76901b(this);
    }

    /* renamed from: f */
    private static C58485gu m177439f(C49802p pVar, LocalDate localDate) {
        return (C58485gu) Collection.EL.stream(pVar.f128647a).filter(new C106681g(localDate)).flatMap(C106682h.f297354a).map(new C106683i(localDate)).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    private static C58485gu m177440g(C49802p pVar, LocalDate localDate) {
        return (C58485gu) Collection.EL.stream(pVar.f128647a).filter(new C106676b(localDate)).flatMap(C106677c.f297348a).map(new C106678d(localDate)).collect(C58370cn.f155946a);
    }

    /* renamed from: h */
    private static C58714pg m177441h(LocalDateTime localDateTime, Duration duration) {
        return C58714pg.m90504g(localDateTime.minus(duration), localDateTime.plus(duration));
    }

    /* renamed from: i */
    private final void m177442i(LocalDateTime localDateTime, String str, Object... objArr) {
        synchronized (this) {
            for (LocalDateTime between : this.f297388h) {
                if (Duration.between(between, localDateTime).abs().compareTo(Duration.ofSeconds(10)) < 0) {
                    return;
                }
            }
            this.f297388h.addLast(localDateTime);
            while (this.f297388h.size() > 10) {
                this.f297388h.removeFirst();
            }
            ((C58970a) ((C58970a) this.f297383c.mo56224b()).mo56372aa(23184)).mo56368U(str, objArr);
            this.f297389i.mo95587a(16, str, objArr);
        }
    }

    /* renamed from: a */
    public final C60870cx mo95613a() {
        LocalDateTime c = this.f297386f.mo57446c(this.f297387g);
        if (!this.f297385e.mo79746e(C90017bw.f248014cn)) {
            return C106727g.m177484a(this.f297384d, new C106679e(this, c), new C106686l(this, c), this.f297382b);
        }
        m177442i(c, "Semantic morning forced by flag.", new Object[0]);
        return C60856cj.m92900i(true);
    }

    /* renamed from: b */
    public final C60870cx mo95614b() {
        LocalDateTime c = this.f297386f.mo57446c(this.f297387g);
        if (!this.f297385e.mo79746e(C90017bw.f248013cm)) {
            return C106727g.m177484a(this.f297384d, new C106690p(this, c), new C106691q(this, c), this.f297382b);
        }
        m177442i(c, "Semantic evening forced by flag.", new Object[0]);
        return C60856cj.m92900i(true);
    }

    /* renamed from: c */
    public final C106694t mo95615c(C49802p pVar, LocalDateTime localDateTime) {
        C106694t tVar;
        double m = this.f297385e.mo79747m(C90017bw.f248016cp);
        Duration ofMinutes = Duration.ofMinutes(this.f297385e.mo79743a(C90017bw.f248015co));
        Duration ofMinutes2 = Duration.ofMinutes(this.f297385e.mo79743a(C90017bw.f248012cl));
        C58714pg h = m177441h(localDateTime, ofMinutes);
        LocalDate localDate = localDateTime.mo43126j();
        double sum = Stream.CC.concat(Collection.EL.stream(m177440g(pVar, localDate)), Collection.EL.stream(m177440g(pVar, localDate.plusDays(1)))).filter(new C106680f(h)).mapToDouble(C106675a.f297346a).sum();
        C58714pg h2 = m177441h(localDateTime, ofMinutes2);
        LocalDate localDate2 = localDateTime.mo43126j();
        double sum2 = Stream.CC.concat(Collection.EL.stream(m177439f(pVar, localDate2.minusDays(1))), Collection.EL.stream(m177439f(pVar, localDate2))).filter(new C106693s(h2)).mapToDouble(C106675a.f297346a).sum();
        if (sum > sum2 && sum >= m) {
            tVar = C106694t.MORNING;
        } else if (sum2 <= sum || sum2 < m) {
            tVar = C106694t.NONE;
        } else {
            tVar = C106694t.EVENING;
        }
        m177442i(localDateTime, "Timestamp %s | morning %.2f (radius: %s) | evening %.2f (radius %s) | trigger %.2f | result %s", localDateTime, Double.valueOf(sum), ofMinutes, Double.valueOf(sum2), ofMinutes2, Double.valueOf(m), tVar);
        return tVar;
    }

    /* renamed from: d */
    public final boolean mo95616d(LocalDateTime localDateTime) {
        long a = this.f297385e.mo79743a(C90017bw.f247996cE);
        long a2 = this.f297385e.mo79743a(C90017bw.f247995cD);
        LocalDateTime plusHours = localDateTime.mo43126j().atStartOfDay().plusHours(a);
        boolean z = localDateTime.isAfter(plusHours) && localDateTime.isBefore(plusHours.plusHours(a2));
        Object[] objArr = new Object[2];
        objArr[0] = localDateTime;
        objArr[1] = true != z ? "is not" : "is";
        m177442i(localDateTime, "Timestamp %s %s in the default morning interval.", objArr);
        return z;
    }

    /* renamed from: e */
    public final boolean mo95617e(LocalDateTime localDateTime) {
        long a = this.f297385e.mo79743a(C90017bw.f247998cG);
        long a2 = this.f297385e.mo79743a(C90017bw.f247997cF);
        LocalDateTime plusHours = localDateTime.mo43126j().atStartOfDay().plusHours(a);
        boolean z = localDateTime.isAfter(plusHours) && localDateTime.isBefore(plusHours.plusHours(a2));
        LocalDateTime plusHours2 = localDateTime.mo43126j().minusDays(1).atStartOfDay().plusHours(a);
        boolean z2 = z || (localDateTime.isAfter(plusHours2) && localDateTime.isBefore(plusHours2.plusHours(a2)));
        Object[] objArr = new Object[2];
        objArr[0] = localDateTime;
        objArr[1] = true != z2 ? "is not" : "is";
        m177442i(localDateTime, "Timestamp %s %s in the default evening interval.", objArr);
        return z2;
    }
}
