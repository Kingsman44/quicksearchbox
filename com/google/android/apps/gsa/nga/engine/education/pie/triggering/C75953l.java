package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.ComponentName;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ag.b;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75830bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80206b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80212bf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80215bi;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.l */
/* compiled from: PG */
public final class C75953l extends C75934at implements b {

    /* renamed from: a */
    public static final C58974d f210739a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f210740b;

    /* renamed from: c */
    public final C60950i f210741c;

    /* renamed from: d */
    public final Map f210742d = new HashMap();

    /* renamed from: e */
    private final AtomicBoolean f210743e = new AtomicBoolean(false);

    /* renamed from: f */
    private String f210744f = BuildConfig.FLAVOR;

    public C75953l(C75910k kVar, C75830bd bdVar, C22871g gVar, C60950i iVar) {
        super(kVar, bdVar);
        this.f210740b = gVar;
        this.f210741c = iVar;
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        C80215bi biVar;
        C80215bi biVar2;
        C80215bi biVar3;
        if (axVar.f220049a == 6) {
            biVar = (C80215bi) axVar.f220050b;
        } else {
            biVar = C80215bi.f220083d;
        }
        C80213bg bgVar = biVar.f220087c;
        if (bgVar == null) {
            bgVar = C80213bg.f220077e;
        }
        if (bgVar.f220080b == 2) {
            int i = axVar.f220049a;
            if (i == 6) {
                biVar2 = (C80215bi) axVar.f220050b;
            } else {
                biVar2 = C80215bi.f220083d;
            }
            C80213bg bgVar2 = biVar2.f220087c;
            if (bgVar2 == null) {
                bgVar2 = C80213bg.f220077e;
            }
            if (i == 6) {
                biVar3 = (C80215bi) axVar.f220050b;
            } else {
                biVar3 = C80215bi.f220083d;
            }
            C80248co a = C80248co.m128104a(biVar3.f220086b);
            if (a == null) {
                a = C80248co.USECASE_TYPE_UNKNOWN;
            }
            if (!mo71977d(bgVar2, a)) {
                C80213bg bgVar3 = (axVar.f220049a == 6 ? (C80215bi) axVar.f220050b : C80215bi.f220083d).f220087c;
            }
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo71977d(C80213bg bgVar, C80248co coVar) {
        C80206b bVar;
        C80206b bVar2;
        C80206b bVar3;
        if (bgVar.f220080b == 2) {
            bVar = (C80206b) bgVar.f220081c;
        } else {
            bVar = C80206b.f220056c;
        }
        if (bVar.f220058a.isEmpty()) {
            ((C58970a) ((C58970a) f210739a.mo56225c()).mo56372aa(3439)).mo56386p("Empty app package name.");
            return false;
        }
        Map map = this.f210742d;
        if (bgVar.f220080b == 2) {
            bVar2 = (C80206b) bgVar.f220081c;
        } else {
            bVar2 = C80206b.f220056c;
        }
        C75933as asVar = (C75933as) Map.EL.getOrDefault(map, bVar2.f220058a, C75933as.m122459d().mo71963a());
        C58459fv fvVar = new C58459fv(asVar.mo71967b());
        fvVar.mo54920x(coVar, bgVar);
        C75932ar a = asVar.mo71966a();
        a.mo71965c(fvVar);
        C75933as a2 = a.mo71963a();
        java.util.Map map2 = this.f210742d;
        if (bgVar.f220080b == 2) {
            bVar3 = (C80206b) bgVar.f220081c;
        } else {
            bVar3 = C80206b.f220056c;
        }
        map2.put(bVar3.f220058a, a2);
        C80212bf.m128095a(bgVar.f220080b).name();
        coVar.name();
        return true;
    }

    /* renamed from: p */
    public final synchronized void mo71978p(Optional optional) {
        if (!this.f210742d.isEmpty()) {
            if (!optional.isEmpty()) {
                if (this.f210743e.get() && !this.f210744f.isEmpty()) {
                    this.f210743e.set(false);
                    String str = this.f210744f;
                    this.f210744f = BuildConfig.FLAVOR;
                    C75933as asVar = (C75933as) this.f210742d.get(str);
                    if (asVar != null) {
                        if (asVar.mo71968c().isEmpty()) {
                            ((C58970a) ((C58970a) f210739a.mo56225c()).mo56372aa(3432)).mo56389s("App Enter timestamp not found. App package: %s", str);
                            return;
                        }
                        Collection.EL.stream(asVar.mo71967b().mo54948A()).filter(new C75951j(this, asVar)).forEach(new C75952k(this, asVar, str));
                    } else {
                        return;
                    }
                }
                String packageName = ((ComponentName) optional.get()).getPackageName();
                C75933as asVar2 = (C75933as) this.f210742d.get(packageName);
                if (asVar2 != null) {
                    C75932ar a = asVar2.mo71966a();
                    a.mo71964b(Optional.m71637of(this.f210741c.mo57444a()));
                    this.f210742d.put(packageName, a.mo71963a());
                    this.f210744f = packageName;
                    this.f210743e.set(true);
                }
            }
        }
    }
}
