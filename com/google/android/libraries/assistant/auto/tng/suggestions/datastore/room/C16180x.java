package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.x */
/* compiled from: PG */
final class C16180x implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47732a;

    /* renamed from: b */
    final /* synthetic */ C16075aa f47733b;

    public C16180x(C16075aa aaVar, List list) {
        this.f47733b = aaVar;
        this.f47732a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47733b.f47535a.mo8181p();
        try {
            this.f47733b.f47537c.mo8305c(this.f47732a);
            this.f47733b.f47535a.mo8188w();
            this.f47733b.f47535a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47733b.f47535a.mo8183r();
            throw th;
        }
    }
}
