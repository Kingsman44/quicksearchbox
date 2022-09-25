package androidx.lifecycle;

import androidx.savedstate.C4088d;

/* compiled from: PG */
final class SavedStateHandleController implements C2389t {

    /* renamed from: a */
    public boolean f6508a = false;

    /* renamed from: b */
    public final C2344as f6509b;

    /* renamed from: c */
    private final String f6510c;

    public SavedStateHandleController(String str, C2344as asVar) {
        this.f6510c = str;
        this.f6509b = asVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5720b(C4088d dVar, C2384o oVar) {
        if (!this.f6508a) {
            this.f6508a = true;
            oVar.mo5790b(this);
            dVar.mo8585b(this.f6510c, this.f6509b.f6545c);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == C2382m.ON_DESTROY) {
            this.f6508a = false;
            vVar.getLifecycle().mo5791c(this);
        }
    }
}
