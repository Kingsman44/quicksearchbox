package com.google.android.apps.p453b.p457b.p460b.p462b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.b.b.b.b.l */
/* compiled from: PG */
public final class C9012l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9012l f31137c;

    /* renamed from: e */
    private static volatile C63010eb f31138e;

    /* renamed from: a */
    public C62971cq f31139a = emptyProtobufList();

    /* renamed from: b */
    public boolean f31140b;

    /* renamed from: d */
    private int f31141d;

    static {
        C9012l lVar = new C9012l();
        f31137c = lVar;
        C62942bv.registerDefaultInstance(C9012l.class, lVar);
    }

    private C9012l() {
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
                return newMessageInfo(f31137c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0001", new Object[]{"d", "a", C9008h.class, "b"});
            case 3:
                return new C9012l();
            case 4:
                return new C9011k();
            case 5:
                return f31137c;
            case 6:
                C63010eb ebVar = f31138e;
                if (ebVar == null) {
                    synchronized (C9012l.class) {
                        ebVar = f31138e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31137c);
                            f31138e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
