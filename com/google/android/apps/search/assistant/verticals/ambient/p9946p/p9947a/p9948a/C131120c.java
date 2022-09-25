package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9947a.p9948a;

import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9947a.C131122b;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53708bf;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.a.a.c */
/* compiled from: PG */
final class C131120c implements C131122b {

    /* renamed from: a */
    final /* synthetic */ C131121d f358611a;

    /* renamed from: b */
    private final C58528ij f358612b;

    public C131120c(C131121d dVar, C58528ij ijVar) {
        this.f358611a = dVar;
        this.f358612b = (C58528ij) Collection.EL.stream(ijVar).map(C131119b.f358610a).collect(C58370cn.f155947b);
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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C53692aq aqVar = ((C53708bf) obj).f140996c;
        if (aqVar == null) {
            aqVar = C53692aq.f140937k;
        }
        C58528ij ijVar = this.f358612b;
        if (ijVar == null) {
            return true;
        }
        C8242v vVar = aqVar.f140942d;
        if (vVar == null) {
            vVar = C8242v.f28952d;
        }
        if (!ijVar.contains(vVar)) {
            return true;
        }
        ((C58970a) ((C58970a) this.f358611a.f358614b.mo56224b()).mo56372aa(39038)).mo56389s("Removed place %s because the time spent ratio at this location is above the configured threshold.", aqVar);
        return false;
    }
}
