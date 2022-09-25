package android.support.p031v4.app;

import java.util.List;

/* renamed from: android.support.v4.app.d */
/* compiled from: PG */
final class C0235d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f870a;

    /* renamed from: b */
    final /* synthetic */ C0238dc f871b;

    public C0235d(List list, C0238dc dcVar) {
        this.f870a = list;
        this.f871b = dcVar;
    }

    public final void run() {
        if (this.f870a.contains(this.f871b)) {
            this.f870a.remove(this.f871b);
            C0254q.m576d(this.f871b);
        }
    }
}
