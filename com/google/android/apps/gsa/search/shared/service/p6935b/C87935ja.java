package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ja */
/* compiled from: PG */
public final class C87935ja extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87935ja f237850c;

    /* renamed from: d */
    private static volatile C63010eb f237851d;

    /* renamed from: a */
    public int f237852a;

    /* renamed from: b */
    public int f237853b;

    static {
        C87935ja jaVar = new C87935ja();
        f237850c = jaVar;
        C62942bv.registerDefaultInstance(C87935ja.class, jaVar);
    }

    private C87935ja() {
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
                return newMessageInfo(f237850c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87935ja();
            case 4:
                return new C87933iz();
            case 5:
                return f237850c;
            case 6:
                C63010eb ebVar = f237851d;
                if (ebVar == null) {
                    synchronized (C87935ja.class) {
                        ebVar = f237851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237850c);
                            f237851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
