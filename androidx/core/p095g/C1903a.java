package androidx.core.p095g;

import android.graphics.Typeface;
import androidx.core.content.p091b.C1872u;
import androidx.core.graphics.C1942h;

/* renamed from: androidx.core.g.a */
/* compiled from: PG */
final class C1903a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1918p f5776a;

    /* renamed from: b */
    final /* synthetic */ Typeface f5777b;

    public C1903a(C1918p pVar, Typeface typeface) {
        this.f5776a = pVar;
        this.f5777b = typeface;
    }

    public final void run() {
        C1918p pVar = this.f5776a;
        Typeface typeface = this.f5777b;
        C1872u uVar = ((C1942h) pVar).f5851a;
        if (uVar != null) {
            uVar.mo2567b(typeface);
        }
    }
}
