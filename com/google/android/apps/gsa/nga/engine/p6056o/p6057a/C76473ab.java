package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C76473ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76490as f211646a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211647b;

    public /* synthetic */ C76473ab(C76490as asVar, C74965n nVar) {
        this.f211646a = asVar;
        this.f211647b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76490as asVar = this.f211646a;
        C74965n nVar = this.f211647b;
        RuntimeException runtimeException = (RuntimeException) obj;
        if (!(runtimeException instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) asVar.f211679a.mo56225c()).mo56382g(runtimeException)).mo56372aa(3581)).mo56386p("[NGA] Fulfillment failed with unchecked exception");
            asVar.f211682d.mo75545c(C82887ec.EXCEPTION, C79878z.m128026a(runtimeException), nVar.mo71336k());
        }
        return C80401n.f220656k;
    }
}
