package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.h */
/* compiled from: PG */
public final class C72648h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C72648h f193219a;

    /* renamed from: b */
    private static volatile C63010eb f193220b;

    static {
        C72648h hVar = new C72648h();
        f193219a = hVar;
        C62942bv.registerDefaultInstance(C72648h.class, hVar);
    }

    private C72648h() {
        emptyProtobufList();
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
                return newMessageInfo(f193219a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C72648h();
            case 4:
                return new C72647g();
            case 5:
                return f193219a;
            case 6:
                C63010eb ebVar = f193220b;
                if (ebVar == null) {
                    synchronized (C72648h.class) {
                        ebVar = f193220b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193219a);
                            f193220b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
