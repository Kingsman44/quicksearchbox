package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a;

import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;
import java.util.HashMap;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12880b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52091ex f40137a;

    public /* synthetic */ C12880b(C52091ex exVar) {
        this.f40137a = exVar;
    }

    public final Object apply(Object obj) {
        C52091ex exVar = this.f40137a;
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        HashMap hashMap = new HashMap();
        Collection.EL.stream(((C52091ex) obj).f136712a).forEach(new C12881c(hashMap));
        Collection.EL.stream(exVar.f136712a).forEach(new C12882d(hashMap));
        ewVar.mo53790c(hashMap.values());
        return (C52091ex) ewVar.build();
    }
}
