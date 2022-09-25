package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ai */
/* compiled from: PG */
final class C16083ai implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47541a;

    /* renamed from: b */
    final /* synthetic */ C16087am f47542b;

    public C16083ai(C16087am amVar, List list) {
        this.f47542b = amVar;
        this.f47541a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f47542b.f47551a.mo8181p();
        try {
            this.f47542b.f47553c.mo8305c(this.f47541a);
            this.f47542b.f47551a.mo8188w();
            this.f47542b.f47551a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47542b.f47551a.mo8183r();
            throw th;
        }
    }
}
