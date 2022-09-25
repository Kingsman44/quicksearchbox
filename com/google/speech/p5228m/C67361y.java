package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.y */
/* compiled from: PG */
public final class C67361y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67361y f183093c;

    /* renamed from: e */
    private static volatile C63010eb f183094e;

    /* renamed from: a */
    public long f183095a;

    /* renamed from: b */
    public long f183096b;

    /* renamed from: d */
    private int f183097d;

    static {
        C67361y yVar = new C67361y();
        f183093c = yVar;
        C62942bv.registerDefaultInstance(C67361y.class, yVar);
    }

    private C67361y() {
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
                return newMessageInfo(f183093c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C67361y();
            case 4:
                return new C67360x();
            case 5:
                return f183093c;
            case 6:
                C63010eb ebVar = f183094e;
                if (ebVar == null) {
                    synchronized (C67361y.class) {
                        ebVar = f183094e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183093c);
                            f183094e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
