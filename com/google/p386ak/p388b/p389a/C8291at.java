package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.at */
/* compiled from: PG */
final class C8291at implements C8267ab {

    /* renamed from: a */
    final /* synthetic */ Class f29034a;

    /* renamed from: b */
    final /* synthetic */ C8266aa f29035b;

    public C8291at(Class cls, C8266aa aaVar) {
        this.f29034a = cls;
        this.f29035b = aaVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Class cls = aVar.f29213a;
        if (!this.f29034a.isAssignableFrom(cls)) {
            return null;
        }
        return new C8290as(this, cls);
    }

    public final String toString() {
        String name = this.f29034a.getName();
        String obj = this.f29035b.toString();
        return "Factory[typeHierarchy=" + name + ",adapter=" + obj + "]";
    }
}
