package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.h */
/* compiled from: PG */
public final class C53797h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53797h f141203b;

    /* renamed from: c */
    private static volatile C63010eb f141204c;

    /* renamed from: a */
    public C62971cq f141205a = emptyProtobufList();

    static {
        C53797h hVar = new C53797h();
        f141203b = hVar;
        C62942bv.registerDefaultInstance(C53797h.class, hVar);
    }

    private C53797h() {
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
                return newMessageInfo(f141203b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C53796g.class});
            case 3:
                return new C53797h();
            case 4:
                return new C53794e();
            case 5:
                return f141203b;
            case 6:
                C63010eb ebVar = f141204c;
                if (ebVar == null) {
                    synchronized (C53797h.class) {
                        ebVar = f141204c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141203b);
                            f141204c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
