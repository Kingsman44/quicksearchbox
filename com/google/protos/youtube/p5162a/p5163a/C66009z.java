package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.z */
/* compiled from: PG */
public final class C66009z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66009z f179506a;

    /* renamed from: b */
    private static volatile C63010eb f179507b;

    static {
        C66009z zVar = new C66009z();
        f179506a = zVar;
        C62942bv.registerDefaultInstance(C66009z.class, zVar);
    }

    private C66009z() {
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
                return newMessageInfo(f179506a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66009z();
            case 4:
                return new C66008y();
            case 5:
                return f179506a;
            case 6:
                C63010eb ebVar = f179507b;
                if (ebVar == null) {
                    synchronized (C66009z.class) {
                        ebVar = f179507b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179506a);
                            f179507b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
