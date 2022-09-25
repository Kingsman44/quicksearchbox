package com.google.common.p4522b;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.nb */
/* compiled from: PG */
abstract class C58655nb extends AbstractMap {
    /* renamed from: a */
    public abstract Iterator mo55718a();

    public void clear() {
        C58570jy.m90162n(mo55718a());
    }

    public final Set entrySet() {
        return new C58654na(this);
    }
}
