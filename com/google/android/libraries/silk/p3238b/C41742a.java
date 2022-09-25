package com.google.android.libraries.silk.p3238b;

import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;

/* renamed from: com.google.android.libraries.silk.b.a */
/* compiled from: PG */
public final class C41742a extends Exception {

    /* renamed from: a */
    public final C56848d f109086a;

    public C41742a(C56848d dVar) {
        this.f109086a = dVar;
    }

    public final String getMessage() {
        C56848d dVar = this.f109086a;
        return String.format("id=%s, debug_message=%s", new Object[]{dVar.f151672b, dVar.f151673c});
    }

    public C41742a(C56848d dVar, Throwable th) {
        super(th);
        this.f109086a = dVar;
    }
}
