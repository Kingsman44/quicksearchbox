package com.google.android.apps.search.assistant.verticals.p9880a.p9890f;

import com.google.android.gms.search.queries.p10874b.C145934f;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3825an.p3830c.p3831a.C49336m;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.assistant.p3825an.p3830c.p3831a.C49341r;
import com.google.assistant.p3825an.p3830c.p3831a.C49344u;
import com.google.assistant.p3825an.p3830c.p3831a.C49346w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62995dn;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65386e;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65387f;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65389h;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65390i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.f.a */
/* compiled from: PG */
public final /* synthetic */ class C130384a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65387f f357319a;

    public /* synthetic */ C130384a(C65387f fVar) {
        this.f357319a = fVar;
    }

    public final Object apply(Object obj) {
        C65387f fVar = this.f357319a;
        int i = C130390g.f357325a;
        C58485gu j = C58485gu.m89842j(((C49346w) obj).f127547a);
        HashMap hashMap = new HashMap();
        int size = j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C49344u uVar = (C49344u) j.get(i2);
            hashMap.put(uVar.f127543b, Collections.unmodifiableMap(uVar.f127544c));
        }
        C65389h hVar = (C65389h) C65390i.f177803b.createBuilder();
        for (C65386e eVar : fVar.f177801a) {
            C49267am amVar = eVar.f177796a;
            if (amVar == null) {
                amVar = C49267am.f127346f;
            }
            Stream stream = Collection.EL.stream(((C49341r) Optional.ofNullable((Map) hashMap.get(amVar.f127349b)).flatMap(new C130385b(amVar)).orElse(C49341r.f127536b)).f127538a);
            if (!eVar.f177797b.isEmpty()) {
                stream = stream.filter(new C130386c(C145934f.m237741b(eVar.f177797b)));
            }
            C49336m mVar = (C49336m) C49337n.f127527b.createBuilder();
            mVar.copyOnWrite();
            C49337n nVar = (C49337n) mVar.instance;
            nVar.mo53234a();
            C62947c.addAll((Iterable) stream.map(C130387d.f357322a).collect(Collectors.toCollection(C130388e.f357323a)), (List) nVar.f127529a);
            C49337n nVar2 = (C49337n) mVar.build();
            String str = amVar.f127349b;
            str.getClass();
            nVar2.getClass();
            hVar.copyOnWrite();
            C65390i iVar = (C65390i) hVar.instance;
            C62995dn dnVar = iVar.f177805a;
            if (!dnVar.f170058b) {
                iVar.f177805a = dnVar.mo58980a();
            }
            iVar.f177805a.put(str, nVar2);
        }
        return (C65390i) hVar.build();
    }
}
