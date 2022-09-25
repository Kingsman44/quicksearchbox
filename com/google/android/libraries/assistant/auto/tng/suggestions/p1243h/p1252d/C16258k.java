package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.k */
/* compiled from: PG */
public final /* synthetic */ class C16258k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123746bm f47877a;

    public /* synthetic */ C16258k(C123746bm bmVar) {
        this.f47877a = bmVar;
    }

    public final Object apply(Object obj) {
        C123746bm bmVar = this.f47877a;
        String str = (String) obj;
        ArrayList arrayList = new ArrayList();
        Collection.EL.stream(bmVar.f341820a).filter(C16261n.f47880a).flatMap(C16262o.f47881a).forEach(new C16263p(arrayList, str));
        Collection.EL.stream(bmVar.f341820a).filter(C16264q.f47884a).flatMap(C16265r.f47885a).forEach(new C16266s(arrayList, str));
        return arrayList;
    }
}
