package com.google.android.libraries.silk.event.p3259a;

import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.silk.event.a.d */
/* compiled from: PG */
public final class C41893d {

    /* renamed from: a */
    public static final C59071e f109292a = C59071e.m91332i("com.google.android.libraries.silk.event.a.d");

    /* renamed from: b */
    public final Map f109293b = new HashMap();

    /* renamed from: c */
    private final Map f109294c = new HashMap();

    /* renamed from: a */
    public final Set mo44354a(Class cls) {
        if (!this.f109294c.containsKey(cls)) {
            this.f109294c.put(cls, new HashSet());
        }
        return (Set) this.f109294c.get(cls);
    }
}
