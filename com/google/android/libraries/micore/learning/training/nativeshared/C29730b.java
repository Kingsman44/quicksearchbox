package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.base.C29718j;
import com.google.android.libraries.micore.learning.training.C29725a;
import com.google.android.libraries.micore.learning.training.C29726b;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.fcp.client.C61090c;
import com.google.p3728as.p3729a.p3730a.C48025e;
import com.google.p3728as.p3729a.p3730a.C48026f;
import com.google.p3728as.p3729a.p3730a.C48029i;
import com.google.p3728as.p3729a.p3730a.C48030j;
import com.google.p4017at.p4044d.p4045a.C53919b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.b */
/* compiled from: PG */
public final /* synthetic */ class C29730b implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ C29734f f80491a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f80492b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f80493c;

    /* renamed from: d */
    public final /* synthetic */ long f80494d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f80495e;

    /* renamed from: f */
    public final /* synthetic */ C59628h f80496f;

    public /* synthetic */ C29730b(C29734f fVar, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, C59628h hVar) {
        this.f80491a = fVar;
        this.f80492b = bArr;
        this.f80493c = bArr2;
        this.f80494d = j;
        this.f80495e = bArr3;
        this.f80496f = hVar;
    }

    public final Object call() {
        C29734f fVar = this.f80491a;
        byte[] bArr = this.f80492b;
        byte[] bArr2 = this.f80493c;
        long j = this.f80494d;
        byte[] bArr3 = this.f80495e;
        C59628h hVar = this.f80496f;
        try {
            C53919b bVar = (C53919b) C62942bv.parseFrom((C62942bv) C53919b.f141476d, bArr, C62921ba.m95368a());
            C48030j jVar = (C48030j) C62942bv.parseFrom((C62942bv) C48030j.f124314b, bArr2, C62921ba.m95368a());
            C48026f fVar2 = jVar.f124316a;
            if (fVar2 == null) {
                fVar2 = C48026f.f124306c;
            }
            C48025e eVar = (C48025e) fVar2.toBuilder();
            eVar.copyOnWrite();
            ((C48026f) eVar.instance).f124308a = j;
            if (fVar.f80507e) {
                C63088z A = C63088z.m96139A(bArr3);
                eVar.copyOnWrite();
                ((C48026f) eVar.instance).f124309b = A;
            }
            C48029i iVar = (C48029i) jVar.toBuilder();
            C48026f fVar3 = (C48026f) eVar.build();
            iVar.copyOnWrite();
            fVar3.getClass();
            ((C48030j) iVar.instance).f124316a = fVar3;
            try {
                C29725a a = fVar.f80503a.mo34875a(bVar, (C48030j) iVar.build(), hVar);
                synchronized (fVar.f80504b) {
                    fVar.f80505c.add(a);
                }
                return new StatusOr(new C29733e(fVar, a), (C29718j) null);
            } catch (C29726b e) {
                return new StatusOr((Object) null, new C29718j(3, e.getMessage()));
            }
        } catch (C62974ct e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
