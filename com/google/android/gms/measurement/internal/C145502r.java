package com.google.android.gms.measurement.internal;

import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.android.gms.measurement.p10848a.C145123aa;
import com.google.android.gms.measurement.p10848a.C145124ab;
import com.google.android.gms.measurement.p10848a.C145138ap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68925s;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* compiled from: PG */
final class C145502r {

    /* renamed from: a */
    public boolean f393403a;

    /* renamed from: b */
    public C145138ap f393404b;

    /* renamed from: c */
    public BitSet f393405c;

    /* renamed from: d */
    public BitSet f393406d;

    /* renamed from: e */
    public Map f393407e;

    /* renamed from: f */
    final /* synthetic */ C145507w f393408f;

    /* renamed from: g */
    private String f393409g;

    /* renamed from: h */
    private Map f393410h;

    public C145502r(C145507w wVar, String str) {
        this.f393408f = wVar;
        this.f393409g = str;
        this.f393403a = true;
        this.f393405c = new BitSet();
        this.f393406d = new BitSet();
        this.f393410h = new C0977g();
        this.f393407e = new C0977g();
    }

    /* renamed from: a */
    public final List mo121301a() {
        Map map = this.f393410h;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(((C0984n) map).f3122d);
        for (Integer intValue : this.f393410h.keySet()) {
            int intValue2 = intValue.intValue();
            Long l = (Long) this.f393410h.get(Integer.valueOf(intValue2));
            if (l != null) {
                C145123aa aaVar = (C145123aa) C145124ab.f392206d.createBuilder();
                aaVar.copyOnWrite();
                C145124ab abVar = (C145124ab) aaVar.instance;
                abVar.f392208a |= 1;
                abVar.f392209b = intValue2;
                long longValue = l.longValue();
                aaVar.copyOnWrite();
                C145124ab abVar2 = (C145124ab) aaVar.instance;
                abVar2.f392208a |= 2;
                abVar2.f392210c = longValue;
                arrayList.add((C145124ab) aaVar.build());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo121302b(C145505u uVar) {
        int a = uVar.mo121304a();
        Boolean bool = uVar.f393419d;
        if (bool != null) {
            this.f393406d.set(a, bool.booleanValue());
        }
        Boolean bool2 = uVar.f393420e;
        if (bool2 != null) {
            this.f393405c.set(a, bool2.booleanValue());
        }
        if (uVar.f393421f != null) {
            Map map = this.f393410h;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = uVar.f393421f.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f393410h.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (uVar.f393422g != null) {
            Map map2 = this.f393407e;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f393407e.put(valueOf2, list);
            }
            if (uVar.mo121306c()) {
                list.clear();
            }
            if (C68925s.m99952c() && this.f393408f.f393011w.f392937g.mo120776m(this.f393409g, C145313dl.f392716W) && uVar.mo121305b()) {
                list.clear();
            }
            if (!C68925s.m99952c() || !this.f393408f.f393011w.f392937g.mo120776m(this.f393409g, C145313dl.f392716W)) {
                list.add(Long.valueOf(uVar.f393422g.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(uVar.f393422g.longValue() / 1000);
            if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }

    public C145502r(C145507w wVar, String str, C145138ap apVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f393408f = wVar;
        this.f393409g = str;
        this.f393405c = bitSet;
        this.f393406d = bitSet2;
        this.f393410h = map;
        this.f393407e = new C0977g();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f393407e.put(num, arrayList);
        }
        this.f393403a = false;
        this.f393404b = apVar;
    }
}
