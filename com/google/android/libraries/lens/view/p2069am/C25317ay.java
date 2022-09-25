package com.google.android.libraries.lens.view.p2069am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.ay */
/* compiled from: PG */
public final class C25317ay extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C25317ay f68879e;

    /* renamed from: f */
    private static volatile C63010eb f68880f;

    /* renamed from: a */
    public C25314av f68881a;

    /* renamed from: b */
    public C25314av f68882b;

    /* renamed from: c */
    public float f68883c;

    /* renamed from: d */
    public float f68884d;

    static {
        C25317ay ayVar = new C25317ay();
        f68879e = ayVar;
        C62942bv.registerDefaultInstance(C25317ay.class, ayVar);
    }

    private C25317ay() {
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
                return newMessageInfo(f68879e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0001\u0004\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C25317ay();
            case 4:
                return new C25316ax();
            case 5:
                return f68879e;
            case 6:
                C63010eb ebVar = f68880f;
                if (ebVar == null) {
                    synchronized (C25317ay.class) {
                        ebVar = f68880f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68879e);
                            f68880f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
