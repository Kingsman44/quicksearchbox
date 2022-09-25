package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.d.a.e.b */
/* compiled from: PG */
public abstract class C60995b {

    /* renamed from: a */
    final List f165130a = new ArrayList();

    protected C60995b() {
    }

    /* renamed from: a */
    public abstract C60987n mo57517a(String str, C61012g gVar, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60987n mo57518b(String str) {
        if (this.f165130a.contains(C61013h.m93262d(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
