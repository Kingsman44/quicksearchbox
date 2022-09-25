package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.core.cl */
/* compiled from: PG */
public final /* synthetic */ class C1508cl implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1517cu f4152a;

    public /* synthetic */ C1508cl(C1517cu cuVar) {
        this.f4152a = cuVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1517cu cuVar = this.f4152a;
        synchronized (cuVar.f4166a) {
            cuVar.f4173h = cVar;
        }
        return "ProcessingImageReader-close";
    }
}
