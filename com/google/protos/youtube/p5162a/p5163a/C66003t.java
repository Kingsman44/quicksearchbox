package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.t */
/* compiled from: PG */
public final class C66003t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66003t f179498a;

    /* renamed from: b */
    private static volatile C63010eb f179499b;

    static {
        C66003t tVar = new C66003t();
        f179498a = tVar;
        C62942bv.registerDefaultInstance(C66003t.class, tVar);
    }

    private C66003t() {
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
                return newMessageInfo(f179498a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66003t();
            case 4:
                return new C66002s();
            case 5:
                return f179498a;
            case 6:
                C63010eb ebVar = f179499b;
                if (ebVar == null) {
                    synchronized (C66003t.class) {
                        ebVar = f179499b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179498a);
                            f179499b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
