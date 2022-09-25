package com.google.android.libraries.storage.p3315b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.b.k */
/* compiled from: PG */
public final /* synthetic */ class C42856k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42862q f112149a;

    /* renamed from: b */
    public final /* synthetic */ Callable f112150b;

    public /* synthetic */ C42856k(C42862q qVar, Callable callable) {
        this.f112149a = qVar;
        this.f112150b = callable;
    }

    public final Object call() {
        C42862q qVar = this.f112149a;
        Callable callable = this.f112150b;
        qVar.f112165d.mo45898b();
        try {
            return callable.call();
        } finally {
            qVar.f112165d.mo45897a();
        }
    }
}
