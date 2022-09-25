package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.nb */
/* compiled from: PG */
public final class C53416nb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53416nb f140157a;

    /* renamed from: b */
    private static volatile C63010eb f140158b;

    static {
        C53416nb nbVar = new C53416nb();
        f140157a = nbVar;
        C62942bv.registerDefaultInstance(C53416nb.class, nbVar);
    }

    private C53416nb() {
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
                return newMessageInfo(f140157a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53416nb();
            case 4:
                return new C53415na();
            case 5:
                return f140157a;
            case 6:
                C63010eb ebVar = f140158b;
                if (ebVar == null) {
                    synchronized (C53416nb.class) {
                        ebVar = f140158b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140157a);
                            f140158b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
