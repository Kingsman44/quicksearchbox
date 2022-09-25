package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.aq */
/* compiled from: PG */
public final class C8288aq implements C8267ab {

    /* renamed from: a */
    final /* synthetic */ Class f29026a;

    /* renamed from: b */
    final /* synthetic */ Class f29027b;

    /* renamed from: c */
    final /* synthetic */ C8266aa f29028c;

    public C8288aq(Class cls, Class cls2, C8266aa aaVar) {
        this.f29026a = cls;
        this.f29027b = cls2;
        this.f29028c = aaVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Class cls = aVar.f29213a;
        if (cls == this.f29026a || cls == this.f29027b) {
            return this.f29028c;
        }
        return null;
    }

    public final String toString() {
        String name = this.f29027b.getName();
        String name2 = this.f29026a.getName();
        String obj = this.f29028c.toString();
        return "Factory[type=" + name + "+" + name2 + ",adapter=" + obj + "]";
    }
}
