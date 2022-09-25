package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.ar */
/* compiled from: PG */
final class C8289ar implements C8267ab {

    /* renamed from: a */
    final /* synthetic */ Class f29029a;

    /* renamed from: b */
    final /* synthetic */ Class f29030b;

    /* renamed from: c */
    final /* synthetic */ C8266aa f29031c;

    public C8289ar(Class cls, Class cls2, C8266aa aaVar) {
        this.f29029a = cls;
        this.f29030b = cls2;
        this.f29031c = aaVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Class cls = aVar.f29213a;
        if (cls == this.f29029a || cls == this.f29030b) {
            return this.f29031c;
        }
        return null;
    }

    public final String toString() {
        String name = this.f29029a.getName();
        String name2 = this.f29030b.getName();
        String obj = this.f29031c.toString();
        return "Factory[type=" + name + "+" + name2 + ",adapter=" + obj + "]";
    }
}
