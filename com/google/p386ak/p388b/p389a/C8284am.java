package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.am */
/* compiled from: PG */
final class C8284am implements C8267ab {
    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Class<? super Enum> cls = aVar.f29213a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C8301bc(cls);
    }
}
