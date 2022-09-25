package com.google.android.apps.search.googleapp.stampviewer.p10487a;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139395e;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.a.f */
/* compiled from: PG */
public final class C139311f implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Set f378897a;

    public C139311f(Set set) {
        this.f378897a = set;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C139395e eVar = (C139395e) obj;
        HashMap hashMap = new HashMap();
        for (String str : this.f378897a) {
            hashMap.put(str, Boolean.valueOf(!((Boolean) Map.EL.getOrDefault(Collections.unmodifiableMap(eVar.f379044a), str, false)).booleanValue()));
        }
        return hashMap;
    }
}
