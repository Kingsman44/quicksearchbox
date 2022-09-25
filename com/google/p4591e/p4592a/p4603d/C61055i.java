package com.google.p4591e.p4592a.p4603d;

import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.e.a.d.i */
/* compiled from: PG */
final class C61055i implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ C61058l f165310a;

    /* renamed from: b */
    private Object f165311b;

    /* renamed from: c */
    private final C61060n f165312c;

    public C61055i(C61058l lVar, C61060n nVar, Object obj) {
        this.f165310a = lVar;
        this.f165312c = nVar;
        obj.getClass();
        this.f165311b = obj;
    }

    /* renamed from: a */
    public final String getKey() {
        String str = this.f165312c.f165331c;
        return this.f165310a.f165322b.f165294b ? str.toLowerCase(Locale.US) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return getKey().equals(entry.getKey()) && this.f165311b.equals(entry.getValue());
    }

    public final Object getValue() {
        return this.f165311b;
    }

    public final int hashCode() {
        return getKey().hashCode() ^ this.f165311b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f165311b;
        obj.getClass();
        this.f165311b = obj;
        C61060n nVar = this.f165312c;
        C61060n.m93426e(nVar.f165330b, this.f165310a.f165321a, obj);
        return obj2;
    }
}
