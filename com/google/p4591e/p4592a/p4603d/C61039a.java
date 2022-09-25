package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.e.a.d.a */
/* compiled from: PG */
final class C61039a implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ C61050d f165274a;

    /* renamed from: b */
    private final int f165275b;

    public C61039a(C61050d dVar, int i) {
        this.f165274a = dVar;
        this.f165275b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C58832aw.m90831a(getKey(), entry.getKey()) && C58832aw.m90831a(getValue(), entry.getValue());
    }

    public final Object getKey() {
        C61050d dVar = this.f165274a;
        int i = this.f165275b;
        if (i < 0 || i >= dVar.f165288a) {
            return null;
        }
        return dVar.f165289b[i + i];
    }

    public final Object getValue() {
        return this.f165274a.mo57597b(this.f165275b);
    }

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        return this.f165274a.mo57603d(this.f165275b, obj);
    }
}
