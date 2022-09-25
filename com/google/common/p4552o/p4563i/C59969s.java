package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.s */
/* compiled from: PG */
public final class C59969s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59969s f162075d;

    /* renamed from: e */
    private static volatile C63010eb f162076e;

    /* renamed from: a */
    public int f162077a;

    /* renamed from: b */
    public C59965o f162078b;

    /* renamed from: c */
    public C59971u f162079c;

    static {
        C59969s sVar = new C59969s();
        f162075d = sVar;
        C62942bv.registerDefaultInstance(C59969s.class, sVar);
    }

    private C59969s() {
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
                return newMessageInfo(f162075d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59969s();
            case 4:
                return new C59968r();
            case 5:
                return f162075d;
            case 6:
                C63010eb ebVar = f162076e;
                if (ebVar == null) {
                    synchronized (C59969s.class) {
                        ebVar = f162076e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162075d);
                            f162076e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
