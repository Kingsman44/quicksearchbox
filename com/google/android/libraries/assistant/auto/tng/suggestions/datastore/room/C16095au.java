package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.au */
/* compiled from: PG */
final class C16095au implements Callable {

    /* renamed from: a */
    final /* synthetic */ C16091aq f47564a;

    /* renamed from: b */
    final /* synthetic */ C16100az f47565b;

    public C16095au(C16100az azVar, C16091aq aqVar) {
        this.f47565b = azVar;
        this.f47564a = aqVar;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47565b.f47577a.mo8181p();
        try {
            this.f47565b.f47578b.mo8308c(this.f47564a);
            this.f47565b.f47577a.mo8188w();
            this.f47565b.f47577a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47565b.f47577a.mo8183r();
            throw th;
        }
    }
}
