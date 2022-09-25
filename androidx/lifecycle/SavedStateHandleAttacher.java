package androidx.lifecycle;

/* compiled from: PG */
public final class SavedStateHandleAttacher implements C2389t {

    /* renamed from: a */
    private final C2351az f6507a;

    public SavedStateHandleAttacher(C2351az azVar) {
        this.f6507a = azVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == C2382m.ON_CREATE) {
            vVar.getLifecycle().mo5791c(this);
            this.f6507a.mo5762b();
            return;
        }
        new StringBuilder("Next event must be ON_CREATE, it was ").append(mVar);
        throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(mVar.toString()));
    }
}
