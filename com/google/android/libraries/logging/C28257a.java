package com.google.android.libraries.logging;

import java.util.List;

/* renamed from: com.google.android.libraries.logging.a */
/* compiled from: PG */
public final class C28257a extends C28293k {

    /* renamed from: a */
    public final C28292j f76908a;

    /* renamed from: b */
    public final List f76909b;

    public C28257a(C28292j jVar, List list) {
        this.f76908a = jVar;
        if (list != null) {
            this.f76909b = list;
            return;
        }
        throw new NullPointerException("Null children");
    }

    /* renamed from: a */
    public final C28292j mo33745a() {
        return this.f76908a;
    }

    /* renamed from: b */
    public final List mo33746b() {
        return this.f76909b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28293k) {
            C28293k kVar = (C28293k) obj;
            C28292j jVar = this.f76908a;
            if (jVar != null ? jVar.equals(kVar.mo33745a()) : kVar.mo33745a() == null) {
                if (this.f76909b.equals(kVar.mo33746b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f76908a);
        String obj = this.f76909b.toString();
        return "VeTreeNode{ve=" + valueOf + ", children=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        C28292j jVar = this.f76908a;
        if (jVar == null) {
            i = 0;
        } else {
            i = jVar.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f76909b.hashCode();
    }
}
