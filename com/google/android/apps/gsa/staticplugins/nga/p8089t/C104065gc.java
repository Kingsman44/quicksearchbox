package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122194o;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122195p;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122196q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17157t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gc */
/* compiled from: PG */
public final /* synthetic */ class C104065gc implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104066gd f289542a;

    public /* synthetic */ C104065gc(C104066gd gdVar) {
        this.f289542a = gdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58528ij ijVar = (C58528ij) obj;
        C122191l lVar = this.f289542a.f289544b;
        C122195p pVar = (C122195p) C122196q.f338897b.createBuilder();
        pVar.copyOnWrite();
        C122196q qVar = (C122196q) pVar.instance;
        C62971cq cqVar = qVar.f338899a;
        if (!cqVar.mo58948c()) {
            qVar.f338899a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) qVar.f338899a);
        return C17157t.m34305a(C70876o.m103760a(lVar.f189039a.mo39510a(C122194o.m201737e(), lVar.f189040b), (C122196q) pVar.build()));
    }
}
