package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.i */
/* compiled from: PG */
public final class C64533i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64533i f175013c;

    /* renamed from: d */
    private static volatile C63010eb f175014d;

    /* renamed from: a */
    public C64532h f175015a;

    /* renamed from: b */
    public C62910ar f175016b;

    static {
        C64533i iVar = new C64533i();
        f175013c = iVar;
        C62942bv.registerDefaultInstance(C64533i.class, iVar);
    }

    private C64533i() {
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
                return newMessageInfo(f175013c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64533i();
            case 4:
                return new C64530f();
            case 5:
                return f175013c;
            case 6:
                C63010eb ebVar = f175014d;
                if (ebVar == null) {
                    synchronized (C64533i.class) {
                        ebVar = f175014d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175013c);
                            f175014d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
