package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.unifiedime.C118603u;
import com.google.android.apps.gsa.unifiedime.C118604v;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import p3186j$.util.function.Predicate;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cw */
/* compiled from: PG */
final class C126085cw implements Predicate {

    /* renamed from: a */
    public static final C126085cw f347488a = new C126085cw();

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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C62971cq<C118604v> cqVar = ((C118606x) obj).f330898e;
        C69664n.m101060f(cqVar, "it.annotatedSubspansList");
        if ((cqVar instanceof Collection) && cqVar.isEmpty()) {
            return true;
        }
        for (C118604v vVar : cqVar) {
            int a = C118603u.m196903a(vVar.f330890d);
            if (a != 0 && a == 3) {
                return false;
            }
        }
        return true;
    }
}
