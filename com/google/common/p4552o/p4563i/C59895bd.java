package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bd */
/* compiled from: PG */
public final class C59895bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59895bd f161854d;

    /* renamed from: e */
    private static volatile C63010eb f161855e;

    /* renamed from: a */
    public int f161856a;

    /* renamed from: b */
    public int f161857b;

    /* renamed from: c */
    public int f161858c;

    static {
        C59895bd bdVar = new C59895bd();
        f161854d = bdVar;
        C62942bv.registerDefaultInstance(C59895bd.class, bdVar);
    }

    private C59895bd() {
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
                return newMessageInfo(f161854d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C59894bc.f161853a, C45240c.f118157a, C59893bb.f161852a});
            case 3:
                return new C59895bd();
            case 4:
                return new C59892ba();
            case 5:
                return f161854d;
            case 6:
                C63010eb ebVar = f161855e;
                if (ebVar == null) {
                    synchronized (C59895bd.class) {
                        ebVar = f161855e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161854d);
                            f161855e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
