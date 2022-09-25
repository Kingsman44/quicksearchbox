package com.google.android.libraries.storage.p3315b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.b.j */
/* compiled from: PG */
public final /* synthetic */ class C42855j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42862q f112147a;

    /* renamed from: b */
    public final /* synthetic */ String f112148b = "VACUUM";

    public /* synthetic */ C42855j(C42862q qVar) {
        this.f112147a = qVar;
    }

    public final Object call() {
        C42862q qVar = this.f112147a;
        qVar.f112162a.execSQL(this.f112148b);
        return null;
    }
}
