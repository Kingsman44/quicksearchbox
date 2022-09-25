package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cx */
/* compiled from: PG */
final class C16152cx implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47641a;

    /* renamed from: b */
    final /* synthetic */ C16156da f47642b;

    public C16152cx(C16156da daVar, List list) {
        this.f47642b = daVar;
        this.f47641a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47642b.f47656a.mo8181p();
        try {
            this.f47642b.f47657b.mo8307b(this.f47641a);
            this.f47642b.f47656a.mo8188w();
            this.f47642b.f47656a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47642b.f47656a.mo8183r();
            throw th;
        }
    }
}
