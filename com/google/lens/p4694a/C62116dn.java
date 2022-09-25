package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dn */
/* compiled from: PG */
public final class C62116dn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62116dn f167742a;

    /* renamed from: b */
    private static volatile C63010eb f167743b;

    static {
        C62116dn dnVar = new C62116dn();
        f167742a = dnVar;
        C62942bv.registerDefaultInstance(C62116dn.class, dnVar);
    }

    private C62116dn() {
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
                return newMessageInfo(f167742a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62116dn();
            case 4:
                return new C62115dm();
            case 5:
                return f167742a;
            case 6:
                C63010eb ebVar = f167743b;
                if (ebVar == null) {
                    synchronized (C62116dn.class) {
                        ebVar = f167743b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167742a);
                            f167743b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
