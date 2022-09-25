package com.google.android.libraries.storage.protostore;

import com.google.common.base.C58838bb;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.storage.protostore.ag */
/* compiled from: PG */
public final class C42881ag {
    /* renamed from: a */
    public static final void m75749a(C43002ei eiVar, HashMap hashMap) {
        String b = eiVar.mo45982b();
        C58838bb.m90873h(!hashMap.containsKey(b), "There is already a factory registered for the ID %s", b);
        hashMap.put(b, eiVar);
    }
}
