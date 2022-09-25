package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.x */
/* compiled from: PG */
public final class C63640x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63640x f172108b;

    /* renamed from: d */
    private static volatile C63010eb f172109d;

    /* renamed from: a */
    public C62971cq f172110a = emptyProtobufList();

    /* renamed from: c */
    private byte f172111c = 2;

    static {
        C63640x xVar = new C63640x();
        f172108b = xVar;
        C62942bv.registerDefaultInstance(C63640x.class, xVar);
    }

    private C63640x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172111c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172111c = b;
                return null;
            case 2:
                return newMessageInfo(f172108b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63634r.class});
            case 3:
                return new C63640x();
            case 4:
                return new C63639w();
            case 5:
                return f172108b;
            case 6:
                C63010eb ebVar = f172109d;
                if (ebVar == null) {
                    synchronized (C63640x.class) {
                        ebVar = f172109d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172108b);
                            f172109d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
