package com.google.common.p4522b;

import java.util.ConcurrentModificationException;

/* renamed from: com.google.common.b.sh */
/* compiled from: PG */
final class C58796sh {

    /* renamed from: a */
    public Object f156585a;

    /* renamed from: a */
    public final void mo56018a(Object obj, Object obj2) {
        if (this.f156585a == obj) {
            this.f156585a = obj2;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
