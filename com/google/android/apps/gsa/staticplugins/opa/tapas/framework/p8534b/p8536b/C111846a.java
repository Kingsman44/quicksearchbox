package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b;

import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.b.a */
/* compiled from: PG */
public final class C111846a implements C2391v {

    /* renamed from: a */
    public int f310824a = 1;

    /* renamed from: b */
    private WeakReference f310825b;

    /* renamed from: a */
    public final C2393x mo99266a() {
        if (this.f310825b == null) {
            this.f310825b = new WeakReference(new C2393x(this));
        }
        C2393x xVar = (C2393x) this.f310825b.get();
        if (xVar != null) {
            return xVar;
        }
        C2393x xVar2 = new C2393x(this);
        this.f310825b = new WeakReference(xVar2);
        return xVar2;
    }

    public final C2384o getLifecycle() {
        return mo99266a();
    }
}
