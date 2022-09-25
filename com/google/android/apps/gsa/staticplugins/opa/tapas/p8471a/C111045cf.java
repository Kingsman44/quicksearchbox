package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C111045cf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f309250a;

    /* renamed from: b */
    public final /* synthetic */ C49301bt f309251b;

    public /* synthetic */ C111045cf(List list, C49301bt btVar) {
        this.f309250a = list;
        this.f309251b = btVar;
    }

    public final Object apply(Object obj) {
        List list = this.f309250a;
        C49301bt btVar = this.f309251b;
        List list2 = (List) obj;
        int i = C111053cn.f309260g;
        return IntStream.CC.range(0, list2.size()).anyMatch(new C111049cj(list2, list)) ? Optional.m71637of(btVar) : Optional.empty();
    }
}
