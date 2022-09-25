package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.l */
/* compiled from: PG */
public final class C62140l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62140l f167773a;

    /* renamed from: b */
    private static volatile C63010eb f167774b;

    static {
        C62140l lVar = new C62140l();
        f167773a = lVar;
        C62942bv.registerDefaultInstance(C62140l.class, lVar);
    }

    private C62140l() {
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
                return newMessageInfo(f167773a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62140l();
            case 4:
                return new C62139k();
            case 5:
                return f167773a;
            case 6:
                C63010eb ebVar = f167774b;
                if (ebVar == null) {
                    synchronized (C62140l.class) {
                        ebVar = f167774b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167773a);
                            f167774b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
