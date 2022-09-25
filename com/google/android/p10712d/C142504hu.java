package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.hu */
/* compiled from: PG */
public final class C142504hu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142504hu f386707b;

    /* renamed from: c */
    private static volatile C63010eb f386708c;

    /* renamed from: a */
    public C63088z f386709a = C63088z.f170246b;

    static {
        C142504hu huVar = new C142504hu();
        f386707b = huVar;
        C62942bv.registerDefaultInstance(C142504hu.class, huVar);
    }

    private C142504hu() {
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
                return newMessageInfo(f386707b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C142504hu();
            case 4:
                return new C142503ht();
            case 5:
                return f386707b;
            case 6:
                C63010eb ebVar = f386708c;
                if (ebVar == null) {
                    synchronized (C142504hu.class) {
                        ebVar = f386708c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386707b);
                            f386708c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
