package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.android.apps.p489g.p490a.C9119d;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7744ii;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.C57526k;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.af */
/* compiled from: PG */
public final class C91955af {

    /* renamed from: a */
    public static final C60220t f256452a;

    static {
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        sVar.copyOnWrite();
        C60220t tVar = (C60220t) sVar.instance;
        tVar.f162933a |= 2;
        tVar.f162935c = 0;
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 4;
        tVar2.f162936d = 0;
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 1;
        tVar3.f162934b = 0;
        f256452a = (C60220t) sVar.build();
    }

    /* renamed from: a */
    public static C60220t m150904a(C7744ii iiVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C9119d.f31392d);
        iiVar.mo58887l(r0);
        if (!iiVar.f169962ag.mo58857o(r0.f169971d)) {
            return null;
        }
        C62940bt r02 = C62942bv.checkIsLite(C9119d.f31392d);
        iiVar.mo58887l(r02);
        Object l = iiVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C60220t tVar = ((C9119d) obj).f31395b;
        return tVar == null ? C60220t.f162931e : tVar;
    }

    /* renamed from: b */
    public static String m150905b(C57051b bVar, String str) {
        if (bVar == null) {
            return str.concat(": <none>");
        }
        return String.format(str.concat(": %s"), new Object[]{m150908e(bVar.toByteArray())});
    }

    /* renamed from: c */
    public static String m150906c(C7744ii iiVar) {
        C60220t a;
        if (iiVar == null || (a = m150904a(iiVar)) == null) {
            return "no session token";
        }
        return String.format("%x-%x-%x", new Object[]{Integer.valueOf(a.f162936d), Integer.valueOf(a.f162935c), Long.valueOf(a.f162934b)});
    }

    /* renamed from: d */
    public static String m150907d(C57526k kVar, String str) {
        if (kVar == null) {
            return str.concat(": <none>");
        }
        return String.format(str.concat(": %s"), new Object[]{m150908e(kVar.toByteArray())});
    }

    /* renamed from: e */
    private static String m150908e(byte[] bArr) {
        try {
            C59326i e = C59326i.f157519g.mo56825e();
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            return e.mo56837l(digest, digest.length);
        } catch (NoSuchAlgorithmException unused) {
            return "impossible";
        }
    }
}
