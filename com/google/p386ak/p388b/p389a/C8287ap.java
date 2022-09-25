package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.ap */
/* compiled from: PG */
public final class C8287ap implements C8267ab {

    /* renamed from: a */
    final /* synthetic */ Class f29024a;

    /* renamed from: b */
    final /* synthetic */ C8266aa f29025b;

    public C8287ap(Class cls, C8266aa aaVar) {
        this.f29024a = cls;
        this.f29025b = aaVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        if (aVar.f29213a == this.f29024a) {
            return this.f29025b;
        }
        return null;
    }

    public final String toString() {
        String name = this.f29024a.getName();
        String obj = this.f29025b.toString();
        return "Factory[type=" + name + ",adapter=" + obj + "]";
    }
}
