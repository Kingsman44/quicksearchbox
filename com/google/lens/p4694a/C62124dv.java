package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dv */
/* compiled from: PG */
public final class C62124dv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62124dv f167752a;

    /* renamed from: b */
    private static volatile C63010eb f167753b;

    static {
        C62124dv dvVar = new C62124dv();
        f167752a = dvVar;
        C62942bv.registerDefaultInstance(C62124dv.class, dvVar);
    }

    private C62124dv() {
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
                return newMessageInfo(f167752a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62124dv();
            case 4:
                return new C62123du();
            case 5:
                return f167752a;
            case 6:
                C63010eb ebVar = f167753b;
                if (ebVar == null) {
                    synchronized (C62124dv.class) {
                        ebVar = f167753b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167752a);
                            f167753b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
