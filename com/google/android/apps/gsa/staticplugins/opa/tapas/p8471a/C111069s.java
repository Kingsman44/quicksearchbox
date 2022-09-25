package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113278bc;
import com.google.common.base.C58817ah;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.s */
/* compiled from: PG */
public final /* synthetic */ class C111069s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f309291a;

    /* renamed from: b */
    public final /* synthetic */ String f309292b;

    public /* synthetic */ C111069s(String str, String str2) {
        this.f309291a = str;
        this.f309292b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f309291a;
        String str2 = this.f309292b;
        C113278bc bcVar = new C113278bc();
        bcVar.f313715a = Optional.m71637of(str);
        bcVar.f313717c = Optional.m71637of(str2);
        Optional map = ((Optional) obj).map(C111067q.f309289a);
        Objects.requireNonNull(bcVar);
        map.ifPresent(new C111068r(bcVar));
        return bcVar.mo100062a();
    }
}
