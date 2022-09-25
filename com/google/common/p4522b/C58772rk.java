package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.common.b.rk */
/* compiled from: PG */
final class C58772rk extends C58440fc {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f156551a;

    public C58772rk(Map.Entry entry) {
        this.f156551a = entry;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map.Entry mo55025b() {
        return this.f156551a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C58832aw.m90831a(getKey(), entry.getKey()) && C58832aw.m90831a(getValue(), entry.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156551a;
    }

    public final Object setValue(Object obj) {
        obj.getClass();
        return super.setValue(obj);
    }
}
