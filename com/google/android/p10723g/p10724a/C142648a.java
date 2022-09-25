package com.google.android.p10723g.p10724a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C142648a implements C143712ae {
    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        Status status = (Status) adVar;
        if (!status.mo119097c()) {
            new ExecutionException(String.format("%s: %d", new Object[]{status.f389622h, Integer.valueOf(status.f389621g)}), (Throwable) null);
        }
    }
}
