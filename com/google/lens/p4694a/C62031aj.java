package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.aj */
/* compiled from: PG */
public final class C62031aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62031aj f167605a;

    /* renamed from: b */
    private static volatile C63010eb f167606b;

    static {
        C62031aj ajVar = new C62031aj();
        f167605a = ajVar;
        C62942bv.registerDefaultInstance(C62031aj.class, ajVar);
    }

    private C62031aj() {
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
                return newMessageInfo(f167605a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62031aj();
            case 4:
                return new C62030ai();
            case 5:
                return f167605a;
            case 6:
                C63010eb ebVar = f167606b;
                if (ebVar == null) {
                    synchronized (C62031aj.class) {
                        ebVar = f167606b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167605a);
                            f167606b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
