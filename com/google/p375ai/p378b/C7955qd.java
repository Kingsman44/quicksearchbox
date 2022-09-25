package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.qd */
/* compiled from: PG */
public final class C7955qd extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C7955qd f27946e;

    /* renamed from: g */
    private static volatile C63010eb f27947g;

    /* renamed from: a */
    public int f27948a;

    /* renamed from: b */
    public int f27949b = 1;

    /* renamed from: c */
    public C63088z f27950c = C63088z.f170246b;

    /* renamed from: d */
    public C8174yg f27951d;

    /* renamed from: f */
    private byte f27952f = 2;

    static {
        C7955qd qdVar = new C7955qd();
        f27946e = qdVar;
        C62942bv.registerDefaultInstance(C7955qd.class, qdVar);
    }

    private C7955qd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27952f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27952f = b;
                return null;
            case 2:
                return newMessageInfo(f27946e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C7954qc.f27945a, C45240c.f118157a, "d"});
            case 3:
                return new C7955qd();
            case 4:
                return new C7953qb();
            case 5:
                return f27946e;
            case 6:
                C63010eb ebVar = f27947g;
                if (ebVar == null) {
                    synchronized (C7955qd.class) {
                        ebVar = f27947g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27946e);
                            f27947g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
