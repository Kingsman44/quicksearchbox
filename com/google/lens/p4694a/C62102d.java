package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.d */
/* compiled from: PG */
public final class C62102d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62102d f167717a;

    /* renamed from: b */
    private static volatile C63010eb f167718b;

    static {
        C62102d dVar = new C62102d();
        f167717a = dVar;
        C62942bv.registerDefaultInstance(C62102d.class, dVar);
    }

    private C62102d() {
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
                return newMessageInfo(f167717a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62102d();
            case 4:
                return new C62075c();
            case 5:
                return f167717a;
            case 6:
                C63010eb ebVar = f167718b;
                if (ebVar == null) {
                    synchronized (C62102d.class) {
                        ebVar = f167718b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167717a);
                            f167718b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
