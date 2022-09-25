package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cy */
/* compiled from: PG */
final class C16153cy implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f47643a;

    /* renamed from: b */
    final /* synthetic */ C16156da f47644b;

    public C16153cy(C16156da daVar, String str) {
        this.f47644b = daVar;
        this.f47643a = str;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        C4057l d = this.f47644b.f47658c.mo8212d();
        String str = this.f47643a;
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        d.mo8204e(2, 0);
        this.f47644b.f47656a.mo8181p();
        try {
            d.mo8256a();
            this.f47644b.f47656a.mo8188w();
            this.f47644b.f47656a.mo8183r();
            this.f47644b.f47658c.mo8215g(d);
            return null;
        } catch (Throwable th) {
            this.f47644b.f47656a.mo8183r();
            this.f47644b.f47658c.mo8215g(d);
            throw th;
        }
    }
}
