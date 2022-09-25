package com.google.android.libraries.notifications.platform.p2307a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.a.d */
/* compiled from: PG */
public final class C30060d {

    /* renamed from: a */
    private final Map f81325a = new HashMap();

    /* renamed from: b */
    private final C30059c f81326b;

    public C30060d(C30059c cVar) {
        this.f81326b = cVar;
    }

    /* renamed from: a */
    public final synchronized Object mo35400a(String str) {
        Object obj = this.f81325a.get(str);
        if (obj != null) {
            return obj;
        }
        Object a = this.f81326b.mo35092a(str);
        this.f81325a.put(str, a);
        return a;
    }
}
