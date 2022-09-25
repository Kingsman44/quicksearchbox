package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.ao */
/* compiled from: PG */
public final class C54671ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54671ao f143511b;

    /* renamed from: c */
    private static volatile C63010eb f143512c;

    /* renamed from: a */
    public C54740z f143513a;

    static {
        C54671ao aoVar = new C54671ao();
        f143511b = aoVar;
        C62942bv.registerDefaultInstance(C54671ao.class, aoVar);
    }

    private C54671ao() {
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
                return newMessageInfo(f143511b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54671ao();
            case 4:
                return new C54670an();
            case 5:
                return f143511b;
            case 6:
                C63010eb ebVar = f143512c;
                if (ebVar == null) {
                    synchronized (C54671ao.class) {
                        ebVar = f143512c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143511b);
                            f143512c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
