package androidx.camera.camera2.p063b;

import androidx.lifecycle.C2330ae;
import androidx.lifecycle.C2331af;
import androidx.lifecycle.LiveData;

/* renamed from: androidx.camera.camera2.b.ap */
/* compiled from: PG */
final class C1093ap extends C2331af {

    /* renamed from: i */
    private LiveData f3269i;

    /* renamed from: j */
    private final Object f3270j;

    public C1093ap(Object obj) {
        this.f3270j = obj;
    }

    /* renamed from: a */
    public final Object mo3842a() {
        LiveData liveData = this.f3269i;
        return liveData == null ? this.f3270j : liveData.mo3842a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3843b(LiveData liveData) {
        C2330ae aeVar;
        LiveData liveData2 = this.f3269i;
        if (!(liveData2 == null || (aeVar = (C2330ae) this.f6530h.mo3498b(liveData2)) == null)) {
            aeVar.f6527a.mo5679j(aeVar);
        }
        this.f3269i = liveData;
        super.mo5727n(liveData, new C1092ao(this));
    }
}
