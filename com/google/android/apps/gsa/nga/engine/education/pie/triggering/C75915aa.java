package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75830bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80182ac;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80183ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80215bi;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.aa */
/* compiled from: PG */
public final class C75915aa extends C75934at {

    /* renamed from: a */
    public static final C58974d f210622a = C58974d.m91136j();

    /* renamed from: b */
    public static final Duration f210623b = Duration.ofSeconds(5);

    /* renamed from: c */
    public final Context f210624c;

    /* renamed from: d */
    public final C22871g f210625d;

    /* renamed from: e */
    public final C60950i f210626e;

    /* renamed from: f */
    public final C83305i f210627f;

    /* renamed from: g */
    public final AtomicBoolean f210628g = new AtomicBoolean(false);

    /* renamed from: h */
    public BroadcastReceiver f210629h;

    /* renamed from: i */
    public C75933as f210630i = C75933as.m122459d().mo71963a();

    public C75915aa(Context context, C75910k kVar, C75830bd bdVar, C22871g gVar, C60950i iVar, C83305i iVar2) {
        super(kVar, bdVar);
        this.f210624c = context;
        this.f210625d = gVar;
        this.f210626e = iVar;
        this.f210627f = iVar2;
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        C80215bi biVar;
        C80215bi biVar2;
        C80183ad adVar;
        C80215bi biVar3;
        C80215bi biVar4;
        if (axVar.f220049a == 6) {
            biVar = (C80215bi) axVar.f220050b;
        } else {
            biVar = C80215bi.f220083d;
        }
        C80213bg bgVar = biVar.f220087c;
        if (bgVar == null) {
            bgVar = C80213bg.f220077e;
        }
        if (bgVar.f220080b == 5) {
            if (axVar.f220049a == 6) {
                biVar2 = (C80215bi) axVar.f220050b;
            } else {
                biVar2 = C80215bi.f220083d;
            }
            C80213bg bgVar2 = biVar2.f220087c;
            if (bgVar2 == null) {
                bgVar2 = C80213bg.f220077e;
            }
            if (bgVar2.f220080b == 5) {
                adVar = (C80183ad) bgVar2.f220081c;
            } else {
                adVar = C80183ad.f220000d;
            }
            int a = C80182ac.m128091a(adVar.f220003b);
            if (a != 0 && a == 2) {
                int i = axVar.f220049a;
                if (i == 6) {
                    biVar3 = (C80215bi) axVar.f220050b;
                } else {
                    biVar3 = C80215bi.f220083d;
                }
                C80213bg bgVar3 = biVar3.f220087c;
                if (bgVar3 == null) {
                    bgVar3 = C80213bg.f220077e;
                }
                if (i == 6) {
                    biVar4 = (C80215bi) axVar.f220050b;
                } else {
                    biVar4 = C80215bi.f220083d;
                }
                C80248co a2 = C80248co.m128104a(biVar4.f220086b);
                if (a2 == null) {
                    a2 = C80248co.USECASE_TYPE_UNKNOWN;
                }
                mo71956d(bgVar3, a2);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo71956d(C80213bg bgVar, C80248co coVar) {
        C75933as asVar = this.f210630i;
        C58459fv fvVar = new C58459fv(asVar.mo71967b());
        Set h = fvVar.mo54986h(coVar);
        if (h != null) {
            Collection.EL.stream(h).filter(new C75930ap(bgVar)).findFirst().ifPresent(new C75931aq(fvVar, coVar));
        }
        fvVar.mo54920x(coVar, bgVar);
        C75932ar a = asVar.mo71966a();
        a.mo71965c(fvVar);
        this.f210630i = a.mo71963a();
        coVar.name();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.gmm.NAVIGATION_STATE");
        if (this.f210629h == null) {
            C75970z zVar = new C75970z(this);
            this.f210629h = zVar;
            this.f210624c.registerReceiver(zVar, intentFilter);
        }
    }
}
