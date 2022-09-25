package com.google.android.apps.gsa.staticplugins.nga.p8051e;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.e.c */
/* compiled from: PG */
public final /* synthetic */ class C103024c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103028g f287617a;

    /* renamed from: b */
    public final /* synthetic */ String f287618b;

    public /* synthetic */ C103024c(C103028g gVar, String str) {
        this.f287617a = gVar;
        this.f287618b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103028g gVar = this.f287617a;
        String str = this.f287618b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return gVar.f287625a.mo28209i(gVar.f287627c.mo27501m(str, 443, (C70334de) null, (String) axVar.mo56107c(), 73), "[NGA] DeeplinkGrpcHelper.getManagedChannel.optionalManagedChannel", C103022a.f287615a);
    }
}
