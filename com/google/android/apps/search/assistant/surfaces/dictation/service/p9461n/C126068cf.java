package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cf */
/* compiled from: PG */
public final /* synthetic */ class C126068cf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126068cf f347438a = new C126068cf();

    private /* synthetic */ C126068cf() {
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
        String str = (String) obj;
        C59071e eVar = C126081cs.f347463a;
        return str.equals("text.REMOVE_LAST_WORD") || str.equals("text.REMOVE_LAST_WORD_OR_PUNCTUATION");
    }
}
