package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.kn */
/* compiled from: PG */
public final class C7803kn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7803kn f27280b;

    /* renamed from: d */
    private static volatile C63010eb f27281d;

    /* renamed from: a */
    public boolean f27282a = true;

    /* renamed from: c */
    private int f27283c;

    static {
        C7803kn knVar = new C7803kn();
        f27280b = knVar;
        C62942bv.registerDefaultInstance(C7803kn.class, knVar);
    }

    private C7803kn() {
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
                return newMessageInfo(f27280b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7803kn();
            case 4:
                return new C7802km();
            case 5:
                return f27280b;
            case 6:
                C63010eb ebVar = f27281d;
                if (ebVar == null) {
                    synchronized (C7803kn.class) {
                        ebVar = f27281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27280b);
                            f27281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
