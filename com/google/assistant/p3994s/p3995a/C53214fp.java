package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fp */
/* compiled from: PG */
public final class C53214fp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53214fp f139477a;

    /* renamed from: b */
    private static volatile C63010eb f139478b;

    static {
        C53214fp fpVar = new C53214fp();
        f139477a = fpVar;
        C62942bv.registerDefaultInstance(C53214fp.class, fpVar);
    }

    private C53214fp() {
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
                return newMessageInfo(f139477a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53214fp();
            case 4:
                return new C53213fo();
            case 5:
                return f139477a;
            case 6:
                C63010eb ebVar = f139478b;
                if (ebVar == null) {
                    synchronized (C53214fp.class) {
                        ebVar = f139478b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139477a);
                            f139478b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
