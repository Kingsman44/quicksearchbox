package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.av */
/* compiled from: PG */
public final class C135150av implements C135202v {

    /* renamed from: a */
    final /* synthetic */ Set f368113a;

    /* renamed from: b */
    final /* synthetic */ C135157bb f368114b;

    public C135150av(Set set, C135157bb bbVar) {
        this.f368113a = set;
        this.f368114b = bbVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo112131a(C135205y yVar) {
        Set<String> set = this.f368113a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        for (String valueOf : set) {
            arrayList.add("Session::OnDeviceMediaContent::".concat(String.valueOf(valueOf)));
        }
        C58495hd a = yVar.mo112163a(this.f368114b.f368141g, C69540x.m100846ab(arrayList));
        C135157bb bbVar = this.f368114b;
        ArrayList<C134508n> arrayList2 = new ArrayList<>(((C58729pv) a).f156487c);
        for (Map.Entry value : a.entrySet()) {
            C62921ba baVar = bbVar.f368137c;
            arrayList2.add((C134508n) C62942bv.parseFrom((C62942bv) C134508n.f366301f, (C63088z) value.getValue(), baVar));
        }
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
        for (C134508n nVar : arrayList2) {
            arrayList3.add(new C69685i(nVar.f366305c, nVar));
        }
        return C69505av.m100874p(arrayList3);
    }
}
