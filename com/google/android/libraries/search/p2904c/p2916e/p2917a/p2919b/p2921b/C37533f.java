package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.e.a.b.b.f */
/* compiled from: PG */
public final class C37533f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C37533f f99715b;

    /* renamed from: c */
    private static volatile C63010eb f99716c;

    /* renamed from: a */
    public C62971cq f99717a = emptyProtobufList();

    static {
        C37533f fVar = new C37533f();
        f99715b = fVar;
        C62942bv.registerDefaultInstance(C37533f.class, fVar);
    }

    private C37533f() {
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
                return newMessageInfo(f99715b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C37529b.class});
            case 3:
                return new C37533f();
            case 4:
                return new C37532e();
            case 5:
                return f99715b;
            case 6:
                C63010eb ebVar = f99716c;
                if (ebVar == null) {
                    synchronized (C37533f.class) {
                        ebVar = f99716c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99715b);
                            f99716c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
