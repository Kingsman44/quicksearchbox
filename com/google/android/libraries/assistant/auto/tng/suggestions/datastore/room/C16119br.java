package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.br */
/* compiled from: PG */
final class C16119br implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47594a;

    /* renamed from: b */
    final /* synthetic */ C16123bv f47595b;

    public C16119br(C16123bv bvVar, List list) {
        this.f47595b = bvVar;
        this.f47594a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47595b.f47604a.mo8181p();
        try {
            this.f47595b.f47605b.mo8307b(this.f47594a);
            this.f47595b.f47604a.mo8188w();
            this.f47595b.f47604a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47595b.f47604a.mo8183r();
            throw th;
        }
    }
}
