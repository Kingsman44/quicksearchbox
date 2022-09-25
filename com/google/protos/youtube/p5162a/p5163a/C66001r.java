package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.r */
/* compiled from: PG */
public final class C66001r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66001r f179496a;

    /* renamed from: b */
    private static volatile C63010eb f179497b;

    static {
        C66001r rVar = new C66001r();
        f179496a = rVar;
        C62942bv.registerDefaultInstance(C66001r.class, rVar);
    }

    private C66001r() {
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
                return newMessageInfo(f179496a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66001r();
            case 4:
                return new C66000q();
            case 5:
                return f179496a;
            case 6:
                C63010eb ebVar = f179497b;
                if (ebVar == null) {
                    synchronized (C66001r.class) {
                        ebVar = f179497b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179496a);
                            f179497b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
