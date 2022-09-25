package com.google.common.p4522b;

import com.google.common.base.C58839bc;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.my */
/* compiled from: PG */
final class C58651my extends C58645ms {

    /* renamed from: c */
    final C58839bc f156378c;

    public C58651my(Map map, C58839bc bcVar, C58839bc bcVar2) {
        super(map, bcVar2);
        this.f156378c = bcVar;
    }

    /* renamed from: b */
    public final Set mo55700b() {
        return C58758qx.m90652j(this.f156370a.entrySet(), this.f156371b);
    }

    public final boolean containsKey(Object obj) {
        return this.f156370a.containsKey(obj) && this.f156378c.mo5941a(obj);
    }

    /* renamed from: e */
    public final Set mo55703e() {
        return C58758qx.m90652j(this.f156370a.keySet(), this.f156378c);
    }
}
