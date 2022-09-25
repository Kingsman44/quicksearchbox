package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bs */
/* compiled from: PG */
public final /* synthetic */ class C103946bs implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103948bu f289296a;

    /* renamed from: b */
    public final /* synthetic */ long f289297b;

    public /* synthetic */ C103946bs(C103948bu buVar, long j) {
        this.f289296a = buVar;
        this.f289297b = j;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103948bu buVar = this.f289296a;
        long j = this.f289297b;
        C89062r rVar = (C89062r) obj;
        if (!rVar.mo83040a()) {
            return C103947bt.INELIGIBLE_NO_NETWORK;
        }
        if (!rVar.f241371c) {
            return C103947bt.ELIGIBLE;
        }
        if (rVar.f241372d || buVar.f289305a.mo27385k()) {
            return C103947bt.INELIGIBLE_OTHER_NETWORK;
        }
        int a = (int) buVar.f289306b.mo79743a(C90126fx.f251520kP);
        if (a == -1 || (j > 0 && j <= ((long) a))) {
            return C103947bt.ELIGIBLE;
        }
        return C103947bt.INELIGIBLE_METERED_DATA_LIMIT;
    }
}
