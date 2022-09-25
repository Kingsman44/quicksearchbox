package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.an */
/* compiled from: PG */
public final class C62035an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62035an f167611a;

    /* renamed from: b */
    private static volatile C63010eb f167612b;

    static {
        C62035an anVar = new C62035an();
        f167611a = anVar;
        C62942bv.registerDefaultInstance(C62035an.class, anVar);
    }

    private C62035an() {
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
                return newMessageInfo(f167611a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62035an();
            case 4:
                return new C62034am();
            case 5:
                return f167611a;
            case 6:
                C63010eb ebVar = f167612b;
                if (ebVar == null) {
                    synchronized (C62035an.class) {
                        ebVar = f167612b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167611a);
                            f167612b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
