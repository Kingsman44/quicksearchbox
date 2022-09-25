package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28724bb;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.mdi.download.h.x */
/* compiled from: PG */
public final class C29627x implements C29495ae {

    /* renamed from: a */
    public static final BiFunction f80228a = C29618o.f80217a;

    /* renamed from: b */
    public static final BiFunction f80229b = C29619p.f80218a;

    /* renamed from: c */
    public final BiFunction f80230c;

    /* renamed from: d */
    private final C58881cr f80231d;

    /* renamed from: e */
    private final Executor f80232e;

    public C29627x(C29626w wVar) {
        this.f80231d = wVar.f80225a;
        this.f80230c = wVar.f80226b;
        this.f80232e = wVar.f80227c;
    }

    /* renamed from: b */
    public static C29626w m54588b() {
        return new C29626w();
    }

    /* renamed from: a */
    public final C60870cx mo19281a(C28728bf bfVar) {
        C28708an anVar;
        ArrayList arrayList = new ArrayList();
        for (List<C28725bc> it : ((Map) Collection.EL.stream(bfVar.f78046b).collect(Collectors.groupingBy(C29620q.f80219a, C29621r.f80220a, Collectors.mapping(C29622s.f80221a, Collectors.toCollection(C29623t.f80222a))))).values()) {
            HashMap hashMap = new HashMap();
            for (C28725bc bcVar : it) {
                C28724bb bbVar = bcVar.f78037b;
                if (bbVar == null) {
                    bbVar = C28724bb.f78028e;
                }
                for (String str : bbVar.f78031b) {
                    C28708an anVar2 = bcVar.f78038c;
                    if (anVar2 == null) {
                        anVar2 = C28708an.f77994l;
                    }
                    if (anVar2.f78006k.contains(str)) {
                        anVar = bcVar.f78038c;
                        if (anVar == null) {
                            anVar = C28708an.f77994l;
                        }
                    } else {
                        C28708an anVar3 = bcVar.f78038c;
                        if (anVar3 == null) {
                            anVar3 = C28708an.f77994l;
                        }
                        C28707am amVar = (C28707am) anVar3.toBuilder();
                        amVar.copyOnWrite();
                        C28708an anVar4 = (C28708an) amVar.instance;
                        str.getClass();
                        C62971cq cqVar = anVar4.f78006k;
                        if (!cqVar.mo58948c()) {
                            anVar4.f78006k = C62942bv.mutableCopy(cqVar);
                        }
                        anVar4.f78006k.add(str);
                        anVar = (C28708an) amVar.build();
                    }
                    hashMap.put(Locale.forLanguageTag(str), anVar);
                }
            }
            C29617n nVar = new C29617n(this, hashMap);
            arrayList.add(C60922j.m93044g((C60870cx) this.f80231d.mo6453a(), C47810es.m84963c(nVar), this.f80232e));
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        C29624u uVar = C29624u.f80223a;
        return C60922j.m93044g(o, C47810es.m84963c(uVar), this.f80232e);
    }
}
