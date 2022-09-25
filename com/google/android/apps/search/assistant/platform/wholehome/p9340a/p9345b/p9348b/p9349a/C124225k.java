package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124192h;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C124225k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f343010a;

    public /* synthetic */ C124225k(String str) {
        this.f343010a = str;
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
        String str = this.f343010a;
        C124235b bVar = (C124235b) obj;
        C59071e eVar = C124234t.f343022a;
        if (!bVar.mo106333h().equals(str)) {
            return false;
        }
        C124192h hVar = bVar.mo106329d().f342941b;
        if (hVar == null) {
            hVar = C124192h.f342949b;
        }
        return hVar.f342951a;
    }
}
