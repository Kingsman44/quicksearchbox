package com.google.android.libraries.search.udcdataservice;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.udcdataservice.n */
/* compiled from: PG */
public final /* synthetic */ class C41415n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C41387c[] f108186a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f108187b;

    public /* synthetic */ C41415n(C41387c[] cVarArr, C58817ah ahVar) {
        this.f108186a = cVarArr;
        this.f108187b = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C41387c[] cVarArr = this.f108186a;
        C58817ah ahVar = this.f108187b;
        int i = C41418q.f108190d;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i((List) DesugarArrays.stream((T[]) cVarArr).map(C41411j.f108182a).collect(Collectors.toCollection(C41412k.f108183a)));
        }
        Stream stream = DesugarArrays.stream((T[]) cVarArr);
        Objects.requireNonNull(ahVar);
        return C60856cj.m92896e((Iterable) stream.map(new C41413l(ahVar)).collect(Collectors.toCollection(C41412k.f108183a)));
    }
}
