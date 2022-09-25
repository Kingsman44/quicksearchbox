package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.p */
/* compiled from: PG */
public final class C72656p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C72656p f193229a;

    /* renamed from: b */
    private static volatile C63010eb f193230b;

    static {
        C72656p pVar = new C72656p();
        f193229a = pVar;
        C62942bv.registerDefaultInstance(C72656p.class, pVar);
    }

    private C72656p() {
        emptyFloatList();
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
                return newMessageInfo(f193229a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C72656p();
            case 4:
                return new C72655o();
            case 5:
                return f193229a;
            case 6:
                C63010eb ebVar = f193230b;
                if (ebVar == null) {
                    synchronized (C72656p.class) {
                        ebVar = f193230b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193229a);
                            f193230b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
