package p3186j$.util.stream;

import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.Y0 */
final class C41219Y0 extends C41222Z0 {

    /* renamed from: h */
    private final Object[] f107832h;

    C41219Y0(Spliterator spliterator, C41241e0 e0Var, Object[] objArr) {
        super(objArr.length, spliterator, e0Var);
        this.f107832h = objArr;
    }

    C41219Y0(C41219Y0 y0, Spliterator spliterator, long j, long j2) {
        super(y0, spliterator, j, j2, y0.f107832h.length);
        this.f107832h = y0.f107832h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41222Z0 mo43799a(Spliterator spliterator, long j, long j2) {
        return new C41219Y0(this, spliterator, j, j2);
    }

    public final void accept(Object obj) {
        int i = this.f107840f;
        if (i < this.f107841g) {
            this.f107840f = i + 1;
            this.f107832h[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f107840f));
    }
}
