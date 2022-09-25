package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.a.ak */
/* compiled from: PG */
public final class C145133ak extends C62934bn implements C63001dt {
    public C145133ak() {
        super(C145134al.f392236S);
    }

    /* renamed from: a */
    public final C145126ad mo120670a(int i) {
        return (C145126ad) ((C145134al) this.instance).f392259d.get(i);
    }

    /* renamed from: b */
    public final C145142at mo120671b(int i) {
        return (C145142at) ((C145134al) this.instance).f392260e.get(i);
    }

    /* renamed from: c */
    public final void mo120672c(Iterable iterable) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145134al alVar2 = C145134al.f392236S;
        C62971cq cqVar = alVar.f392240C;
        if (!cqVar.mo58948c()) {
            alVar.f392240C = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) alVar.f392240C);
    }

    /* renamed from: d */
    public final void mo120673d(C145125ac acVar) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145126ad adVar = (C145126ad) acVar.build();
        C145134al alVar2 = C145134al.f392236S;
        adVar.getClass();
        alVar.mo120678a();
        alVar.f392259d.add(adVar);
    }

    /* renamed from: e */
    public final void mo120674e(C145142at atVar) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145134al alVar2 = C145134al.f392236S;
        atVar.getClass();
        alVar.mo120679b();
        alVar.f392260e.add(atVar);
    }

    /* renamed from: f */
    public final void mo120675f(int i) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145134al alVar2 = C145134al.f392236S;
        alVar.mo120679b();
        alVar.f392260e.remove(i);
    }

    /* renamed from: g */
    public final void mo120676g(int i, C145125ac acVar) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145126ad adVar = (C145126ad) acVar.build();
        C145134al alVar2 = C145134al.f392236S;
        adVar.getClass();
        alVar.mo120678a();
        alVar.f392259d.set(i, adVar);
    }

    /* renamed from: h */
    public final void mo120677h(int i, C145142at atVar) {
        copyOnWrite();
        C145134al alVar = (C145134al) this.instance;
        C145134al alVar2 = C145134al.f392236S;
        atVar.getClass();
        alVar.mo120679b();
        alVar.f392260e.set(i, atVar);
    }
}
