package com.google.android.libraries.mdi.p2213d;

import com.google.common.p4552o.p4566l.C60124ap;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.f */
/* compiled from: PG */
public final class C28685f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28685f f77950c;

    /* renamed from: d */
    private static volatile C63010eb f77951d;

    /* renamed from: a */
    public int f77952a;

    /* renamed from: b */
    public C60124ap f77953b;

    static {
        C28685f fVar = new C28685f();
        f77950c = fVar;
        C62942bv.registerDefaultInstance(C28685f.class, fVar);
    }

    private C28685f() {
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
                return newMessageInfo(f77950c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28685f();
            case 4:
                return new C28684e();
            case 5:
                return f77950c;
            case 6:
                C63010eb ebVar = f77951d;
                if (ebVar == null) {
                    synchronized (C28685f.class) {
                        ebVar = f77951d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77950c);
                            f77951d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
