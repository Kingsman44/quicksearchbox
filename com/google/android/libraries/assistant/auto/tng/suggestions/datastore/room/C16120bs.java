package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bs */
/* compiled from: PG */
final class C16120bs implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f47596a;

    /* renamed from: b */
    final /* synthetic */ C16123bv f47597b;

    public C16120bs(C16123bv bvVar, String str) {
        this.f47597b = bvVar;
        this.f47596a = str;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        C4057l d = this.f47597b.f47606c.mo8212d();
        String str = this.f47596a;
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        d.mo8204e(2, 0);
        this.f47597b.f47604a.mo8181p();
        try {
            d.mo8256a();
            this.f47597b.f47604a.mo8188w();
            this.f47597b.f47604a.mo8183r();
            this.f47597b.f47606c.mo8215g(d);
            return null;
        } catch (Throwable th) {
            this.f47597b.f47604a.mo8183r();
            this.f47597b.f47606c.mo8215g(d);
            throw th;
        }
    }
}
