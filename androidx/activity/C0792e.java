package androidx.activity;

import androidx.activity.result.C0815b;
import androidx.activity.result.C0819f;
import androidx.activity.result.p046a.C0808a;

/* renamed from: androidx.activity.e */
/* compiled from: PG */
final class C0792e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2734a;

    /* renamed from: b */
    final /* synthetic */ C0808a f2735b;

    /* renamed from: c */
    final /* synthetic */ C0794g f2736c;

    public C0792e(C0794g gVar, int i, C0808a aVar) {
        this.f2736c = gVar;
        this.f2734a = i;
        this.f2735b = aVar;
    }

    public final void run() {
        C0815b bVar;
        C0794g gVar = this.f2736c;
        int i = this.f2734a;
        Object obj = this.f2735b.f2773a;
        String str = (String) gVar.f2759c.get(Integer.valueOf(i));
        if (str != null) {
            C0819f fVar = (C0819f) gVar.f2762f.get(str);
            if (fVar == null || (bVar = fVar.f2780a) == null) {
                gVar.f2764h.remove(str);
                gVar.f2763g.put(str, obj);
            } else if (gVar.f2761e.remove(str)) {
                bVar.onActivityResult(obj);
            }
        }
    }
}
