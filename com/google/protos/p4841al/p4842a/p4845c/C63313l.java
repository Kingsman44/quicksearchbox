package com.google.protos.p4841al.p4842a.p4845c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.c.l */
/* compiled from: PG */
public final class C63313l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63313l f171119c;

    /* renamed from: d */
    private static volatile C63010eb f171120d;

    /* renamed from: a */
    public int f171121a;

    /* renamed from: b */
    public C63307f f171122b;

    static {
        C63313l lVar = new C63313l();
        f171119c = lVar;
        C62942bv.registerDefaultInstance(C63313l.class, lVar);
    }

    private C63313l() {
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
                return newMessageInfo(f171119c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63313l();
            case 4:
                return new C63312k();
            case 5:
                return f171119c;
            case 6:
                C63010eb ebVar = f171120d;
                if (ebVar == null) {
                    synchronized (C63313l.class) {
                        ebVar = f171120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171119c);
                            f171120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
