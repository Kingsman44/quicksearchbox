package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mo */
/* compiled from: PG */
public final class C88030mo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88030mo f238044c;

    /* renamed from: d */
    private static volatile C63010eb f238045d;

    /* renamed from: a */
    public int f238046a;

    /* renamed from: b */
    public int f238047b;

    static {
        C88030mo moVar = new C88030mo();
        f238044c = moVar;
        C62942bv.registerDefaultInstance(C88030mo.class, moVar);
    }

    private C88030mo() {
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
                return newMessageInfo(f238044c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88030mo();
            case 4:
                return new C88029mn();
            case 5:
                return f238044c;
            case 6:
                C63010eb ebVar = f238045d;
                if (ebVar == null) {
                    synchronized (C88030mo.class) {
                        ebVar = f238045d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238044c);
                            f238045d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
