package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.f.e */
/* compiled from: PG */
public final /* synthetic */ class C15743e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15750l f46933a;

    public /* synthetic */ C15743e(C15750l lVar) {
        this.f46933a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C15750l lVar = this.f46933a;
        C58833ax axVar = (C58833ax) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection) Collection.EL.stream(lVar.f46943d).map(C15748j.f46938a).collect(Collectors.toCollection(C15749k.f46939a)));
        return C47633f.m84733g(C60856cj.m92896e(arrayList));
    }
}
