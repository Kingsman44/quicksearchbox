package com.google.android.libraries.logging;

import android.util.Base64;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4575r.C60747d;
import com.google.protobuf.C62893aa;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62906an;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.logging.l */
/* compiled from: PG */
public final class C28294l {
    @Deprecated
    /* renamed from: a */
    public static C60214n m52911a(String str) {
        if (!str.startsWith("1")) {
            return (C60214n) C62942bv.parseFrom((C62942bv) C60214n.f162914g, Base64.decode(str.substring(1), 11));
        }
        throw new IOException(String.valueOf(str).concat(" ved cannot start with \"1\""));
    }

    @Deprecated
    /* renamed from: b */
    public static C60220t m52912b(String str) {
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        try {
            byte[] decode = Base64.decode(str, 11);
            int i = C62897ae.f169827g;
            C62897ae O = C62897ae.m95112O(decode, 0, decode.length);
            long i2 = ((((long) ((C62893aa) O).mo58674i()) & 4294967295L) * 1000000) + ((long) ((C62893aa) O).mo58675j());
            int j = ((C62893aa) O).mo58675j();
            int i3 = (j & 16777215) | ((((j >> 24) + 10) & PrivateKeyType.INVALID) << 24);
            int j2 = ((C62893aa) O).mo58675j();
            sVar.copyOnWrite();
            C60220t tVar = (C60220t) sVar.instance;
            tVar.f162933a |= 1;
            tVar.f162934b = i2;
            sVar.copyOnWrite();
            C60220t tVar2 = (C60220t) sVar.instance;
            tVar2.f162933a |= 2;
            tVar2.f162935c = i3;
            sVar.copyOnWrite();
            C60220t tVar3 = (C60220t) sVar.instance;
            tVar3.f162933a |= 4;
            tVar3.f162936d = j2;
            return (C60220t) sVar.build();
        } catch (IOException e) {
            throw new IOException("Bad encoded data inside an EI", e);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m52913c(C60214n nVar) {
        byte[] bArr = new byte[0];
        if ((nVar.f162916a & 2048) != 0) {
            C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
            C60218r rVar = nVar.f162921f;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            mVar.copyOnWrite();
            C60214n nVar2 = (C60214n) mVar.instance;
            rVar.getClass();
            nVar2.f162921f = rVar;
            nVar2.f162916a |= 2048;
            bArr = C60747d.m92721c(bArr, ((C60214n) mVar.build()).toByteArray());
        }
        if ((nVar.f162916a & 128) != 0) {
            C60213m mVar2 = (C60213m) C60214n.f162914g.createBuilder();
            int i = nVar.f162920e;
            mVar2.copyOnWrite();
            C60214n nVar3 = (C60214n) mVar2.instance;
            nVar3.f162916a |= 128;
            nVar3.f162920e = i;
            bArr = C60747d.m92721c(bArr, ((C60214n) mVar2.build()).toByteArray());
        }
        if ((nVar.f162916a & 8) != 0) {
            C60213m mVar3 = (C60213m) C60214n.f162914g.createBuilder();
            int i2 = nVar.f162918c;
            mVar3.copyOnWrite();
            C60214n nVar4 = (C60214n) mVar3.instance;
            nVar4.f162916a |= 8;
            nVar4.f162918c = i2;
            bArr = C60747d.m92721c(bArr, ((C60214n) mVar3.build()).toByteArray());
        }
        C60213m mVar4 = (C60213m) nVar.toBuilder();
        mVar4.copyOnWrite();
        C60214n nVar5 = (C60214n) mVar4.instance;
        nVar5.f162921f = null;
        nVar5.f162916a &= -2049;
        mVar4.copyOnWrite();
        C60214n nVar6 = (C60214n) mVar4.instance;
        nVar6.f162916a &= -129;
        nVar6.f162920e = 0;
        mVar4.copyOnWrite();
        C60214n nVar7 = (C60214n) mVar4.instance;
        nVar7.f162916a &= -9;
        nVar7.f162918c = 0;
        return ((nVar.f162916a & 4) == 0 ? "0" : "2").concat(String.valueOf(Base64.encodeToString(C60747d.m92721c(bArr, ((C60214n) mVar4.build()).toByteArray()), 11)));
    }

    @Deprecated
    /* renamed from: d */
    public static String m52914d(C60220t tVar) {
        try {
            long j = tVar.f162934b;
            int i = (int) (j % 1000000);
            int i2 = tVar.f162935c - 167772160;
            boolean z = C62906an.f169852e;
            byte[] bArr = new byte[(C62906an.m95314G(i) + 4 + C62906an.m95321N(i2) + C62906an.m95321N(tVar.f162936d))];
            C62906an Q = C62906an.m95324Q(bArr);
            Q.mo58767j((int) (j / 1000000));
            Q.mo58771n(i);
            Q.mo58780w(i2);
            Q.mo58780w(tVar.f162936d);
            return Base64.encodeToString(bArr, 11);
        } catch (IOException e) {
            throw new IllegalStateException("Could not encode EventIdMessage,", e);
        }
    }
}
