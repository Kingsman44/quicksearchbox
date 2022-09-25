package com.google.android.libraries.notifications.platform.p2310d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.d.h */
/* compiled from: PG */
public abstract class C30085h {
    /* renamed from: a */
    public abstract Map mo35462a();

    /* renamed from: b */
    public final void mo35485b(C30084g gVar, String str) {
        List arrayList = mo35462a().containsKey(gVar) ? (List) mo35462a().get(gVar) : new ArrayList(1);
        arrayList.add(str);
        mo35462a().put(gVar, arrayList);
    }
}
