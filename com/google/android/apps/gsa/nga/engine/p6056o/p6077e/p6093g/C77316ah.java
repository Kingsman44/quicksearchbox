package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.protos.p4883as.p4884a.C63774c;
import com.google.protos.p4985f.p5047y.C65381b;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.ah */
/* compiled from: PG */
public final /* synthetic */ class C77316ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76590bg f213234a;

    public /* synthetic */ C77316ah(C76590bg bgVar) {
        this.f213234a = bgVar;
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
        C76590bg bgVar = this.f213234a;
        C63774c cVar = (C63774c) obj;
        int i = C77317ai.f213235a;
        if ((cVar.f172515a & 16) == 0) {
            return false;
        }
        C65381b bVar = cVar.f172517c;
        if (bVar == null) {
            bVar = C65381b.f177785d;
        }
        if (bVar.f177788b) {
            return false;
        }
        C65381b bVar2 = cVar.f172517c;
        if (bVar2 == null) {
            bVar2 = C65381b.f177785d;
        }
        int i2 = bVar2.f177787a;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = i3 - 2;
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            Optional g = bgVar.mo72265g(C76575as.f211814a, "verbless");
            if (!g.isPresent() || !((Boolean) g.get()).booleanValue()) {
                return true;
            }
            return false;
        } else if (i4 != 3) {
            return false;
        } else {
            Optional g2 = bgVar.mo72265g(C76564ah.f211801a, "app_phrase");
            return g2.isPresent() && !((String) g2.get()).isEmpty();
        }
    }
}
