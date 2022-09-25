package com.google.android.gms.learning.internal;

import android.util.Log;
import com.google.android.gms.learning.C144581d;
import com.google.common.base.C58838bb;
import com.google.common.base.C58889cz;

/* renamed from: com.google.android.gms.learning.internal.b */
/* compiled from: PG */
final class C144764b extends C144777i {

    /* renamed from: a */
    private final C144581d f391614a;

    /* renamed from: b */
    private final C58889cz f391615b;

    /* renamed from: c */
    private final Object f391616c = new Object();

    /* renamed from: d */
    private boolean f391617d = false;

    public C144764b(C144581d dVar, C58889cz czVar) {
        this.f391614a = dVar;
        this.f391615b = czVar;
    }

    /* renamed from: a */
    public final void mo120197a() {
        synchronized (this.f391616c) {
            if (this.f391617d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
                return;
            }
            this.f391617d = true;
            this.f391614a.close();
        }
    }

    /* renamed from: b */
    public final void mo120198b(C144775g gVar) {
        C58838bb.m90868c(gVar != null);
        synchronized (this.f391616c) {
            if (this.f391617d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
            } else {
                this.f391614a.mo92062b(new C144771c(this, gVar, this.f391615b));
            }
        }
    }

    /* renamed from: c */
    public final void mo120199c(int i) {
        synchronized (this.f391616c) {
            if (this.f391617d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
            } else {
                this.f391614a.mo92061a(i);
            }
        }
    }
}
