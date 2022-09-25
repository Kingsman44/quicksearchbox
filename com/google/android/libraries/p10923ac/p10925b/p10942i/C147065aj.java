package com.google.android.libraries.p10923ac.p10925b.p10942i;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.i.aj */
/* compiled from: PG */
public final /* synthetic */ class C147065aj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147069an f397094a;

    public /* synthetic */ C147065aj(C147069an anVar) {
        this.f397094a = anVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        C147069an anVar = this.f397094a;
        anVar.mo123898g();
        if (anVar.f397105j) {
            anVar.f397090e.setTransactionSuccessful();
        }
        try {
            anVar.f397090e.endTransaction();
            anVar.f397103h = false;
            return null;
        } catch (Throwable th) {
            anVar.f397103h = false;
            throw th;
        }
    }
}
