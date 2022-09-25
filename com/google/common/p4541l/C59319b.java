package com.google.common.p4541l;

/* renamed from: com.google.common.l.b */
/* compiled from: PG */
final class C59319b implements Appendable {

    /* renamed from: a */
    int f157497a = 2;

    /* renamed from: b */
    final /* synthetic */ Appendable f157498b;

    /* renamed from: c */
    final /* synthetic */ String f157499c = ":";

    public C59319b(Appendable appendable) {
        this.f157498b = appendable;
    }

    public final Appendable append(char c) {
        if (this.f157497a == 0) {
            this.f157498b.append(this.f157499c);
            this.f157497a = 2;
        }
        this.f157498b.append(c);
        this.f157497a--;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
