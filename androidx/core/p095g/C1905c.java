package androidx.core.p095g;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: androidx.core.g.c */
/* compiled from: PG */
public final class C1905c {

    /* renamed from: a */
    private final C1918p f5780a;

    /* renamed from: b */
    private final Handler f5781b;

    public C1905c(C1918p pVar, Handler handler) {
        this.f5780a = pVar;
        this.f5781b = handler;
    }

    /* renamed from: a */
    public final void mo5058a(C1914l lVar) {
        int i = lVar.f5801b;
        if (i == 0) {
            Typeface typeface = lVar.f5800a;
            this.f5781b.post(new C1903a(this.f5780a, typeface));
            return;
        }
        this.f5781b.post(new C1904b(this.f5780a, i));
    }
}
