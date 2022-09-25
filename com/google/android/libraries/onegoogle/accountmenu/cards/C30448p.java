package com.google.android.libraries.onegoogle.accountmenu.cards;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.p */
/* compiled from: PG */
final class C30448p extends C30397by {

    /* renamed from: a */
    private final int f82261a;

    /* renamed from: b */
    private final int f82262b;

    /* renamed from: c */
    private final int f82263c;

    public C30448p(int i, int i2, int i3) {
        this.f82261a = i;
        this.f82262b = i2;
        this.f82263c = i3;
    }

    /* renamed from: a */
    public final int mo35964a() {
        return this.f82261a;
    }

    /* renamed from: b */
    public final int mo35965b() {
        return this.f82262b;
    }

    /* renamed from: c */
    public final int mo35966c() {
        return this.f82263c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30397by) {
            C30397by byVar = (C30397by) obj;
            return this.f82261a == byVar.mo35964a() && this.f82262b == byVar.mo35965b() && this.f82263c == byVar.mo35966c();
        }
    }

    public final int hashCode() {
        return ((((this.f82261a ^ 1000003) * 1000003) ^ this.f82262b) * 1000003) ^ this.f82263c;
    }

    public final String toString() {
        int i = this.f82261a;
        int i2 = this.f82262b;
        int i3 = this.f82263c;
        return "CardVisualElementsInfo{cardCellId=" + i + ", cardMainActionId=" + i2 + ", cardSecondaryActionId=" + i3 + "}";
    }
}
