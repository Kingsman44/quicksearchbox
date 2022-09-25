package p3186j$.util.concurrent;

/* renamed from: j$.util.concurrent.a */
abstract class C41064a extends C41079p {

    /* renamed from: i */
    final ConcurrentHashMap f107593i;

    /* renamed from: j */
    C41074k f107594j;

    C41064a(C41074k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, 0, i2);
        this.f107593i = concurrentHashMap;
        mo43572c();
    }

    public final boolean hasMoreElements() {
        return this.f107614b != null;
    }

    public final boolean hasNext() {
        return this.f107614b != null;
    }

    public final void remove() {
        C41074k kVar = this.f107594j;
        if (kVar != null) {
            this.f107594j = null;
            this.f107593i.mo43528h(kVar.f107606b, (Object) null, (Object) null);
            return;
        }
        throw new IllegalStateException();
    }
}
