package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6344g.C81067a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83321j;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import java.util.Iterator;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.ac */
/* compiled from: PG */
public final class C82201ac implements C83321j {

    /* renamed from: a */
    public static final Duration f224661a = Duration.ofSeconds(90);

    /* renamed from: b */
    private static final Duration f224662b = Duration.ofMinutes(15);

    /* renamed from: c */
    private final C60950i f224663c;

    /* renamed from: d */
    private Instant f224664d = Instant.MIN;

    /* renamed from: e */
    private final C81067a f224665e;

    public C82201ac(C60950i iVar) {
        this.f224663c = iVar;
        this.f224665e = new C81067a(1000);
    }

    /* renamed from: c */
    public static boolean m130520c(Instant instant, C82889ee eeVar, Duration duration) {
        return Duration.between(Instant.ofEpochMilli(eeVar.f226098c), instant).compareTo(duration) > 0;
    }

    /* renamed from: d */
    private final synchronized void m130521d(Instant instant) {
        Iterator it = this.f224665e.iterator();
        while (it.hasNext() && m130520c(instant, (C82889ee) it.next(), f224662b)) {
            it.remove();
        }
    }

    /* renamed from: a */
    public final synchronized C58485gu mo75541a(boolean z) {
        Instant a;
        a = this.f224663c.mo57444a();
        m130521d(a);
        return (C58485gu) Collection.EL.stream(this.f224665e).filter(new C82200ab(z, a)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final synchronized void mo75542b(C82889ee eeVar) {
        Instant a = this.f224663c.mo57444a();
        if (this.f224664d.isBefore(a)) {
            m130521d(a);
            this.f224664d = a.plus(f224661a);
        }
        this.f224665e.add(eeVar);
    }
}
