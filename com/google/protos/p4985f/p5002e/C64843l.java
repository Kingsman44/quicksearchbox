package com.google.protos.p4985f.p5002e;

import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.e.l */
/* compiled from: PG */
public final class C64843l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64843l f175721c;

    /* renamed from: d */
    private static volatile C63010eb f175722d;

    /* renamed from: a */
    public int f175723a;

    /* renamed from: b */
    public C52397qf f175724b;

    static {
        C64843l lVar = new C64843l();
        f175721c = lVar;
        C62942bv.registerDefaultInstance(C64843l.class, lVar);
    }

    private C64843l() {
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
                return newMessageInfo(f175721c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64843l();
            case 4:
                return new C64842k();
            case 5:
                return f175721c;
            case 6:
                C63010eb ebVar = f175722d;
                if (ebVar == null) {
                    synchronized (C64843l.class) {
                        ebVar = f175722d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175721c);
                            f175722d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
