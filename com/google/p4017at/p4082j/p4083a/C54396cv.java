package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cv */
/* compiled from: PG */
public final class C54396cv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54396cv f142870c;

    /* renamed from: d */
    private static volatile C63010eb f142871d;

    /* renamed from: a */
    public C54394ct f142872a;

    /* renamed from: b */
    public int f142873b;

    static {
        C54396cv cvVar = new C54396cv();
        f142870c = cvVar;
        C62942bv.registerDefaultInstance(C54396cv.class, cvVar);
    }

    private C54396cv() {
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
                return newMessageInfo(f142870c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C54396cv();
            case 4:
                return new C54395cu();
            case 5:
                return f142870c;
            case 6:
                C63010eb ebVar = f142871d;
                if (ebVar == null) {
                    synchronized (C54396cv.class) {
                        ebVar = f142871d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142870c);
                            f142871d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
