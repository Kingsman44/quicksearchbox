package com.google.android.libraries.home.coreui.devicetile.model;

import com.google.android.libraries.home.p1940a.p1943c.C23419av;
import java.util.ArrayList;
import java.util.EnumMap;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.q */
/* compiled from: PG */
final class C23742q extends C69665o implements C69615a {

    /* renamed from: a */
    public static final C23742q f65092a = new C23742q();

    public C23742q() {
        super(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C23741p[] values = C23741p.values();
        ArrayList arrayList = new ArrayList();
        for (C23741p pVar : values) {
            if (pVar.f65088bP) {
                arrayList.add(pVar);
            }
        }
        EnumMap enumMap = new EnumMap(C23419av.class);
        for (Object next : arrayList) {
            enumMap.put(((C23741p) next).f65087bO, next);
        }
        return enumMap;
    }
}
