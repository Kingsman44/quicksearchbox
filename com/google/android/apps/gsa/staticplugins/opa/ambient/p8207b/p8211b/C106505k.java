package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.k */
/* compiled from: PG */
public final /* synthetic */ class C106505k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106511q f297025a;

    public /* synthetic */ C106505k(C106511q qVar) {
        this.f297025a = qVar;
    }

    public final Object apply(Object obj) {
        C106511q qVar = this.f297025a;
        C106596h hVar = (C106596h) obj;
        if ((hVar.f297206a & 16384) != 0) {
            C63042fg fgVar = hVar.f297217l;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (Instant.ofEpochMilli(C62953e.m95478c(fgVar)).isAfter(Instant.ofEpochMilli(qVar.f297042h.mo26870b()).minusSeconds(600))) {
                qVar.f297039e.mo95729c(hVar);
                return Optional.m71637of(qVar.f297039e.mo95727a());
            }
        }
        return Optional.empty();
    }
}
