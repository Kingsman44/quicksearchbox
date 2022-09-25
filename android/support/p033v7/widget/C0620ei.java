package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.ei */
/* compiled from: PG */
final class C0620ei extends C0642fd {

    /* renamed from: a */
    final /* synthetic */ C0622ek f2378a;

    public C0620ei(C0622ek ekVar) {
        this.f2378a = ekVar;
    }

    /* renamed from: a */
    public final void mo2831a() {
        C0622ek ekVar = this.f2378a;
        ekVar.f2383e = ekVar.f2381c.getItemCount();
        C0554bx bxVar = (C0554bx) this.f2378a.f2382d;
        bxVar.f2151a.mObservable.mo2879a();
        bxVar.mo2629e();
    }

    /* renamed from: b */
    public final void mo2832b(int i, int i2) {
        C0622ek ekVar = this.f2378a;
        ekVar.f2382d.mo2630f(ekVar, i, i2, (Object) null);
    }

    /* renamed from: c */
    public final void mo2833c(int i, int i2, Object obj) {
        C0622ek ekVar = this.f2378a;
        ekVar.f2382d.mo2630f(ekVar, i, i2, obj);
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        C0622ek ekVar = this.f2378a;
        ekVar.f2383e += i2;
        C0554bx bxVar = (C0554bx) ekVar.f2382d;
        bxVar.f2151a.mObservable.mo2882d(i + bxVar.mo2625a(ekVar), i2);
        C0622ek ekVar2 = this.f2378a;
        if (ekVar2.f2383e > 0 && ekVar2.f2381c.mStateRestorationPolicy$ar$edu == 2) {
            ((C0554bx) ekVar2.f2382d).mo2629e();
        }
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        C0622ek ekVar = this.f2378a;
        ekVar.f2383e -= i2;
        C0554bx bxVar = (C0554bx) ekVar.f2382d;
        bxVar.f2151a.mObservable.mo2883e(i + bxVar.mo2625a(ekVar), i2);
        C0622ek ekVar2 = this.f2378a;
        if (ekVar2.f2383e <= 0 && ekVar2.f2381c.mStateRestorationPolicy$ar$edu == 2) {
            ((C0554bx) ekVar2.f2382d).mo2629e();
        }
    }

    /* renamed from: f */
    public final void mo2836f() {
        ((C0554bx) this.f2378a.f2382d).mo2629e();
    }

    /* renamed from: g */
    public final void mo2837g(int i, int i2) {
        C0622ek ekVar = this.f2378a;
        C0554bx bxVar = (C0554bx) ekVar.f2382d;
        int a = bxVar.mo2625a(ekVar);
        bxVar.f2151a.mObservable.mo2880b(i + a, i2 + a);
    }
}
