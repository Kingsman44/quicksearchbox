package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.av */
/* compiled from: PG */
public final /* synthetic */ class C125964av implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125964av f347184a = new C125964av();

    private /* synthetic */ C125964av() {
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
        C51809dy dyVar = (C51809dy) obj;
        C59071e eVar = C126038bc.f347355a;
        return dyVar.f135936b.equals("text.REMOVE_LAST_SENTENCE") || dyVar.f135936b.equals("text.REMOVE_CURRENT_ORATION");
    }
}
