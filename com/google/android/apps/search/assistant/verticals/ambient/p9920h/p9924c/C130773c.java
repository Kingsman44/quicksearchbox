package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130806h;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.c */
/* compiled from: PG */
public final /* synthetic */ class C130773c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130786p f357992a;

    public /* synthetic */ C130773c(C130786p pVar) {
        this.f357992a = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53692aq aqVar = (C53692aq) obj;
        C130806h hVar = this.f357992a.f358009c;
        C53691ap a = C53691ap.m86884a(aqVar.f140943e);
        if (a == null) {
            a = C53691ap.UNSPECIFIED;
        }
        C8242v vVar = aqVar.f140942d;
        if (vVar == null) {
            vVar = C8242v.f28952d;
        }
        C53702b bVar = aqVar.f140946h;
        if (bVar == null) {
            bVar = C53702b.f140971f;
        }
        return hVar.mo109807a(a, vVar, Collection.EL.stream(bVar.f140974b).map(C130736a.f357928a).findFirst());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
