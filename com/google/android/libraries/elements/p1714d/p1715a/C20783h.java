package com.google.android.libraries.elements.p1714d.p1715a;

import com.google.android.libraries.elements.interfaces.C21231aa;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.elements.C66176cu;
import com.google.protos.youtube.elements.C66260r;
import com.youtube.android.libraries.elements.StatusOr;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.a.h */
/* compiled from: PG */
public final class C20783h extends FetcherFactory {

    /* renamed from: a */
    final /* synthetic */ C62917ay f58135a;

    /* renamed from: b */
    final /* synthetic */ C21231aa f58136b;

    /* renamed from: c */
    final /* synthetic */ C20784i f58137c;

    public C20783h(C20784i iVar, C62917ay ayVar, C21231aa aaVar) {
        this.f58137c = iVar;
        this.f58135a = ayVar;
        this.f58136b = aaVar;
    }

    public final StatusOr create(int i, byte[] bArr) {
        try {
            C66176cu cuVar = (C66176cu) C62942bv.parseFrom((C62942bv) C66176cu.f179951a, bArr, C62921ba.m95368a());
            C62940bt r5 = C62942bv.checkIsLite(this.f58135a);
            cuVar.mo58887l(r5);
            Object l = cuVar.f169962ag.mo58854l(r5.f169971d);
            if (l == null) {
                Object obj = r5.f169969b;
            } else {
                r5.mo58889c(l);
            }
            return StatusOr.fromValue(this.f58136b.mo26705b());
        } catch (C62974ct e) {
            this.f58137c.f58138a.mo25782a(C66260r.LOG_TYPE_CONFIGURATION_ERROR, "Error parsing Fetcher configuration", C21319z.f59680u, e);
            return StatusOr.fromStatus(Status.m102100d(e));
        }
    }
}
