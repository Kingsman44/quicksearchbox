package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.ba */
/* compiled from: PG */
public final /* synthetic */ class C21818ba implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60199a;

    /* renamed from: b */
    public final /* synthetic */ Map f60200b;

    /* renamed from: c */
    public final /* synthetic */ C65855x f60201c;

    /* renamed from: d */
    public final /* synthetic */ Map f60202d;

    /* renamed from: e */
    public final /* synthetic */ Map f60203e;

    /* renamed from: f */
    public final /* synthetic */ boolean f60204f;

    public /* synthetic */ C21818ba(C21826bi biVar, Map map, C65855x xVar, Map map2, Map map3, boolean z) {
        this.f60199a = biVar;
        this.f60200b = map;
        this.f60201c = xVar;
        this.f60202d = map2;
        this.f60203e = map3;
        this.f60204f = z;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C21826bi biVar = this.f60199a;
        Map map = this.f60200b;
        C65855x xVar = this.f60201c;
        Map map2 = this.f60202d;
        Map map3 = this.f60203e;
        boolean z = this.f60204f;
        Map map4 = (Map) obj;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C65753ak akVar : map.keySet()) {
            C21859i iVar = (C21859i) biVar.f60228l.get(akVar);
            if (iVar != null) {
                C60870cx a = iVar.mo27164a(biVar.f60218b, xVar, C58485gu.m89842j((Collection) map.get(akVar)));
                if (GellerDatabase.f60556c.contains(akVar.name())) {
                    hashMap.put(akVar, a);
                } else {
                    arrayList.add(a);
                }
            }
        }
        C60870cx b = C60856cj.m92892a(hashMap.values()).mo57335b(C47810es.m84965e(new C21814ax(biVar, hashMap, map2, map4, map, map3)), biVar.f60224h);
        if (z) {
            return new C60817ay(C60856cj.m92894c(arrayList).mo57335b(C47810es.m84965e(new C21810at(b)), biVar.f60224h));
        }
        return new C60817ay(b);
    }
}
