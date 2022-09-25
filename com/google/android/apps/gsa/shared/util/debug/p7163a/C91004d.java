package com.google.android.apps.gsa.shared.util.debug.p7163a;

import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.d */
/* compiled from: PG */
final class C91004d extends C90752i {

    /* renamed from: a */
    private final C91010j f254230a;

    public C91004d(C91010j jVar) {
        this.f254230a = jVar;
    }

    /* renamed from: a */
    public final Object mo85092a(boolean z) {
        if (this.f254230a == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        this.f254230a.mo27451g(new C91005e(z, sb, (StringBuilder) null));
        return sb;
    }
}
