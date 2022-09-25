package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.am */
/* compiled from: PG */
public final class C63412am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63412am f171372a;

    /* renamed from: e */
    private static volatile C63010eb f171373e;

    /* renamed from: b */
    private int f171374b;

    /* renamed from: c */
    private C63408ai f171375c;

    /* renamed from: d */
    private byte f171376d = 2;

    static {
        C63412am amVar = new C63412am();
        f171372a = amVar;
        C62942bv.registerDefaultInstance(C63412am.class, amVar);
    }

    private C63412am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171376d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171376d = b;
                return null;
            case 2:
                return newMessageInfo(f171372a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63412am();
            case 4:
                return new C63411al();
            case 5:
                return f171372a;
            case 6:
                C63010eb ebVar = f171373e;
                if (ebVar == null) {
                    synchronized (C63412am.class) {
                        ebVar = f171373e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171372a);
                            f171373e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
