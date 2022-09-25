package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahc */
/* compiled from: PG */
public final class ahc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final ahc f158686f;

    /* renamed from: g */
    private static volatile C63010eb f158687g;

    /* renamed from: a */
    public int f158688a;

    /* renamed from: b */
    public int f158689b;

    /* renamed from: c */
    public int f158690c;

    /* renamed from: d */
    public long f158691d;

    /* renamed from: e */
    public long f158692e;

    static {
        ahc ahc = new ahc();
        f158686f = ahc;
        C62942bv.registerDefaultInstance(ahc.class, ahc);
    }

    private ahc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f158686f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new ahc();
            case 4:
                return new ahb();
            case 5:
                return f158686f;
            case 6:
                C63010eb ebVar = f158687g;
                if (ebVar == null) {
                    synchronized (ahc.class) {
                        ebVar = f158687g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158686f);
                            f158687g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
