package com.p232a.p233a;

/* renamed from: com.a.a.bu */
/* compiled from: PG */
class C4739bu extends C4743by {

    /* renamed from: b */
    public float f14879b;

    /* renamed from: c */
    public float f14880c;

    /* renamed from: d */
    final /* synthetic */ C4746ca f14881d;

    public C4739bu(C4746ca caVar, float f, float f2) {
        this.f14881d = caVar;
        this.f14879b = f;
        this.f14880c = f2;
    }

    /* renamed from: a */
    public void mo9628a(String str) {
        if (this.f14881d.mo9636i()) {
            C4746ca caVar = this.f14881d;
            C4741bw bwVar = caVar.f14916d;
            if (bwVar.f14887b) {
                caVar.f14913a.drawText(str, this.f14879b, this.f14880c, bwVar.f14889d);
            }
            C4746ca caVar2 = this.f14881d;
            C4741bw bwVar2 = caVar2.f14916d;
            if (bwVar2.f14888c) {
                caVar2.f14913a.drawText(str, this.f14879b, this.f14880c, bwVar2.f14890e);
            }
        }
        this.f14879b += this.f14881d.f14916d.f14889d.measureText(str);
    }
}
