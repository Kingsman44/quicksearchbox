package androidx.camera.core.p069a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.core.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C1309aw implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1314ba f3761a;

    public /* synthetic */ C1309aw(C1314ba baVar) {
        this.f3761a = baVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1314ba baVar = this.f3761a;
        synchronized (baVar.f3773l) {
            baVar.f3776o = cVar;
        }
        return "DeferrableSurface-termination(" + baVar + ")";
    }
}
