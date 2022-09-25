package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63884p;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C136911m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137009dj f372622a;

    /* renamed from: b */
    public final /* synthetic */ C63884p f372623b;

    public /* synthetic */ C136911m(C137009dj djVar, C63884p pVar) {
        this.f372622a = djVar;
        this.f372623b = pVar;
    }

    public final Object apply(Object obj) {
        C137009dj djVar = this.f372622a;
        C63884p pVar = this.f372623b;
        C63042fg fgVar = (C63042fg) obj;
        C63042fg fgVar2 = djVar.f372883c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        Instant e = C62950b.m95474e(fgVar2);
        Instant e2 = C62950b.m95474e(fgVar);
        C62910ar arVar = pVar.f172739b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        return Boolean.valueOf(e.isAfter(e2.plus(C62950b.m95473d(arVar))));
    }
}
