package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.cast.framework.internal.C143440d;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.common.p4552o.p4566l.C60162c;
import com.google.common.p4552o.p4566l.C60189d;
import com.google.common.p4552o.p4566l.C60205e;
import com.google.common.p4552o.p4566l.C60206f;
import com.google.common.p4552o.p4566l.C60207g;
import com.google.common.p4552o.p4566l.C60208h;
import com.google.common.p4552o.p4566l.C60209i;
import com.google.common.p4552o.p4566l.C60210j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.math.BigInteger;
import java.util.Map;

/* renamed from: com.google.android.gms.cast.framework.a.a.g */
/* compiled from: PG */
public final class C143388g {

    /* renamed from: a */
    private static final C143566ae f388873a = new C143566ae("ApplicationAnalyticsUtils");

    /* renamed from: b */
    private static final String f388874b = "21.2.0-eap02";

    /* renamed from: c */
    private final String f388875c;

    /* renamed from: d */
    private final Map f388876d;

    /* renamed from: e */
    private final Map f388877e;

    public C143388g(Bundle bundle, String str) {
        this.f388875c = str;
        this.f388876d = C143440d.m232822a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f388877e = C143440d.m232822a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* renamed from: e */
    public static void m232661e(C60207g gVar, boolean z) {
        C60206f fVar = ((C60208h) gVar.instance).f162900i;
        if (fVar == null) {
            fVar = C60206f.f162878k;
        }
        C60205e eVar = (C60205e) C60206f.f162878k.createBuilder(fVar);
        eVar.copyOnWrite();
        C60206f fVar2 = (C60206f) eVar.instance;
        fVar2.f162880a |= 2;
        fVar2.f162882c = z;
        gVar.copyOnWrite();
        C60208h hVar = (C60208h) gVar.instance;
        C60206f fVar3 = (C60206f) eVar.build();
        fVar3.getClass();
        hVar.f162900i = fVar3;
        hVar.f162892a |= LinearLayoutManager.INVALID_OFFSET;
    }

    /* renamed from: a */
    public final C60207g mo118559a(C143387f fVar) {
        long j;
        C60207g gVar = (C60207g) C60208h.f162890l.createBuilder();
        long j2 = fVar.f388866e;
        gVar.copyOnWrite();
        C60208h hVar = (C60208h) gVar.instance;
        hVar.f162892a |= 2;
        hVar.f162894c = j2;
        int i = fVar.f388867f;
        fVar.f388867f = i + 1;
        gVar.copyOnWrite();
        C60208h hVar2 = (C60208h) gVar.instance;
        hVar2.f162892a |= 536870912;
        hVar2.f162899h = i;
        String str = fVar.f388865d;
        if (str != null) {
            gVar.copyOnWrite();
            C60208h hVar3 = (C60208h) gVar.instance;
            hVar3.f162892a |= C89885b.S3REQUEST_VALUE;
            hVar3.f162898g = str;
        }
        String str2 = fVar.f388870i;
        if (str2 != null) {
            gVar.copyOnWrite();
            C60208h hVar4 = (C60208h) gVar.instance;
            hVar4.f162892a |= 2048;
            hVar4.f162895d = str2;
        }
        C60162c cVar = (C60162c) C60189d.f162816d.createBuilder();
        String str3 = f388874b;
        cVar.copyOnWrite();
        C60189d dVar = (C60189d) cVar.instance;
        str3.getClass();
        dVar.f162818a |= 2;
        dVar.f162820c = str3;
        String str4 = this.f388875c;
        cVar.copyOnWrite();
        C60189d dVar2 = (C60189d) cVar.instance;
        str4.getClass();
        dVar2.f162818a |= 1;
        dVar2.f162819b = str4;
        C60189d dVar3 = (C60189d) cVar.build();
        gVar.copyOnWrite();
        C60208h hVar5 = (C60208h) gVar.instance;
        dVar3.getClass();
        C62971cq cqVar = hVar5.f162901j;
        if (!cqVar.mo58948c()) {
            hVar5.f162901j = C62942bv.mutableCopy(cqVar);
        }
        hVar5.f162901j.add(dVar3);
        C60205e eVar = (C60205e) C60206f.f162878k.createBuilder();
        if (fVar.f388864c != null) {
            C60209i iVar = (C60209i) C60210j.f162905c.createBuilder();
            String str5 = fVar.f388864c;
            iVar.copyOnWrite();
            C60210j jVar = (C60210j) iVar.instance;
            str5.getClass();
            jVar.f162907a |= 1;
            jVar.f162908b = str5;
            C60210j jVar2 = (C60210j) iVar.build();
            eVar.copyOnWrite();
            C60206f fVar2 = (C60206f) eVar.instance;
            jVar2.getClass();
            fVar2.f162881b = jVar2;
            fVar2.f162880a |= 1;
        }
        eVar.copyOnWrite();
        C60206f fVar3 = (C60206f) eVar.instance;
        fVar3.f162880a |= 2;
        fVar3.f162882c = false;
        String str6 = fVar.f388868g;
        if (str6 != null) {
            try {
                String replace = str6.replace("-", BuildConfig.FLAVOR);
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                f388873a.mo118890h(e, "receiverSessionId %s is not valid for hash", str6);
                j = 0;
            }
            eVar.copyOnWrite();
            C60206f fVar4 = (C60206f) eVar.instance;
            fVar4.f162880a |= 4;
            fVar4.f162883d = j;
        }
        int i2 = fVar.f388869h;
        eVar.copyOnWrite();
        C60206f fVar5 = (C60206f) eVar.instance;
        fVar5.f162880a |= 1024;
        fVar5.f162886g = i2;
        boolean z = fVar.f388871j;
        eVar.copyOnWrite();
        C60206f fVar6 = (C60206f) eVar.instance;
        fVar6.f162880a |= 2048;
        fVar6.f162887h = z;
        gVar.copyOnWrite();
        C60208h hVar6 = (C60208h) gVar.instance;
        C60206f fVar7 = (C60206f) eVar.build();
        fVar7.getClass();
        hVar6.f162900i = fVar7;
        hVar6.f162892a |= LinearLayoutManager.INVALID_OFFSET;
        return gVar;
    }

    /* renamed from: b */
    public final C60208h mo118560b(C143387f fVar) {
        return (C60208h) mo118559a(fVar).build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4552o.p4566l.C60208h mo118561c(com.google.android.gms.cast.framework.p10772a.p10773a.C143387f r5, int r6) {
        /*
            r4 = this;
            com.google.common.o.l.g r5 = r4.mo118559a(r5)
            com.google.protobuf.bv r0 = r5.instance
            com.google.common.o.l.h r0 = (com.google.common.p4552o.p4566l.C60208h) r0
            com.google.common.o.l.f r0 = r0.f162900i
            if (r0 != 0) goto L_0x000e
            com.google.common.o.l.f r0 = com.google.common.p4552o.p4566l.C60206f.f162878k
        L_0x000e:
            com.google.common.o.l.f r1 = com.google.common.p4552o.p4566l.C60206f.f162878k
            com.google.protobuf.bn r0 = r1.createBuilder(r0)
            com.google.common.o.l.e r0 = (com.google.common.p4552o.p4566l.C60205e) r0
            java.util.Map r1 = r4.f388877e
            if (r1 == 0) goto L_0x0035
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x0025
            goto L_0x0035
        L_0x0025:
            java.util.Map r1 = r4.f388877e
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.google.android.gms.common.internal.C143919bh.m233958a(r1)
            int r1 = r1.intValue()
            goto L_0x0037
        L_0x0035:
            int r1 = r6 + 10000
        L_0x0037:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.l.f r2 = (com.google.common.p4552o.p4566l.C60206f) r2
            int r3 = r2.f162880a
            r3 = r3 | 64
            r2.f162880a = r3
            r2.f162884e = r1
            java.util.Map r1 = r4.f388876d
            if (r1 == 0) goto L_0x0065
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            java.util.Map r6 = r4.f388876d
            java.lang.Object r6 = r6.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.google.android.gms.common.internal.C143919bh.m233958a(r6)
            int r6 = r6.intValue()
            goto L_0x0067
        L_0x0065:
            int r6 = r6 + 10000
        L_0x0067:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.l.f r1 = (com.google.common.p4552o.p4566l.C60206f) r1
            int r2 = r1.f162880a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.f162880a = r2
            r1.f162885f = r6
            com.google.protobuf.bv r6 = r0.build()
            com.google.common.o.l.f r6 = (com.google.common.p4552o.p4566l.C60206f) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.common.o.l.h r0 = (com.google.common.p4552o.p4566l.C60208h) r0
            r6.getClass()
            r0.f162900i = r6
            int r6 = r0.f162892a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r1
            r0.f162892a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.l.h r5 = (com.google.common.p4552o.p4566l.C60208h) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.p10772a.p10773a.C143388g.mo118561c(com.google.android.gms.cast.framework.a.a.f, int):com.google.common.o.l.h");
    }

    /* renamed from: d */
    public final C60208h mo118562d(C143387f fVar, int i) {
        C60207g a = mo118559a(fVar);
        C60206f fVar2 = ((C60208h) a.instance).f162900i;
        if (fVar2 == null) {
            fVar2 = C60206f.f162878k;
        }
        C60205e eVar = (C60205e) C60206f.f162878k.createBuilder(fVar2);
        eVar.copyOnWrite();
        C60206f fVar3 = (C60206f) eVar.instance;
        fVar3.f162880a |= 4096;
        fVar3.f162888i = i;
        C60206f fVar4 = (C60206f) eVar.build();
        a.copyOnWrite();
        C60208h hVar = (C60208h) a.instance;
        fVar4.getClass();
        hVar.f162900i = fVar4;
        hVar.f162892a |= LinearLayoutManager.INVALID_OFFSET;
        return (C60208h) a.build();
    }
}
