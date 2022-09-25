package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23736k;
import com.google.android.libraries.home.coreui.devicetile.model.C23747v;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23639a;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23640b;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23644f;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23646h;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23647i;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23648j;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23652n;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23653o;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23654p;
import p5462h.p5473f.C69614a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.c */
/* compiled from: PG */
public final class C23708c implements C23681b {
    /* renamed from: a */
    public final C23638a mo29027a(C23638a aVar, C23736k kVar, C23642d dVar, C23747v vVar) {
        C69657g gVar;
        C69664n.m101061g(kVar, "status");
        C69664n.m101061g(dVar, "template");
        C69664n.m101061g(vVar, "deviceType");
        if (kVar != C23736k.OK) {
            int i = C69649af.f186028a;
            gVar = new C69657g(C23693bl.class);
        } else if (C69664n.m101066l(dVar, C23644f.f64662a)) {
            int i2 = C69649af.f186028a;
            gVar = new C69657g(C23711cc.class);
        } else if (dVar instanceof C23640b) {
            int i3 = C69649af.f186028a;
            gVar = new C69657g(C23724m.class);
        } else if (dVar instanceof C23653o) {
            int i4 = C69649af.f186028a;
            gVar = new C69657g(C23701bt.class);
        } else if (dVar instanceof C23647i) {
            int i5 = C69649af.f186028a;
            gVar = new C69657g(C23711cc.class);
        } else if (dVar instanceof C23652n) {
            int i6 = C69649af.f186028a;
            gVar = new C69657g(C23707bz.class);
        } else if (dVar instanceof C23646h) {
            int i7 = C69649af.f186028a;
            gVar = new C69657g(C23707bz.class);
        } else if (dVar instanceof C23648j) {
            int i8 = C69649af.f186028a;
            gVar = new C69657g(C23696bo.class);
        } else if (dVar instanceof C23651m) {
            int i9 = C69649af.f186028a;
            gVar = new C69657g(C23698bq.class);
        } else if (dVar instanceof C23654p) {
            int i10 = C69649af.f186028a;
            gVar = new C69657g(C23714cf.class);
        } else if (dVar instanceof C23639a) {
            int i11 = C69649af.f186028a;
            gVar = new C69657g(C23715d.class);
        } else {
            int i12 = C69649af.f186028a;
            gVar = new C69657g(C23676av.class);
        }
        if (aVar != null && C69664n.m101066l(new C69657g(aVar.getClass()), gVar)) {
            return aVar;
        }
        Object newInstance = C69614a.m101026a(gVar).newInstance();
        C69664n.m101060f(newInstance, "{\n      behaviorClass.java.newInstance()\n    }");
        return (C23638a) newInstance;
    }
}
