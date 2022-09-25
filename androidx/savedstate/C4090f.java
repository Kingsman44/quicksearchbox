package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.p054b.p055a.p057b.C0890d;
import androidx.p054b.p055a.p057b.C0891e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.savedstate.f */
/* compiled from: PG */
public final class C4090f {

    /* renamed from: a */
    public final C4088d f13082a = new C4088d();

    /* renamed from: b */
    private final C4091g f13083b;

    /* renamed from: c */
    private boolean f13084c;

    public C4090f(C4091g gVar) {
        this.f13083b = gVar;
    }

    /* renamed from: a */
    public final void mo8588a() {
        C2384o lifecycle = this.f13083b.getLifecycle();
        C69664n.m101060f(lifecycle, "owner.lifecycle");
        if (lifecycle.mo5789a() == C2383n.INITIALIZED) {
            lifecycle.mo5790b(new Recreator(this.f13083b));
            C4088d dVar = this.f13082a;
            C69664n.m101061g(lifecycle, "lifecycle");
            if (!dVar.f13077b) {
                lifecycle.mo5790b(new SavedStateRegistry$$ExternalSyntheticLambda0(dVar));
                dVar.f13077b = true;
                this.f13084c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public final void mo8589b(Bundle bundle) {
        if (!this.f13084c) {
            mo8588a();
        }
        C2384o lifecycle = this.f13083b.getLifecycle();
        C69664n.m101060f(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo5789a().mo5788a(C2383n.STARTED)) {
            C4088d dVar = this.f13082a;
            if (!dVar.f13077b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!dVar.f13079d) {
                dVar.f13078c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                dVar.f13079d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            C2383n a = lifecycle.mo5789a();
            sb.append(a);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(a)));
        }
    }

    /* renamed from: c */
    public final void mo8590c(Bundle bundle) {
        C69664n.m101061g(bundle, "outBundle");
        C4088d dVar = this.f13082a;
        C69664n.m101061g(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f13078c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0891e d = dVar.f13076a.mo3514d();
        while (d.hasNext()) {
            C0890d dVar2 = (C0890d) d.next();
            bundle2.putBundle((String) dVar2.f2965a, ((C4087c) dVar2.f2966b).mo530a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
