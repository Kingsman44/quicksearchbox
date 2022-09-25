package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.av */
/* compiled from: PG */
final class C16096av implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f47566a;

    /* renamed from: b */
    final /* synthetic */ C16100az f47567b;

    public C16096av(C16100az azVar, String str) {
        this.f47567b = azVar;
        this.f47566a = str;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        C4057l d = this.f47567b.f47579c.mo8212d();
        d.mo8206g(1, this.f47566a);
        this.f47567b.f47577a.mo8181p();
        try {
            d.mo8256a();
            this.f47567b.f47577a.mo8188w();
            this.f47567b.f47577a.mo8183r();
            this.f47567b.f47579c.mo8215g(d);
            return null;
        } catch (Throwable th) {
            this.f47567b.f47577a.mo8183r();
            this.f47567b.f47579c.mo8215g(d);
            throw th;
        }
    }
}
