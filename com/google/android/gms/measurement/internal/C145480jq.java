package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.jq */
/* compiled from: PG */
final class C145480jq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145488jy f393329a;

    public C145480jq(C145488jy jyVar) {
        this.f393329a = jyVar;
    }

    public final void run() {
        C145488jy jyVar = this.f393329a;
        jyVar.mo120966as().mo120904g();
        jyVar.f393362j = new C145342en(jyVar);
        C145228ah ahVar = new C145228ah(jyVar);
        ahVar.mo121195K();
        jyVar.f393355c = ahVar;
        C145222ab d = jyVar.mo121211d();
        C145351ew ewVar = jyVar.f393353a;
        C143919bh.m233958a(ewVar);
        d.f392550a = ewVar;
        C145458iv ivVar = new C145458iv(jyVar);
        ivVar.mo121195K();
        jyVar.f393361i = ivVar;
        C145507w wVar = new C145507w(jyVar);
        wVar.mo121195K();
        jyVar.f393358f = wVar;
        C145421hl hlVar = new C145421hl(jyVar);
        hlVar.mo121195K();
        jyVar.f393360h = hlVar;
        C145476jm jmVar = new C145476jm(jyVar);
        jmVar.mo121195K();
        jyVar.f393357e = jmVar;
        jyVar.f393356d = new C145333ee(jyVar);
        if (jyVar.f393367o != jyVar.f393368p) {
            jyVar.mo120965ar().f392795c.mo120896c("Not all upload components initialized", Integer.valueOf(jyVar.f393367o), Integer.valueOf(jyVar.f393368p));
        }
        jyVar.f393364l = true;
        C145488jy jyVar2 = this.f393329a;
        jyVar2.mo120966as().mo120904g();
        C145228ah ahVar2 = jyVar2.f393355c;
        C145488jy.m236409I(ahVar2);
        ahVar2.mo120822u();
        C145336eh ehVar = jyVar2.f393361i.f393283c;
        ehVar.mo120915a();
        if (ehVar.f392834a == 0) {
            C145336eh ehVar2 = jyVar2.f393361i.f393283c;
            C143919bh.m233958a(jyVar2.f393363k);
            ehVar2.mo120916b(System.currentTimeMillis());
        }
        jyVar2.mo121202C();
    }
}
