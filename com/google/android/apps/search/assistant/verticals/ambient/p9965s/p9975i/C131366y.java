package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53725j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.y */
/* compiled from: PG */
public final /* synthetic */ class C131366y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131342ac f359106a;

    public /* synthetic */ C131366y(C131342ac acVar) {
        this.f359106a = acVar;
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
        C131342ac acVar = this.f359106a;
        C53692aq aqVar = (C53692aq) obj;
        C53725j jVar = aqVar.f140947i;
        if (jVar == null) {
            jVar = C53725j.f141040e;
        }
        if (jVar.f141044c) {
            return true;
        }
        C53725j jVar2 = aqVar.f140947i;
        if ((jVar2 == null ? C53725j.f141040e : jVar2).f141045d) {
            return acVar.f359063h || acVar.f359064i;
        }
        if (jVar2 == null) {
            jVar2 = C53725j.f141040e;
        }
        if (!jVar2.f141042a) {
            return false;
        }
        return acVar.f359064i;
    }
}
