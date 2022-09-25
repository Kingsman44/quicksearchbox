package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.d.h */
/* compiled from: PG */
public final /* synthetic */ class C60981h {
    /* renamed from: a */
    public static C60987n m93180a(C60983j jVar, C60987n nVar, C61012g gVar, List list) {
        C60991r rVar = (C60991r) nVar;
        if (jVar.mo57486s(rVar.f165128a)) {
            C60987n f = jVar.mo57471f(rVar.f165128a);
            if (f instanceof C60980g) {
                return ((C60980g) f).mo57451a(gVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{rVar.f165128a}));
        } else if ("hasOwnProperty".equals(rVar.f165128a)) {
            C61013h.m93265g("hasOwnProperty", 1, list);
            return jVar.mo57486s(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57475i()) ? C60987n.f165119k : C60987n.f165120l;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{rVar.f165128a}));
        }
    }

    /* renamed from: b */
    public static Iterator m93181b(Map map) {
        return new C60982i(map.keySet().iterator());
    }
}
