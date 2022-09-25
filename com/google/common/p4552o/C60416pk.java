package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pk */
/* compiled from: PG */
public final class C60416pk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60416pk f163490d;

    /* renamed from: e */
    private static volatile C63010eb f163491e;

    /* renamed from: a */
    public int f163492a;

    /* renamed from: b */
    public int f163493b;

    /* renamed from: c */
    public int f163494c;

    static {
        C60416pk pkVar = new C60416pk();
        f163490d = pkVar;
        C62942bv.registerDefaultInstance(C60416pk.class, pkVar);
    }

    private C60416pk() {
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
                return newMessageInfo(f163490d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60416pk();
            case 4:
                return new C60415pj();
            case 5:
                return f163490d;
            case 6:
                C63010eb ebVar = f163491e;
                if (ebVar == null) {
                    synchronized (C60416pk.class) {
                        ebVar = f163491e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163490d);
                            f163491e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
