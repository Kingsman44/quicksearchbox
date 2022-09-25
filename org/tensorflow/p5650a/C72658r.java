package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.r */
/* compiled from: PG */
public final class C72658r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C72658r f193231a;

    /* renamed from: b */
    private static volatile C63010eb f193232b;

    static {
        C72658r rVar = new C72658r();
        f193231a = rVar;
        C62942bv.registerDefaultInstance(C72658r.class, rVar);
    }

    private C72658r() {
        emptyLongList();
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
                return newMessageInfo(f193231a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C72658r();
            case 4:
                return new C72657q();
            case 5:
                return f193231a;
            case 6:
                C63010eb ebVar = f193232b;
                if (ebVar == null) {
                    synchronized (C72658r.class) {
                        ebVar = f193232b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193231a);
                            f193232b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
