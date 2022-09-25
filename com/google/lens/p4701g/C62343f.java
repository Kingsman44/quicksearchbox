package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.f */
/* compiled from: PG */
public final class C62343f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62343f f168300c;

    /* renamed from: d */
    private static volatile C63010eb f168301d;

    /* renamed from: a */
    public int f168302a;

    /* renamed from: b */
    public float f168303b;

    static {
        C62343f fVar = new C62343f();
        f168300c = fVar;
        C62942bv.registerDefaultInstance(C62343f.class, fVar);
    }

    private C62343f() {
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
                return newMessageInfo(f168300c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ခ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C62343f();
            case 4:
                return new C62342e();
            case 5:
                return f168300c;
            case 6:
                C63010eb ebVar = f168301d;
                if (ebVar == null) {
                    synchronized (C62343f.class) {
                        ebVar = f168301d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168300c);
                            f168301d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
