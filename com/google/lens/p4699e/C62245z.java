package com.google.lens.p4699e;

import com.google.lens.p4707j.C62445bv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.z */
/* compiled from: PG */
public final class C62245z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62245z f168048c;

    /* renamed from: d */
    private static volatile C63010eb f168049d;

    /* renamed from: a */
    public int f168050a;

    /* renamed from: b */
    public C62445bv f168051b;

    static {
        C62245z zVar = new C62245z();
        f168048c = zVar;
        C62942bv.registerDefaultInstance(C62245z.class, zVar);
    }

    private C62245z() {
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
                return newMessageInfo(f168048c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62245z();
            case 4:
                return new C62244y();
            case 5:
                return f168048c;
            case 6:
                C63010eb ebVar = f168049d;
                if (ebVar == null) {
                    synchronized (C62245z.class) {
                        ebVar = f168049d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168048c);
                            f168049d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
