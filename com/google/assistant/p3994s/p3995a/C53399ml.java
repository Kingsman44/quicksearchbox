package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ml */
/* compiled from: PG */
public final class C53399ml extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53399ml f140122b;

    /* renamed from: d */
    private static volatile C63010eb f140123d;

    /* renamed from: a */
    public C53368lh f140124a;

    /* renamed from: c */
    private int f140125c;

    static {
        C53399ml mlVar = new C53399ml();
        f140122b = mlVar;
        C62942bv.registerDefaultInstance(C53399ml.class, mlVar);
    }

    private C53399ml() {
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
                return newMessageInfo(f140122b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53399ml();
            case 4:
                return new C53398mk();
            case 5:
                return f140122b;
            case 6:
                C63010eb ebVar = f140123d;
                if (ebVar == null) {
                    synchronized (C53399ml.class) {
                        ebVar = f140123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140122b);
                            f140123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
