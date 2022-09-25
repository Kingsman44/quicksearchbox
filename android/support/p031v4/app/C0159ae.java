package android.support.p031v4.app;

import androidx.activity.result.C0816c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: android.support.v4.app.ae */
/* compiled from: PG */
final class C0159ae extends C0816c {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f702a;

    public C0159ae(AtomicReference atomicReference) {
        this.f702a = atomicReference;
    }

    /* renamed from: a */
    public final void mo525a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo526b(Object obj) {
        C0816c cVar = (C0816c) this.f702a.get();
        if (cVar != null) {
            cVar.mo526b(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
