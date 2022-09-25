package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80584r;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80656al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80674bc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80694bw;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80732dg;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.an */
/* compiled from: PG */
public final /* synthetic */ class C78292an implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C78292an f215586a = new C78292an();

    private /* synthetic */ C78292an() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80734di diVar;
        C80696by byVar;
        String str;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C78293ao.m125777d();
        }
        C80581o oVar = (C80581o) optional.get();
        C80732dg f = C80734di.m128574f();
        C80586t tVar = oVar.f221192b;
        if (tVar == null) {
            tVar = C80586t.f221205g;
        }
        f.mo74537c(tVar.f221208b);
        C80590x xVar = C80590x.UNKNOWN;
        C80590x a = C80590x.m128211a(oVar.f221191a);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 16) {
            f.mo74536b(C78317f.m125824c(oVar, e.aC));
            ((C80674bc) f).f221497d = 2;
            diVar = f.mo74535a();
        } else if (ordinal == 18) {
            f.mo74536b(C78317f.m125824c(oVar, e.aC));
            ((C80674bc) f).f221497d = 3;
            diVar = f.mo74535a();
        } else if (ordinal == 20) {
            f.mo74536b(C78317f.m125824c(oVar, e.aC));
            ((C80674bc) f).f221497d = 5;
            diVar = f.mo74535a();
        } else if (ordinal == 22) {
            C80586t tVar2 = oVar.f221192b;
            if (tVar2 == null) {
                tVar2 = C80586t.f221205g;
            }
            String str2 = tVar2.f221209c;
            if (str2 != null) {
                C80674bc bcVar = (C80674bc) f;
                bcVar.f221495b = str2;
                f.mo74536b(C78317f.m125824c(oVar, e.aC));
                bcVar.f221497d = 6;
                C80586t tVar3 = oVar.f221192b;
                if (tVar3 == null) {
                    tVar3 = C80586t.f221205g;
                }
                C80584r rVar = tVar3.f221210d;
                if (rVar == null) {
                    rVar = C80584r.f221200d;
                }
                if (rVar.f221202a == 1) {
                    str = (String) rVar.f221203b;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (str != null) {
                    bcVar.f221496c = str;
                    diVar = f.mo74535a();
                } else {
                    throw new NullPointerException("Null imageUrl");
                }
            } else {
                throw new NullPointerException("Null subText");
            }
        } else if (ordinal != 29) {
            f.mo74536b(C78317f.m125824c(oVar, e.aD));
            ((C80674bc) f).f221497d = 1;
            diVar = f.mo74535a();
        } else {
            f.mo74536b(C78317f.m125824c(oVar, e.aC));
            ((C80674bc) f).f221497d = 7;
            diVar = f.mo74535a();
        }
        C80581o oVar2 = (C80581o) optional.get();
        C80831aj c = C78317f.m125824c(oVar2, e.aC);
        C80590x a2 = C80590x.m128211a(oVar2.f221191a);
        if (a2 == null) {
            a2 = C80590x.UNRECOGNIZED;
        }
        int ordinal2 = a2.ordinal();
        if (ordinal2 == 18) {
            C80694bw d = C80696by.m128473d();
            d.mo74425b(c);
            ((C80656al) d).f221415b = 2;
            byVar = d.mo74424a();
        } else if (ordinal2 == 20) {
            C80694bw d2 = C80696by.m128473d();
            C80586t tVar4 = oVar2.f221192b;
            if (tVar4 == null) {
                tVar4 = C80586t.f221205g;
            }
            d2.mo74426c(tVar4.f221208b);
            d2.mo74425b(c);
            ((C80656al) d2).f221415b = 3;
            byVar = d2.mo74424a();
        } else if (ordinal2 == 22) {
            byVar = C80696by.f221559a;
        } else if (ordinal2 != 28) {
            C80694bw d3 = C80696by.m128473d();
            d3.mo74425b(c);
            ((C80656al) d3).f221415b = 1;
            byVar = d3.mo74424a();
        } else {
            C80694bw d4 = C80696by.m128473d();
            C80586t tVar5 = oVar2.f221192b;
            if (tVar5 == null) {
                tVar5 = C80586t.f221205g;
            }
            d4.mo74426c(tVar5.f221208b);
            d4.mo74425b(c);
            ((C80656al) d4).f221415b = 4;
            byVar = d4.mo74424a();
        }
        return new C78278a(diVar, byVar, (C80581o) optional.get());
    }
}
