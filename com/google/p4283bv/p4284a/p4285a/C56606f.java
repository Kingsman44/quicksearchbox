package com.google.p4283bv.p4284a.p4285a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.a.a.f */
/* compiled from: PG */
public final class C56606f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56606f f151130a;

    /* renamed from: e */
    private static volatile C63010eb f151131e;

    /* renamed from: b */
    private int f151132b;

    /* renamed from: c */
    private C56604d f151133c;

    /* renamed from: d */
    private byte f151134d = 2;

    static {
        C56606f fVar = new C56606f();
        f151130a = fVar;
        C62942bv.registerDefaultInstance(C56606f.class, fVar);
    }

    private C56606f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151134d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151134d = b;
                return null;
            case 2:
                return newMessageInfo(f151130a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56606f();
            case 4:
                return new C56605e();
            case 5:
                return f151130a;
            case 6:
                C63010eb ebVar = f151131e;
                if (ebVar == null) {
                    synchronized (C56606f.class) {
                        ebVar = f151131e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151130a);
                            f151131e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
