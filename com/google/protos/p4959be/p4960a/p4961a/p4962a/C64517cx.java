package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cx */
/* compiled from: PG */
public final class C64517cx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64517cx f174975b;

    /* renamed from: c */
    private static volatile C63010eb f174976c;

    /* renamed from: a */
    public int f174977a;

    static {
        C64517cx cxVar = new C64517cx();
        f174975b = cxVar;
        C62942bv.registerDefaultInstance(C64517cx.class, cxVar);
    }

    private C64517cx() {
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
                return newMessageInfo(f174975b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C64517cx();
            case 4:
                return new C64516cw();
            case 5:
                return f174975b;
            case 6:
                C63010eb ebVar = f174976c;
                if (ebVar == null) {
                    synchronized (C64517cx.class) {
                        ebVar = f174976c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174975b);
                            f174976c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
