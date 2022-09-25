package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.h */
/* compiled from: PG */
public final class C24797h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24797h f67760b;

    /* renamed from: c */
    private static volatile C63010eb f67761c;

    /* renamed from: a */
    public C62971cq f67762a = emptyProtobufList();

    static {
        C24797h hVar = new C24797h();
        f67760b = hVar;
        C62942bv.registerDefaultInstance(C24797h.class, hVar);
    }

    private C24797h() {
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
                return newMessageInfo(f67760b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C24810u.class});
            case 3:
                return new C24797h();
            case 4:
                return new C24796g();
            case 5:
                return f67760b;
            case 6:
                C63010eb ebVar = f67761c;
                if (ebVar == null) {
                    synchronized (C24797h.class) {
                        ebVar = f67761c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67760b);
                            f67761c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
