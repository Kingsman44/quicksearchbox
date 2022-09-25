package androidx.lifecycle;

/* compiled from: PG */
class FullLifecycleObserverAdapter implements C2389t {

    /* renamed from: a */
    private final C2378i f6486a;

    /* renamed from: b */
    private final C2389t f6487b;

    public FullLifecycleObserverAdapter(C2378i iVar, C2389t tVar) {
        this.f6486a = iVar;
        this.f6487b = tVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        switch (mVar.ordinal()) {
            case 0:
                this.f6486a.mo3520gV(vVar);
                break;
            case 1:
                this.f6486a.mo3524gZ(vVar);
                break;
            case 2:
                this.f6486a.mo3523gY(vVar);
                break;
            case 3:
                this.f6486a.mo3522gX(vVar);
                break;
            case 4:
                this.f6486a.mo3525ha(vVar);
                break;
            case 5:
                this.f6486a.mo3521gW(vVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C2389t tVar = this.f6487b;
        if (tVar != null) {
            tVar.mo416eN(vVar, mVar);
        }
    }
}
