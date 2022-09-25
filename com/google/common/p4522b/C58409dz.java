package com.google.common.p4522b;

/* renamed from: com.google.common.b.dz */
/* compiled from: PG */
final class C58409dz extends C58518i {

    /* renamed from: b */
    final /* synthetic */ C58411ea f156008b;

    /* renamed from: c */
    private int f156009c = -1;

    /* renamed from: d */
    private final int f156010d;

    public C58409dz(C58411ea eaVar) {
        this.f156008b = eaVar;
        this.f156010d = eaVar.mo55191a().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo55143a() {
        this.f156009c++;
        while (true) {
            int i = this.f156009c;
            if (i < this.f156010d) {
                Object b = this.f156008b.mo55192b(i);
                if (b != null) {
                    return new C58472gh(this.f156008b.mo55191a().keySet().mo55229u().get(this.f156009c), b);
                }
                this.f156009c++;
            } else {
                this.f156164a = 3;
                return null;
            }
        }
    }
}
