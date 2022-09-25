package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bc */
/* compiled from: PG */
public final /* synthetic */ class C106031bc implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C106031bc f296039a = new C106031bc();

    private /* synthetic */ C106031bc() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C65753ak akVar = C106035bg.f296043a;
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (((C65753ak) entry.getKey()).equals(C106035bg.f296043a)) {
                if (((C21850cf) entry.getValue()).mo27152b().isEmpty()) {
                    return C60866ct.f164955a;
                }
                return C60856cj.m92899h(new IllegalStateException((String) Collection.EL.stream(((C21850cf) entry.getValue()).mo27152b()).map(C106033be.f296041a).collect(Collectors.joining("\n"))));
            }
        }
        return C60856cj.m92899h(new IllegalStateException("Did not find the CORPUS AOG_APP_USER_CONTEXT in synced results."));
    }
}
