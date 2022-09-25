package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.r */
/* compiled from: PG */
public final /* synthetic */ class C124232r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f343020a;

    public /* synthetic */ C124232r(String str) {
        this.f343020a = str;
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
        String str = this.f343020a;
        C59071e eVar = C124234t.f343022a;
        return ((C124235b) obj).mo106333h().equals(str);
    }
}
