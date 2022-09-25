package com.google.fcp.client.http;

import com.google.android.libraries.micore.learning.training.nflrunner.C29755m;
import com.google.fcp.client.C61090c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.fcp.client.http.b */
/* compiled from: PG */
public final /* synthetic */ class C61093b implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ C61095d f165389a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f165390b;

    public /* synthetic */ C61093b(C61095d dVar, byte[] bArr) {
        this.f165389a = dVar;
        this.f165390b = bArr;
    }

    public final Object call() {
        C61095d dVar = this.f165389a;
        byte[] bArr = this.f165390b;
        try {
            C61109r rVar = (C61109r) C62942bv.parseFrom((C62942bv) C61109r.f165422e, bArr, C62921ba.f169869a);
            C29755m mVar = dVar.f165391a.f80591a;
            return new C61104m(rVar, mVar.f80607j, mVar.f80610m, mVar.f80611n, mVar.f80612o.mo34912b(), mVar.f80612o.mo34913c(), mVar.f80612o.mo34914d(), mVar.f80612o.mo34915e(), mVar.f80612o.mo34917f(), mVar.f80612o.mo34918g(), mVar.f80612o.mo34921i(), mVar.f80612o.mo34919h(), mVar.f80612o.mo34911a());
        } catch (C62974ct e) {
            throw new C61094c("invalid JniHttpRequest", e);
        }
    }
}
