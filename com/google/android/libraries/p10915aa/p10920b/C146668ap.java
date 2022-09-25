package com.google.android.libraries.p10915aa.p10920b;

import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50894ab;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50901d;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50919v;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50921x;
import com.google.assistant.p3897e.p3902c.p3903a.p3904a.C50923z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.aa.b.ap */
/* compiled from: PG */
public abstract class C146668ap {
    /* renamed from: f */
    public static C146668ap m238917f(C50894ab abVar) {
        C146663ak akVar;
        C50921x xVar;
        C50901d dVar;
        if ((abVar.f132506a & 2) != 0) {
            C50923z zVar = abVar.f132510e;
            if (zVar == null) {
                zVar = C50923z.f132573c;
            }
            int i = zVar.f132575a;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    if (i == 1) {
                        xVar = (C50921x) zVar.f132576b;
                    } else {
                        xVar = C50921x.f132569c;
                    }
                    Optional.empty();
                    C50919v vVar = xVar.f132572b;
                    if (vVar == null) {
                        vVar = C50919v.f132564d;
                    }
                    akVar = new C146687j(new C146698u(Optional.m71637of(C146660ah.m238906c(vVar))));
                } else if (i3 == 1) {
                    if (i == 2) {
                        dVar = (C50901d) zVar.f132576b;
                    } else {
                        dVar = C50901d.f132529b;
                    }
                    dVar.getClass();
                    akVar = new C146685h(dVar);
                } else if (i3 == 2) {
                    akVar = C146686i.f396118a;
                } else {
                    throw new AssertionError("Unexpected error in `create` method.");
                }
                return new C146690m(akVar);
            }
            throw null;
        } else if (!abVar.f132507b.isEmpty()) {
            C58485gu guVar = (C58485gu) Collection.EL.stream(abVar.f132507b).map(C146664al.f396097a).collect(C58370cn.f155946a);
            guVar.getClass();
            return new C146689l(guVar);
        } else if (!abVar.f132508c.isEmpty()) {
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(abVar.f132508c).map(C146664al.f396097a).collect(C58370cn.f155946a);
            guVar2.getClass();
            return new C146693p(guVar2);
        } else if ((abVar.f132506a & 1) == 0) {
            return C146692o.f396123a;
        } else {
            C50894ab abVar2 = abVar.f132509d;
            if (abVar2 == null) {
                abVar2 = C50894ab.f132504f;
            }
            return new C146691n(m238917f(abVar2));
        }
    }

    /* renamed from: a */
    public abstract C58485gu mo123445a();

    /* renamed from: b */
    public abstract int mo123446b();

    /* renamed from: c */
    public abstract C146663ak mo123447c();

    /* renamed from: d */
    public abstract C146668ap mo123448d();

    /* renamed from: e */
    public abstract C58485gu mo123449e();

    /* renamed from: g */
    public final boolean mo123450g(C146672at atVar, Optional optional) {
        int b = mo123446b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            return false;
        } else {
            if (i == 1) {
                return Collection.EL.stream(mo123445a()).allMatch(new C146665am(atVar, optional));
            }
            if (i == 2) {
                return Collection.EL.stream(mo123449e()).anyMatch(new C146666an(atVar, optional));
            }
            if (i == 3) {
                return !mo123448d().mo123450g(atVar, optional);
            }
            if (i == 4) {
                C146663ak c = mo123447c();
                int b2 = c.mo123443b();
                int i2 = b2 - 1;
                if (b2 == 0) {
                    throw null;
                } else if (i2 == 0) {
                    return false;
                } else {
                    if (i2 == 1) {
                        C146661ai c2 = c.mo123444c();
                        if (c2.mo123441a().isPresent()) {
                            return C146675aw.m238932a(atVar, (C146660ah) c2.mo123441a().get()).isPresent();
                        }
                        return false;
                    } else if (i2 == 2) {
                        return optional.isPresent() && c.mo123442a().f132531a.equals(optional.get());
                    } else {
                        throw new AssertionError("Unexpected error in `isSatisfiedForScreen`");
                    }
                }
            } else {
                throw new AssertionError("Unexpected error in `areSatisfiedForScreen` method.");
            }
        }
    }
}
