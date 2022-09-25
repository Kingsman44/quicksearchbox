package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.C143825n;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.wearable.internal.cx */
/* compiled from: PG */
final class C146493cx extends C146489ct {

    /* renamed from: a */
    private final List f395678a;

    public C146493cx(C143825n nVar, List list) {
        super(nVar);
        this.f395678a = list;
    }

    /* renamed from: e */
    public final void mo123182e(PutDataResponse putDataResponse) {
        mo123287H(new C146418ac(C146483cn.m238468a(putDataResponse.f395624a), putDataResponse.f395625b));
        if (putDataResponse.f395624a != 0) {
            for (FutureTask cancel : this.f395678a) {
                cancel.cancel(true);
            }
        }
    }
}
