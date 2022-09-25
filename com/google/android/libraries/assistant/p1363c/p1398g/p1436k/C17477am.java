package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.c.g.k.am */
/* compiled from: PG */
public final class C17477am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17477am f50464c;

    /* renamed from: d */
    private static volatile C63010eb f50465d;

    /* renamed from: a */
    public int f50466a;

    /* renamed from: b */
    public C63088z f50467b = C63088z.f170246b;

    static {
        C17477am amVar = new C17477am();
        f50464c = amVar;
        C62942bv.registerDefaultInstance(C17477am.class, amVar);
    }

    private C17477am() {
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
                return newMessageInfo(f50464c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17477am();
            case 4:
                return new C17476al();
            case 5:
                return f50464c;
            case 6:
                C63010eb ebVar = f50465d;
                if (ebVar == null) {
                    synchronized (C17477am.class) {
                        ebVar = f50465d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50464c);
                            f50465d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
