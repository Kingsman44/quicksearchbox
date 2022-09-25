package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import com.google.android.libraries.mdi.C28595b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.l */
/* compiled from: PG */
public final /* synthetic */ class C125309l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f345673a;

    public /* synthetic */ C125309l(String str) {
        this.f345673a = str;
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
        String str = this.f345673a;
        C59071e eVar = C125311n.f345675a;
        return ((C28595b) obj).f77798b.equals(str);
    }
}
