package androidx.camera.core.p069a;

import androidx.camera.core.C1477bw;
import androidx.p104d.p105a.C2168g;

/* renamed from: androidx.camera.core.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C1310ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1314ba f3762a;

    /* renamed from: b */
    public final /* synthetic */ String f3763b;

    public /* synthetic */ C1310ax(C1314ba baVar, String str) {
        this.f3762a = baVar;
        this.f3763b = str;
    }

    public final void run() {
        C1314ba baVar = this.f3762a;
        String str = this.f3763b;
        try {
            ((C2168g) baVar.f3777p).f6144b.get();
            baVar.mo4180f("Surface terminated", C1314ba.f3772k.decrementAndGet(), C1314ba.f3771j.get());
        } catch (Exception e) {
            C1477bw.m3980c("DeferrableSurface", "Unexpected surface termination for " + baVar + "\nStack Trace:\n" + str);
            synchronized (baVar.f3773l) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{baVar, Boolean.valueOf(baVar.f3775n), Integer.valueOf(baVar.f3774m)}), e);
            }
        }
    }
}
