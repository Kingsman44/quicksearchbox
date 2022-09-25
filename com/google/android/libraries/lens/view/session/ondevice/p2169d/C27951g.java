package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a.C27804f;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.g */
/* compiled from: PG */
public final /* synthetic */ class C27951g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C27953i f76106a;

    public /* synthetic */ C27951g(C27953i iVar) {
        this.f76106a = iVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C56277cd cdVar;
        C56277cd cdVar2;
        C56277cd cdVar3;
        C27953i iVar = this.f76106a;
        C56278ce ceVar = (C56278ce) obj;
        C56306df a = C56306df.m87964a(ceVar.f149991d);
        if (a == null) {
            a = C56306df.UNKNOWN_FILTER_TYPE;
        }
        if (!a.equals(C56306df.TRANSLATE)) {
            return false;
        }
        if (ceVar.f149989b == 3) {
            cdVar = (C56277cd) ceVar.f149990c;
        } else {
            cdVar = C56277cd.f149981d;
        }
        if ((cdVar.f149983a & 2) == 0) {
            return false;
        }
        C27804f fVar = iVar.f76110c;
        C27830m b = iVar.f76109b.mo33319c().mo33315b();
        if (ceVar.f149989b == 3) {
            cdVar2 = (C56277cd) ceVar.f149990c;
        } else {
            cdVar2 = C56277cd.f149981d;
        }
        C58833ax k = C58833ax.m90834k(cdVar2.f149985c);
        if (ceVar.f149989b == 3) {
            cdVar3 = (C56277cd) ceVar.f149990c;
        } else {
            cdVar3 = C56277cd.f149981d;
        }
        return fVar.mo33317b(b, k, C58833ax.m90834k(cdVar3.f149984b));
    }
}
