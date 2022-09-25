package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bi */
/* compiled from: PG */
final class C16110bi implements Callable {

    /* renamed from: a */
    final /* synthetic */ C16112bk f47587a;

    /* renamed from: b */
    final /* synthetic */ int f47588b;

    public C16110bi(C16112bk bkVar, int i) {
        this.f47587a = bkVar;
        this.f47588b = i;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        C4057l d = this.f47587a.f47593b.mo8212d();
        d.mo8204e(1, (long) C16088an.m32968e(this.f47588b));
        this.f47587a.f47592a.mo8181p();
        try {
            d.mo8256a();
            this.f47587a.f47592a.mo8188w();
            this.f47587a.f47592a.mo8183r();
            this.f47587a.f47593b.mo8215g(d);
            return null;
        } catch (Throwable th) {
            this.f47587a.f47592a.mo8183r();
            this.f47587a.f47593b.mo8215g(d);
            throw th;
        }
    }
}
