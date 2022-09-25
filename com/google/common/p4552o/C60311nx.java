package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.nx */
/* compiled from: PG */
public final class C60311nx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60311nx f163196a;

    /* renamed from: e */
    private static volatile C63010eb f163197e;

    /* renamed from: b */
    private int f163198b;

    /* renamed from: c */
    private C60214n f163199c;

    /* renamed from: d */
    private byte f163200d = 2;

    static {
        C60311nx nxVar = new C60311nx();
        f163196a = nxVar;
        C62942bv.registerDefaultInstance(C60311nx.class, nxVar);
    }

    private C60311nx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163200d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163200d = b;
                return null;
            case 2:
                return newMessageInfo(f163196a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60311nx();
            case 4:
                return new C60310nw();
            case 5:
                return f163196a;
            case 6:
                C63010eb ebVar = f163197e;
                if (ebVar == null) {
                    synchronized (C60311nx.class) {
                        ebVar = f163197e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163196a);
                            f163197e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
