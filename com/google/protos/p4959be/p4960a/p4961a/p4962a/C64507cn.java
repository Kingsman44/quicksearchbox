package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cn */
/* compiled from: PG */
public final class C64507cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64507cn f174955c;

    /* renamed from: d */
    private static volatile C63010eb f174956d;

    /* renamed from: a */
    public C64520d f174957a;

    /* renamed from: b */
    public int f174958b;

    static {
        C64507cn cnVar = new C64507cn();
        f174955c = cnVar;
        C62942bv.registerDefaultInstance(C64507cn.class, cnVar);
    }

    private C64507cn() {
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
                return newMessageInfo(f174955c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C64507cn();
            case 4:
                return new C64506cm();
            case 5:
                return f174955c;
            case 6:
                C63010eb ebVar = f174956d;
                if (ebVar == null) {
                    synchronized (C64507cn.class) {
                        ebVar = f174956d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174955c);
                            f174956d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
