package com.google.p5238v.p5239a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.v.a.x */
/* compiled from: PG */
public final class C67908x {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f184087a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static C67907w m98184a(String str) {
        Iterator it = f184087a.iterator();
        while (it.hasNext()) {
            C67907w wVar = (C67907w) it.next();
            if (wVar.mo59933b(str)) {
                return wVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
