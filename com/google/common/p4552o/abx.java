package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.abx */
/* compiled from: PG */
public final class abx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final abx f158238d;

    /* renamed from: e */
    private static volatile C63010eb f158239e;

    /* renamed from: a */
    public int f158240a;

    /* renamed from: b */
    public int f158241b;

    /* renamed from: c */
    public C62971cq f158242c = C62942bv.emptyProtobufList();

    static {
        abx abx = new abx();
        f158238d = abx;
        C62942bv.registerDefaultInstance(abx.class, abx);
    }

    private abx() {
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
                return newMessageInfo(f158238d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"a", "b", abw.f158237a, C45240c.f118157a});
            case 3:
                return new abx();
            case 4:
                return new abv();
            case 5:
                return f158238d;
            case 6:
                C63010eb ebVar = f158239e;
                if (ebVar == null) {
                    synchronized (abx.class) {
                        ebVar = f158239e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158238d);
                            f158239e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
