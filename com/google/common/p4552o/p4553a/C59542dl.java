package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.dl */
/* compiled from: PG */
public final class C59542dl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59542dl f157997d;

    /* renamed from: e */
    private static volatile C63010eb f157998e;

    /* renamed from: a */
    public int f157999a;

    /* renamed from: b */
    public int f158000b;

    /* renamed from: c */
    public int f158001c;

    static {
        C59542dl dlVar = new C59542dl();
        f157997d = dlVar;
        C62942bv.registerDefaultInstance(C59542dl.class, dlVar);
    }

    private C59542dl() {
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
                return newMessageInfo(f157997d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59542dl();
            case 4:
                return new C59541dk();
            case 5:
                return f157997d;
            case 6:
                C63010eb ebVar = f157998e;
                if (ebVar == null) {
                    synchronized (C59542dl.class) {
                        ebVar = f157998e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157997d);
                            f157998e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
