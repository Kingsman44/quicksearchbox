package com.google.android.libraries.lens.view.gallery.p2111d;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.q */
/* compiled from: PG */
public final class C26371q {

    /* renamed from: a */
    public final int f71728a;

    /* renamed from: b */
    private final int f71729b;

    /* renamed from: c */
    private final int f71730c;

    /* renamed from: d */
    private final Integer f71731d;

    public C26371q(int i, int i2, boolean z, Integer num) {
        this.f71729b = i;
        this.f71731d = num;
        this.f71730c = true != z ? i2 : 0;
        this.f71728a = i2;
    }

    /* renamed from: d */
    static C26371q m48628d(int i) {
        return new C26371q(i, 0, false, (Integer) null);
    }

    /* renamed from: e */
    static C26371q m48629e(int i, int i2, Integer num) {
        return new C26371q(i, i2, false, num);
    }

    /* renamed from: f */
    static C26371q m48630f(int i, int i2, Integer num) {
        return new C26371q(i, i2, true, num);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31556a(int i) {
        return (i - this.f71729b) - mo31557b();
    }

    /* renamed from: b */
    public final int mo31557b() {
        return this.f71731d == null ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo31559g(int i) {
        int i2 = this.f71729b;
        return i >= i2 && i < i2 + (this.f71728a + mo31557b());
    }

    /* renamed from: h */
    public final boolean mo31560h() {
        return this.f71728a + mo31557b() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo31561i(int i) {
        return i >= (this.f71729b + mo31557b()) + this.f71730c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo31558c(int i) {
        if (i >= this.f71729b + mo31557b()) {
            return 0;
        }
        Integer num = this.f71731d;
        num.getClass();
        return num.intValue();
    }
}
