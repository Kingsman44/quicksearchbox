package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.e */
/* compiled from: PG */
public final /* synthetic */ class C41425e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41427g f108204a;

    public /* synthetic */ C41425e(C41427g gVar) {
        this.f108204a = gVar;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((Set) obj).map(new C41423c(this.f108204a)).collect(Collectors.toCollection(C41424d.f108203a)));
    }
}
