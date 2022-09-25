package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.iu */
/* compiled from: PG */
public final class C65295iu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65295iu f176616a;

    /* renamed from: b */
    private static volatile C63010eb f176617b;

    static {
        C65295iu iuVar = new C65295iu();
        f176616a = iuVar;
        C62942bv.registerDefaultInstance(C65295iu.class, iuVar);
    }

    private C65295iu() {
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
                return newMessageInfo(f176616a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65295iu();
            case 4:
                return new C65294it();
            case 5:
                return f176616a;
            case 6:
                C63010eb ebVar = f176617b;
                if (ebVar == null) {
                    synchronized (C65295iu.class) {
                        ebVar = f176617b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176616a);
                            f176617b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
