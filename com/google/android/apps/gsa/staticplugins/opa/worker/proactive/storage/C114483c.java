package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.c */
/* compiled from: PG */
public final /* synthetic */ class C114483c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C114484d f317447a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f317448b;

    /* renamed from: c */
    public final /* synthetic */ long f317449c;

    /* renamed from: d */
    public final /* synthetic */ String f317450d;

    public /* synthetic */ C114483c(C114484d dVar, C60870cx cxVar, long j, String str) {
        this.f317447a = dVar;
        this.f317448b = cxVar;
        this.f317449c = j;
        this.f317450d = str;
    }

    public final Object call() {
        C114484d dVar = this.f317447a;
        C60870cx cxVar = this.f317448b;
        long j = this.f317449c;
        String str = this.f317450d;
        List list = (List) C60856cj.m92909r(cxVar);
        if (!list.isEmpty() && ((C114493m) list.get(0)).mo101340a() == j) {
            dVar.mo101349c(str);
            try {
                return C58833ax.m90834k((aas) C62942bv.parseFrom((C62942bv) aas.f134661u, ((C114493m) list.get(0)).mo101342c(), C62921ba.m95368a()));
            } catch (C62974ct unused) {
            }
        }
        return C58836b.f156633a;
    }
}
