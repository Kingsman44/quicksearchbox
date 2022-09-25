package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cz */
/* compiled from: PG */
public final class C62101cz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62101cz f167715a;

    /* renamed from: b */
    private static volatile C63010eb f167716b;

    static {
        C62101cz czVar = new C62101cz();
        f167715a = czVar;
        C62942bv.registerDefaultInstance(C62101cz.class, czVar);
    }

    private C62101cz() {
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
                return newMessageInfo(f167715a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62101cz();
            case 4:
                return new C62100cy();
            case 5:
                return f167715a;
            case 6:
                C63010eb ebVar = f167716b;
                if (ebVar == null) {
                    synchronized (C62101cz.class) {
                        ebVar = f167716b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167715a);
                            f167716b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
