package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18580a;
import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b;
import com.google.android.libraries.assistant.pcp.p1546d.C18577e;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.p4750c.C62950b;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.b.j */
/* compiled from: PG */
public final /* synthetic */ class C18539j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52528a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f52529b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f52530c;

    /* renamed from: d */
    public final /* synthetic */ C18718c f52531d;

    /* renamed from: e */
    public final /* synthetic */ C18777i f52532e;

    public /* synthetic */ C18539j(C18551v vVar, C58485gu guVar, C53306j jVar, C18718c cVar, C18777i iVar) {
        this.f52528a = vVar;
        this.f52529b = guVar;
        this.f52530c = jVar;
        this.f52531d = cVar;
        this.f52532e = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C18551v vVar = this.f52528a;
        C58485gu guVar = this.f52529b;
        C53306j jVar = this.f52530c;
        C18718c cVar = this.f52531d;
        C18777i iVar = this.f52532e;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            try {
                e.mo55395g((C18577e) C60856cj.m92909r((C60870cx) guVar.get(i)));
            } catch (ExecutionException unused) {
            }
        }
        C58485gu f = e.mo55394f();
        jVar.name();
        HashSet hashSet = new HashSet();
        EnumMap enumMap = new EnumMap(C18981k.class);
        Collection.EL.stream(f).filter(new C18547r(C62950b.m95471b(vVar.f52559c), iVar)).forEach(new C18548s(hashSet, enumMap));
        Stream map = Collection.EL.stream(f).map(C18549t.f52555a);
        Objects.requireNonNull(hashSet);
        C58528ij ijVar = (C58528ij) map.filter(Predicate.CC.not(new C18550u(hashSet))).collect(C58370cn.f155947b);
        ArrayList arrayList = new ArrayList();
        C18581b bVar = vVar.f52562f;
        if (ijVar.isEmpty()) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = bVar.f52605b.mo24087b((Set) Collection.EL.stream(ijVar).map(C18580a.f52603a).collect(C58370cn.f155947b));
        }
        arrayList.add(cxVar);
        Map.EL.forEach(enumMap, new C18529a(vVar, arrayList, cVar, jVar));
        return C60856cj.m92900i((C58485gu) Collection.EL.stream(arrayList).map(new C18531b(vVar, jVar, cVar, iVar)).map(new C18532c(vVar, jVar)).collect(C58370cn.f155946a));
    }
}
