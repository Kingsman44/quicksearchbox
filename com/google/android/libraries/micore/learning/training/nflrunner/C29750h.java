package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.nativeshared.C29730b;
import com.google.android.libraries.micore.learning.training.nativeshared.C29734f;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.fcp.client.C61090c;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.h */
/* compiled from: PG */
public final /* synthetic */ class C29750h implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ C29755m f80592a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f80593b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f80594c;

    public /* synthetic */ C29750h(C29755m mVar, byte[] bArr, byte[] bArr2) {
        this.f80592a = mVar;
        this.f80593b = bArr;
        this.f80594c = bArr2;
    }

    public final Object call() {
        StatusOr statusOr;
        C29755m mVar = this.f80592a;
        byte[] bArr = this.f80593b;
        byte[] bArr2 = this.f80594c;
        synchronized (mVar.f80613p) {
            C29734f fVar = mVar.f80606i;
            C59628h hVar = mVar.f80615r;
            statusOr = (StatusOr) fVar.f80506d.mo57645a(new C29730b(fVar, bArr, bArr2, mVar.f80609l, mVar.f80614q, hVar));
        }
        return statusOr;
    }
}
