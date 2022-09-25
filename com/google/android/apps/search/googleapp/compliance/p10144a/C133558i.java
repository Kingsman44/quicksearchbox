package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.i */
/* compiled from: PG */
public final /* synthetic */ class C133558i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133567r f363882a;

    public /* synthetic */ C133558i(C133567r rVar) {
        this.f363882a = rVar;
    }

    public final Object apply(Object obj) {
        C133567r rVar = this.f363882a;
        C63042fg fgVar = ((C133546ao) obj).f363865e;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Boolean.valueOf(Duration.between(C62950b.m95474e(fgVar), rVar.f363907l.mo57444a()).compareTo(Duration.ofDays(1)) >= 0);
    }
}
