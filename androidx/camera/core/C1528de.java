package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.core.de */
/* compiled from: PG */
final class C1528de implements C2166e {

    /* renamed from: a */
    final /* synthetic */ int f4217a;

    /* renamed from: b */
    final /* synthetic */ C1529df f4218b;

    public C1528de(C1529df dfVar, int i) {
        this.f4218b = dfVar;
        this.f4217a = i;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        synchronized (this.f4218b.f4219a) {
            this.f4218b.f4220b.put(this.f4217a, cVar);
        }
        return "getImageProxy(id: " + this.f4217a + ")";
    }
}
