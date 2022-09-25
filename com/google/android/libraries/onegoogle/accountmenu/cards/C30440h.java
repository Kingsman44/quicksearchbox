package com.google.android.libraries.onegoogle.accountmenu.cards;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.h */
/* compiled from: PG */
final class C30440h extends C30355aj {

    /* renamed from: a */
    public byte f82240a;

    /* renamed from: b */
    private boolean f82241b;

    public C30440h() {
    }

    public C30440h(C30356ak akVar) {
        this.f82241b = ((C30441i) akVar).f82242a;
        this.f82240a = 3;
    }

    /* renamed from: a */
    public final C30356ak mo35932a() {
        if (this.f82240a == 3) {
            return new C30441i(this.f82241b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f82240a & 1) == 0) {
            sb.append(" showingCriticalSecurityAlert");
        }
        if ((this.f82240a & 2) == 0) {
            sb.append(" showingCriticalStorageAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35933b(boolean z) {
        this.f82241b = z;
        this.f82240a = (byte) (this.f82240a | 1);
    }
}
