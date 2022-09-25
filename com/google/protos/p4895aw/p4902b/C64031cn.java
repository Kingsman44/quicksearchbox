package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.cn */
/* compiled from: PG */
public final class C64031cn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64031cn f173137d;

    /* renamed from: e */
    private static volatile C63010eb f173138e;

    /* renamed from: a */
    public int f173139a;

    /* renamed from: b */
    public C63088z f173140b = C63088z.f170246b;

    /* renamed from: c */
    public int f173141c;

    static {
        C64031cn cnVar = new C64031cn();
        f173137d = cnVar;
        C62942bv.registerDefaultInstance(C64031cn.class, cnVar);
    }

    private C64031cn() {
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
                return newMessageInfo(f173137d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C64030cm.f173136a});
            case 3:
                return new C64031cn();
            case 4:
                return new C64029cl();
            case 5:
                return f173137d;
            case 6:
                C63010eb ebVar = f173138e;
                if (ebVar == null) {
                    synchronized (C64031cn.class) {
                        ebVar = f173138e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173137d);
                            f173138e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
