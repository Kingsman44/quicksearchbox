package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.acp */
/* compiled from: PG */
public final class acp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final acp f158315e;

    /* renamed from: f */
    private static volatile C63010eb f158316f;

    /* renamed from: a */
    public int f158317a;

    /* renamed from: b */
    public int f158318b;

    /* renamed from: c */
    public int f158319c;

    /* renamed from: d */
    public int f158320d;

    static {
        acp acp = new acp();
        f158315e = acp;
        C62942bv.registerDefaultInstance(acp.class, acp);
    }

    private acp() {
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
                return newMessageInfo(f158315e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", aco.f158314a, C45240c.f118157a, acn.f158313a, "d", acm.f158312a});
            case 3:
                return new acp();
            case 4:
                return new acl();
            case 5:
                return f158315e;
            case 6:
                C63010eb ebVar = f158316f;
                if (ebVar == null) {
                    synchronized (acp.class) {
                        ebVar = f158316f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158315e);
                            f158316f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
