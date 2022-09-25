package com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c;

import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.gmscompliance.p10800a.C144262b;
import com.google.android.gms.gmscompliance.p10800a.C144265e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4017at.p4046e.p4047a.p4048a.C53922c;
import com.google.p4017at.p4046e.p4047a.p4048a.C53923d;
import com.google.p4017at.p4046e.p4047a.p4048a.C53925f;
import com.google.p4017at.p4046e.p4047a.p4048a.C53928i;
import com.google.p4017at.p4046e.p4047a.p4048a.C53929j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.gmscompliance.a.a.c.a */
/* compiled from: PG */
public final class C144239a {

    /* renamed from: a */
    private static final long f390685a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public static C144265e m234482a(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return new C144262b(2);
        }
        C58833ax b = m234483b((C53929j) axVar.mo56107c());
        if (!b.mo56113h()) {
            return new C144262b(2);
        }
        C53925f fVar = C53925f.UNKNOWN;
        C53925f a = C53925f.m87061a(((C53928i) b.mo56107c()).f141504c);
        if (a == null) {
            a = C53925f.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? new C144262b(3) : new C144262b(4);
        }
        return new C144262b(1);
    }

    /* renamed from: b */
    public static C58833ax m234483b(C53929j jVar) {
        if ((jVar.f141512a & 1) != 0) {
            try {
                return C58833ax.m90834k((C53928i) C62942bv.parseFrom((C62942bv) C53928i.f141500i, jVar.f141513b, C62921ba.m95368a()));
            } catch (C62974ct unused) {
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static C58833ax m234484c(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        byte[] bArr = gmsDeviceComplianceResponse.f390659f;
        if (bArr != null) {
            try {
                return C58833ax.m90834k((C53929j) C62942bv.parseFrom((C62942bv) C53929j.f141510c, bArr, C62921ba.m95368a()));
            } catch (C62974ct unused) {
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public static C53929j m234485d(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        C53925f fVar;
        C63042fg i = C62953e.m95484i(System.currentTimeMillis() + f390685a);
        if (gmsDeviceComplianceResponse.f390655b) {
            fVar = C53925f.DO_NOT_ENFORCE;
        } else {
            fVar = C53925f.ENFORCE;
        }
        C53922c cVar = (C53922c) C53929j.f141510c.createBuilder();
        C53923d dVar = (C53923d) C53928i.f141500i.createBuilder();
        dVar.copyOnWrite();
        C53928i iVar = (C53928i) dVar.instance;
        iVar.f141504c = fVar.f141497d;
        iVar.f141502a |= 2;
        dVar.copyOnWrite();
        C53928i iVar2 = (C53928i) dVar.instance;
        i.getClass();
        iVar2.f141506e = i;
        iVar2.f141502a |= 8;
        C63088z byteString = ((C53928i) dVar.build()).toByteString();
        cVar.copyOnWrite();
        C53929j jVar = (C53929j) cVar.instance;
        byteString.getClass();
        jVar.f141512a |= 1;
        jVar.f141513b = byteString;
        return (C53929j) cVar.build();
    }
}
