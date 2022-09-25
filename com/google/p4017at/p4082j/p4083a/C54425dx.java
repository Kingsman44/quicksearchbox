package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dx */
/* compiled from: PG */
public final class C54425dx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54425dx f142930d;

    /* renamed from: e */
    private static volatile C63010eb f142931e;

    /* renamed from: a */
    public C62971cq f142932a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public int f142933b;

    /* renamed from: c */
    public boolean f142934c;

    static {
        C54425dx dxVar = new C54425dx();
        f142930d = dxVar;
        C62942bv.registerDefaultInstance(C54425dx.class, dxVar);
    }

    private C54425dx() {
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
                return newMessageInfo(f142930d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ț\u0002\f\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54425dx();
            case 4:
                return new C54424dw();
            case 5:
                return f142930d;
            case 6:
                C63010eb ebVar = f142931e;
                if (ebVar == null) {
                    synchronized (C54425dx.class) {
                        ebVar = f142931e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142930d);
                            f142931e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
