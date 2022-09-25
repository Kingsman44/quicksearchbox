package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63070h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cj */
/* compiled from: PG */
public final /* synthetic */ class C126072cj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126072cj f347443a = new C126072cj();

    private /* synthetic */ C126072cj() {
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
        C59071e eVar = C126081cs.f347463a;
        C63070h hVar = ((f) obj).d;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return C126336m.m206590a(hVar).equals(C125044j.EMOJI_SUGGESTION);
    }
}
