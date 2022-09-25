package com.google.common.p4522b;

import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.rh */
/* compiled from: PG */
public final class C58769rh extends C58738qd {

    /* renamed from: a */
    public static final C58546ja f156540a;

    /* renamed from: b */
    private final C58495hd f156541b;

    /* renamed from: c */
    private final C58495hd f156542c;

    /* renamed from: d */
    private final int[] f156543d;

    /* renamed from: e */
    private final int[] f156544e;

    static {
        C58485gu m = C58485gu.m89845m();
        C58733pz pzVar = C58733pz.f156496a;
        f156540a = new C58769rh(m, pzVar, pzVar);
    }

    public C58769rh(C58485gu guVar, C58528ij ijVar, C58528ij ijVar2) {
        C58495hd c = C58662ni.m90344c(ijVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            linkedHashMap.put(lA.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C58800sl lA2 = ijVar2.iterator();
        while (lA2.hasNext()) {
            linkedHashMap2.put(lA2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[guVar.size()];
        int[] iArr2 = new int[guVar.size()];
        for (int i = 0; i < guVar.size(); i++) {
            C58784rw rwVar = (C58784rw) guVar.get(i);
            Object b = rwVar.mo55972b();
            Object a = rwVar.mo55971a();
            Object c2 = rwVar.mo55973c();
            iArr[i] = ((Integer) Objects.requireNonNull((Integer) c.get(b))).intValue();
            Map map = (Map) Objects.requireNonNull((Map) linkedHashMap.get(b));
            iArr2[i] = map.size();
            m90601z(b, a, map.put(a, c2), c2);
            ((Map) Objects.requireNonNull((Map) linkedHashMap2.get(a))).put(b, c2);
        }
        this.f156543d = iArr;
        this.f156544e = iArr2;
        C58490gz gzVar = new C58490gz(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            gzVar.mo55429h(entry.getKey(), C58495hd.m89898l((Map) entry.getValue()));
        }
        this.f156541b = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            gzVar2.mo55429h(entry2.getKey(), C58495hd.m89898l((Map) entry2.getValue()));
        }
        this.f156542c = gzVar2.mo55427f(true);
    }

    /* renamed from: n */
    public final int mo55196n() {
        return this.f156543d.length;
    }

    /* renamed from: o */
    public final C58495hd mo55197o() {
        return C58495hd.m89898l(this.f156542c);
    }

    /* renamed from: p */
    public final C58495hd mo55198p() {
        return C58495hd.m89898l(this.f156541b);
    }

    /* renamed from: q */
    public final C58544iz mo55199q() {
        C58495hd c = C58662ni.m90344c(C58495hd.m89898l(this.f156542c).keySet());
        int[] iArr = new int[mo55544w().size()];
        C58800sl lA = mo55544w().iterator();
        int i = 0;
        while (lA.hasNext()) {
            iArr[i] = ((Integer) Objects.requireNonNull((Integer) c.get(((C58784rw) lA.next()).mo55971a()))).intValue();
            i++;
        }
        return C58544iz.m90086a(this, this.f156543d, iArr);
    }

    /* renamed from: r */
    public final C58784rw mo55200r(int i) {
        Map.Entry entry = (Map.Entry) this.f156541b.entrySet().mo55229u().get(this.f156543d[i]);
        Map.Entry entry2 = (Map.Entry) ((C58495hd) entry.getValue()).entrySet().mo55229u().get(this.f156544e[i]);
        return m90096x(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* renamed from: s */
    public final Object mo55201s(int i) {
        int i2 = this.f156543d[i];
        return ((C58495hd) this.f156541b.values().mo55229u().get(i2)).values().mo55229u().get(this.f156544e[i]);
    }

    /* renamed from: t */
    public final /* synthetic */ Map mo55202t() {
        return C58495hd.m89898l(this.f156541b);
    }
}
