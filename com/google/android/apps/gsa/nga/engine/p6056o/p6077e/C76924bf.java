package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77427u;
import com.google.android.apps.gsa.nga.engine.p6056o.C77428v;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58889cz;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bf */
/* compiled from: PG */
public final class C76924bf implements C77428v, C77427u, k {

    /* renamed from: a */
    private final C58889cz f212386a;

    /* renamed from: b */
    private final C91142g f212387b;

    /* renamed from: c */
    private final q f212388c;

    /* renamed from: d */
    private C58247c f212389d;

    public C76924bf(C58889cz czVar, C91142g gVar, q qVar) {
        this.f212386a = czVar;
        this.f212387b = gVar;
        this.f212388c = qVar;
        m123553d();
    }

    /* renamed from: d */
    private final void m123553d() {
        Duration ofSeconds = Duration.ofSeconds(Math.max(0, this.f212387b.mo85399d(C90126fx.f251713nx)));
        C58254i iVar = new C58254i();
        iVar.mo54822f(ofSeconds.toMillis(), TimeUnit.MILLISECONDS);
        iVar.mo54824h(this.f212386a);
        this.f212389d = iVar.mo54817a();
    }

    /* renamed from: a */
    public final C58485gu mo72359a() {
        return (C58485gu) Collection.EL.stream(((C58206am) this.f212389d).f155647a.values()).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C76923be.f212385a))).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final void mo72360b(StatusBarNotification statusBarNotification) {
        if (!this.f212388c.c(statusBarNotification).isEmpty()) {
            if (!"jp.naver.line.android".equals(statusBarNotification.getPackageName()) || "NOTIFICATION_TAG_MESSAGE".equals(statusBarNotification.getTag())) {
                C58247c cVar = this.f212389d;
                ((C58206am) cVar).f155647a.put(statusBarNotification.getKey(), statusBarNotification);
            }
        }
    }

    /* renamed from: c */
    public final void mo72361c(StatusBarNotification statusBarNotification) {
        this.f212389d.mo54714d(statusBarNotification.getKey());
    }

    /* renamed from: gE */
    public final void mo72362gE(C58528ij ijVar) {
        if (ijVar.contains(Integer.valueOf(C90126fx.f251713nx.f250556a))) {
            m123553d();
        }
    }
}
