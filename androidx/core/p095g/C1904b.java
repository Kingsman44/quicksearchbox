package androidx.core.p095g;

import androidx.core.content.p091b.C1872u;
import androidx.core.graphics.C1942h;

/* renamed from: androidx.core.g.b */
/* compiled from: PG */
final class C1904b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1918p f5778a;

    /* renamed from: b */
    final /* synthetic */ int f5779b;

    public C1904b(C1918p pVar, int i) {
        this.f5778a = pVar;
        this.f5779b = i;
    }

    public final void run() {
        C1918p pVar = this.f5778a;
        int i = this.f5779b;
        C1872u uVar = ((C1942h) pVar).f5851a;
        if (uVar != null) {
            uVar.mo2566a(i);
        }
    }
}
