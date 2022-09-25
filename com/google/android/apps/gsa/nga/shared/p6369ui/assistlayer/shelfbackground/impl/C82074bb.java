package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80771es;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80879y;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4575r.C60752i;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.bb */
/* compiled from: PG */
public final class C82074bb implements C82091g {

    /* renamed from: a */
    public final C82084bl f224365a;

    /* renamed from: b */
    public final C81564g f224366b;

    /* renamed from: c */
    public boolean f224367c = false;

    /* renamed from: d */
    public C80771es f224368d = C80771es.f221679b;

    public C82074bb(C82084bl blVar, C81564g gVar) {
        this.f224365a = blVar;
        this.f224366b = gVar;
    }

    /* renamed from: d */
    private final boolean m130352d() {
        if (this.f224368d.f221681a == null) {
            return false;
        }
        C82084bl blVar = this.f224365a;
        return blVar.f224410j != 0 && !((Boolean) ((C83361k) blVar.f224403c).f227199b.get()).booleanValue();
    }

    /* renamed from: a */
    public final void mo75493a(float f) {
        if (m130352d() && this.f224367c) {
            C82083bk bkVar = this.f224365a.f224408h;
            C82083bk bkVar2 = this.f224368d.f221681a != null ? C82083bk.GONE : bkVar;
            C82084bl blVar = this.f224365a;
            float a = C60752i.m92727a(((float) blVar.f224412l) + f, (float) blVar.mo75499a(bkVar2), (float) blVar.mo75499a(bkVar));
            blVar.f224411k = a;
            C83349aj.m132647b(blVar.f224407g, blVar.f224404d, Integer.valueOf((int) a), "shelfHeightObservable");
            blVar.mo75502d();
        }
    }

    /* renamed from: b */
    public final void mo75494b(float f, float f2) {
        if (m130352d() && this.f224367c) {
            C82083bk bkVar = this.f224365a.f224408h;
            C58480gp e = C58485gu.m89837e();
            e.mo55395g(bkVar);
            if (this.f224368d.f221681a != null) {
                e.mo55395g(C82083bk.GONE);
            }
            C58485gu f3 = e.mo55394f();
            float f4 = -f;
            C82084bl blVar = this.f224365a;
            float a = (float) blVar.mo75499a(blVar.f224408h);
            C82083bk bkVar2 = this.f224365a.f224408h;
            if (f4 == 0.0f || Math.signum(f2) != (-Math.signum(f4))) {
                if (f4 != 0.0f) {
                    int i = ((C58724pq) f3).f156474d;
                    float f5 = Float.POSITIVE_INFINITY;
                    C82083bk bkVar3 = null;
                    for (int i2 = 0; i2 < i; i2++) {
                        C82083bk bkVar4 = (C82083bk) f3.get(i2);
                        float a2 = (((float) this.f224365a.mo75499a(bkVar4)) - (a + f2)) * Math.signum(f4);
                        if (a2 > 0.0f) {
                            if (a2 < f5) {
                                bkVar3 = bkVar4;
                            }
                            if (a2 < f5) {
                                f5 = a2;
                            }
                        }
                    }
                    if (bkVar3 != null) {
                        bkVar2 = bkVar3;
                    }
                }
                float abs = Math.abs(f2);
                float f6 = a + f2;
                int i3 = ((C58724pq) f3).f156474d;
                for (int i4 = 0; i4 < i3; i4++) {
                    C82083bk bkVar5 = (C82083bk) f3.get(i4);
                    float abs2 = Math.abs(f6 - ((float) this.f224365a.mo75499a(bkVar5)));
                    if (abs2 < abs) {
                        bkVar2 = bkVar5;
                    }
                    if (abs2 < abs) {
                        abs = abs2;
                    }
                }
            }
            if (bkVar2.equals(C82083bk.GONE)) {
                C81564g gVar = this.f224366b;
                C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
                C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
                C80879y yVar = C80879y.f221830a;
                eVar.copyOnWrite();
                C80831aj ajVar = (C80831aj) eVar.instance;
                yVar.getClass();
                ajVar.f221754b = yVar;
                ajVar.f221753a = 1;
                akVar.copyOnWrite();
                C80833al alVar = (C80833al) akVar.instance;
                C80831aj ajVar2 = (C80831aj) eVar.build();
                ajVar2.getClass();
                alVar.f221759b = ajVar2;
                alVar.f221758a = 1;
                gVar.mo73553b((C80833al) akVar.build());
            }
            this.f224365a.mo75500b(bkVar2, f);
            this.f224367c = false;
        }
    }

    /* renamed from: c */
    public final void mo75495c() {
        if (m130352d()) {
            this.f224367c = true;
            C82084bl blVar = this.f224365a;
            C83349aj.m132647b(blVar.f224407g, blVar.f224402b, true, "isUserScrolling");
            blVar.f224412l = blVar.mo75499a(blVar.f224408h);
        }
    }
}
