package com.google.android.libraries.onegoogle.accountmenu.cards;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.o */
/* compiled from: PG */
public final class C30447o extends C30396bx {

    /* renamed from: a */
    private int f82257a;

    /* renamed from: b */
    private int f82258b;

    /* renamed from: c */
    private int f82259c;

    /* renamed from: d */
    private byte f82260d;

    /* renamed from: a */
    public final C30397by mo35960a() {
        if (this.f82260d == 7) {
            return new C30448p(this.f82257a, this.f82258b, this.f82259c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f82260d & 1) == 0) {
            sb.append(" cardCellId");
        }
        if ((this.f82260d & 2) == 0) {
            sb.append(" cardMainActionId");
        }
        if ((this.f82260d & 4) == 0) {
            sb.append(" cardSecondaryActionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35961b(int i) {
        this.f82257a = i;
        this.f82260d = (byte) (this.f82260d | 1);
    }

    /* renamed from: c */
    public final void mo35962c(int i) {
        this.f82258b = i;
        this.f82260d = (byte) (this.f82260d | 2);
    }

    /* renamed from: d */
    public final void mo35963d(int i) {
        this.f82259c = i;
        this.f82260d = (byte) (this.f82260d | 4);
    }
}
