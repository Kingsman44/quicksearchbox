package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.w */
/* compiled from: PG */
final class C16179w implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47730a;

    /* renamed from: b */
    final /* synthetic */ C16075aa f47731b;

    public C16179w(C16075aa aaVar, List list) {
        this.f47731b = aaVar;
        this.f47730a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47731b.f47535a.mo8181p();
        try {
            this.f47731b.f47536b.mo8307b(this.f47730a);
            this.f47731b.f47535a.mo8188w();
            this.f47731b.f47535a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47731b.f47535a.mo8183r();
            throw th;
        }
    }
}
