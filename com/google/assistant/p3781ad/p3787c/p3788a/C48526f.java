package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.f */
/* compiled from: PG */
public final class C48526f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48526f f125353d;

    /* renamed from: e */
    private static volatile C63010eb f125354e;

    /* renamed from: a */
    public int f125355a;

    /* renamed from: b */
    public C48496ao f125356b;

    /* renamed from: c */
    public C48496ao f125357c;

    static {
        C48526f fVar = new C48526f();
        f125353d = fVar;
        C62942bv.registerDefaultInstance(C48526f.class, fVar);
    }

    private C48526f() {
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
                return newMessageInfo(f125353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48526f();
            case 4:
                return new C48525e();
            case 5:
                return f125353d;
            case 6:
                C63010eb ebVar = f125354e;
                if (ebVar == null) {
                    synchronized (C48526f.class) {
                        ebVar = f125354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125353d);
                            f125354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
