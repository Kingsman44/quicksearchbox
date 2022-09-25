package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.y */
/* compiled from: PG */
final class C16181y implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47734a;

    /* renamed from: b */
    final /* synthetic */ C16075aa f47735b;

    public C16181y(C16075aa aaVar, List list) {
        this.f47735b = aaVar;
        this.f47734a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47735b.f47535a.mo8181p();
        try {
            this.f47735b.f47538d.mo8305c(this.f47734a);
            this.f47735b.f47535a.mo8188w();
            this.f47735b.f47535a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47735b.f47535a.mo8183r();
            throw th;
        }
    }
}
