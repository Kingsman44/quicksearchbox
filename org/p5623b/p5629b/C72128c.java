package org.p5623b.p5629b;

import java.security.PrivilegedAction;
import java.util.Map;

/* renamed from: org.b.b.c */
/* compiled from: PG */
final class C72128c implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ String f191959a = "org.bouncycastle.asn1.allow_unsafe_integer";

    public final Object run() {
        Map map = (Map) C72129d.f191960a.get();
        if (map != null) {
            return map.get(this.f191959a);
        }
        return System.getProperty(this.f191959a);
    }
}
