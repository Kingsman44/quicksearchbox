package p3186j$.util.stream;

import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.y0 */
abstract class C41321y0 extends C41289q0 implements C41273m0 {
    C41321y0(C41273m0 m0Var, C41273m0 m0Var2) {
        super(m0Var, m0Var2);
    }

    /* renamed from: b */
    public final Object mo43645b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo43647f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        C41277n0 n0Var = this.f108004a;
        ((C41273m0) n0Var).mo43647f(i, obj);
        ((C41273m0) this.f108005b).mo43647f(i + ((int) ((C41273m0) n0Var).count()), obj);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        ((C41273m0) this.f108004a).mo43649g(obj);
        ((C41273m0) this.f108005b).mo43649g(obj);
    }

    /* renamed from: m */
    public final /* synthetic */ Object[] mo43652m(IntFunction intFunction) {
        return C41241e0.m72095m(this, intFunction);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("%s[%s.%s]", new Object[]{getClass().getName(), this.f108004a, this.f108005b});
        }
        return String.format("%s[size=%d]", new Object[]{getClass().getName(), Long.valueOf(count())});
    }
}
