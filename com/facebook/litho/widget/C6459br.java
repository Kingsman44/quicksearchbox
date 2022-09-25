package com.facebook.litho.widget;

/* renamed from: com.facebook.litho.widget.br */
/* compiled from: PG */
final class C6459br implements C6537eo {

    /* renamed from: a */
    final /* synthetic */ C6474cf f19141a;

    public C6459br(C6474cf cfVar) {
        this.f19141a = cfVar;
    }

    /* renamed from: a */
    public final void mo13320a(int i, int i2, int i3, int i4, int i5) {
        C6474cf cfVar = this.f19141a;
        cfVar.f19225r = i;
        cfVar.f19226s = i2;
        cfVar.f19182B.f19466b = false;
        cfVar.mo13570z();
        C6474cf cfVar2 = this.f19141a;
        int i6 = cfVar2.f19228u;
        if (i6 != -1) {
            int max = Math.max(i6, i2 - i);
            int i7 = (int) (((float) max) * cfVar2.f19214g);
            int min = Math.min(max + i + i7, cfVar2.f19203a.size() - 1);
            for (int max2 = Math.max(0, i - i7); max2 <= min; max2++) {
                ((C6548m) cfVar2.f19203a.get(max2)).mo13643o(max2, i, i2);
            }
        }
    }
}
