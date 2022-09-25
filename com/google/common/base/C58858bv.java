package com.google.common.base;

/* renamed from: com.google.common.base.bv */
/* compiled from: PG */
final class C58858bv extends C58867cd {

    /* renamed from: b */
    final /* synthetic */ C58859bw f156658b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58858bv(C58859bw bwVar, C58869cf cfVar, CharSequence charSequence) {
        super(cfVar, charSequence);
        this.f156658b = bwVar;
    }

    /* renamed from: b */
    public final int mo56145b(int i) {
        return i + this.f156658b.f156659a.length();
    }

    /* renamed from: c */
    public final int mo56146c(int i) {
        int length = this.f156658b.f156659a.length();
        int length2 = this.f156668c.length() - length;
        while (i <= length2) {
            int i2 = 0;
            while (i2 < length) {
                if (this.f156668c.charAt(i2 + i) != this.f156658b.f156659a.charAt(i2)) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }
}
