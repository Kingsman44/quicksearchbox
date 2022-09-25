package com.google.common.p4522b;

/* renamed from: com.google.common.b.ea */
/* compiled from: PG */
abstract class C58411ea extends C58493hb {

    /* renamed from: a */
    private final int f156012a;

    public C58411ea(int i) {
        this.f156012a = i;
    }

    /* renamed from: a */
    public abstract C58495hd mo55191a();

    /* renamed from: b */
    public abstract Object mo55192b(int i);

    /* renamed from: d */
    public final C58528ij mo55194d() {
        if (this.f156012a == mo55191a().size()) {
            return mo55191a().keySet();
        }
        return new C58499hh(this);
    }

    /* renamed from: e */
    public final C58800sl mo55195e() {
        return new C58409dz(this);
    }

    public final Object get(Object obj) {
        Integer num = (Integer) mo55191a().get(obj);
        if (num == null) {
            return null;
        }
        return mo55192b(num.intValue());
    }

    public final int size() {
        return this.f156012a;
    }
}
