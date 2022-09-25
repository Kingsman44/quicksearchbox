package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.rv */
/* compiled from: PG */
public final class C52440rv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52440rv f137654d;

    /* renamed from: e */
    private static volatile C63010eb f137655e;

    /* renamed from: a */
    public int f137656a;

    /* renamed from: b */
    public boolean f137657b;

    /* renamed from: c */
    public boolean f137658c;

    static {
        C52440rv rvVar = new C52440rv();
        f137654d = rvVar;
        C62942bv.registerDefaultInstance(C52440rv.class, rvVar);
    }

    private C52440rv() {
        emptyIntList();
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
                return newMessageInfo(f137654d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52440rv();
            case 4:
                return new C52439ru();
            case 5:
                return f137654d;
            case 6:
                C63010eb ebVar = f137655e;
                if (ebVar == null) {
                    synchronized (C52440rv.class) {
                        ebVar = f137655e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137654d);
                            f137655e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
