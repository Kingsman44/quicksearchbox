package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.ek */
/* compiled from: PG */
final class C0622ek {

    /* renamed from: a */
    public final C0761jo f2379a;

    /* renamed from: b */
    public final C0717hy f2380b;

    /* renamed from: c */
    public final C0640fb f2381c;

    /* renamed from: d */
    final C0621ej f2382d;

    /* renamed from: e */
    int f2383e;

    /* renamed from: f */
    private final C0642fd f2384f;

    public C0622ek(C0640fb fbVar, C0621ej ejVar, C0762jp jpVar, C0717hy hyVar) {
        C0620ei eiVar = new C0620ei(this);
        this.f2384f = eiVar;
        this.f2381c = fbVar;
        this.f2382d = ejVar;
        this.f2379a = jpVar.mo3274b(this);
        this.f2380b = hyVar;
        this.f2383e = fbVar.getItemCount();
        fbVar.mObservable.registerObserver(eiVar);
    }
}
