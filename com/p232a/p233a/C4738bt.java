package com.p232a.p233a;

import android.graphics.Path;

/* renamed from: com.a.a.bt */
/* compiled from: PG */
final class C4738bt extends C4739bu {

    /* renamed from: a */
    final /* synthetic */ C4746ca f14877a;

    /* renamed from: e */
    private final Path f14878e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4738bt(C4746ca caVar, Path path, float f) {
        super(caVar, f, 0.0f);
        this.f14877a = caVar;
        this.f14878e = path;
    }

    /* renamed from: a */
    public final void mo9628a(String str) {
        if (this.f14877a.mo9636i()) {
            C4746ca caVar = this.f14877a;
            C4741bw bwVar = caVar.f14916d;
            if (bwVar.f14887b) {
                caVar.f14913a.drawTextOnPath(str, this.f14878e, this.f14879b, this.f14880c, bwVar.f14889d);
            }
            C4746ca caVar2 = this.f14877a;
            C4741bw bwVar2 = caVar2.f14916d;
            if (bwVar2.f14888c) {
                caVar2.f14913a.drawTextOnPath(str, this.f14878e, this.f14879b, this.f14880c, bwVar2.f14890e);
            }
        }
        this.f14879b += this.f14877a.f14916d.f14889d.measureText(str);
    }
}
