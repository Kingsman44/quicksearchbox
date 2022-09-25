package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.v */
/* compiled from: PG */
public final /* synthetic */ class C131412v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131377ai f359218a;

    public /* synthetic */ C131412v(C131377ai aiVar) {
        this.f359218a = aiVar;
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
        C131377ai aiVar = this.f359218a;
        Map.Entry entry = (Map.Entry) obj;
        if (((Long) entry.getValue()).longValue() >= 3) {
            return true;
        }
        ((C58970a) ((C58970a) aiVar.f359119b.mo56224b()).mo56372aa(39247)).mo56359L("#removeInvalidApps: %s has too few entries: %d < %d", entry.getKey(), entry.getValue(), 3);
        return false;
    }
}
