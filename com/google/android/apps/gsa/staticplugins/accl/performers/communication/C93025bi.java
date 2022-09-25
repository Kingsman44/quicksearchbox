package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60866ct;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.bi */
/* compiled from: PG */
public final /* synthetic */ class C93025bi implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93029bm f259486a;

    public /* synthetic */ C93025bi(C93029bm bmVar) {
        this.f259486a = bmVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93029bm bmVar = this.f259486a;
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (((C65753ak) entry.getKey()).equals(C65753ak.ASSISTANT_EPHEMERAL_AUDIO)) {
                if (((C21850cf) entry.getValue()).mo27152b().isEmpty()) {
                    return C60866ct.f164955a;
                }
                bmVar.f259494d.set(true);
                Collection.EL.stream(((C21850cf) entry.getValue()).mo27152b()).map(C93024bh.f259485a).collect(Collectors.joining("\n"));
                return C60866ct.f164955a;
            }
        }
        bmVar.f259494d.set(true);
        return C60866ct.f164955a;
    }
}
