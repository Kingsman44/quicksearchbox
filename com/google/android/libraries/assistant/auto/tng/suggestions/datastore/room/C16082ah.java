package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ah */
/* compiled from: PG */
final class C16082ah implements Callable {

    /* renamed from: a */
    final /* synthetic */ C16077ac f47539a;

    /* renamed from: b */
    final /* synthetic */ C16087am f47540b;

    public C16082ah(C16087am amVar, C16077ac acVar) {
        this.f47540b = amVar;
        this.f47539a = acVar;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47540b.f47551a.mo8181p();
        try {
            this.f47540b.f47552b.mo8308c(this.f47539a);
            this.f47540b.f47551a.mo8188w();
            this.f47540b.f47551a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47540b.f47551a.mo8183r();
            throw th;
        }
    }
}
