package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.gms.measurement.a.ac */
/* compiled from: PG */
public final class C145125ac extends C62934bn implements C63001dt {
    public C145125ac() {
        super(C145126ad.f392211g);
    }

    /* renamed from: a */
    public final C145130ah mo120662a(int i) {
        return (C145130ah) ((C145126ad) this.instance).f392214b.get(i);
    }

    /* renamed from: b */
    public final void mo120663b(C145129ag agVar) {
        copyOnWrite();
        C145126ad adVar = (C145126ad) this.instance;
        C145130ah ahVar = (C145130ah) agVar.build();
        C145126ad adVar2 = C145126ad.f392211g;
        ahVar.getClass();
        adVar.mo120667a();
        adVar.f392214b.add(ahVar);
    }

    /* renamed from: c */
    public final void mo120664c(C145130ah ahVar) {
        copyOnWrite();
        C145126ad adVar = (C145126ad) this.instance;
        C145126ad adVar2 = C145126ad.f392211g;
        ahVar.getClass();
        adVar.mo120667a();
        adVar.f392214b.add(ahVar);
    }

    /* renamed from: d */
    public final void mo120665d(int i) {
        copyOnWrite();
        C145126ad adVar = (C145126ad) this.instance;
        C145126ad adVar2 = C145126ad.f392211g;
        adVar.mo120667a();
        adVar.f392214b.remove(i);
    }

    /* renamed from: e */
    public final void mo120666e(int i, C145130ah ahVar) {
        copyOnWrite();
        C145126ad adVar = (C145126ad) this.instance;
        C145126ad adVar2 = C145126ad.f392211g;
        ahVar.getClass();
        adVar.mo120667a();
        adVar.f392214b.set(i, ahVar);
    }
}
