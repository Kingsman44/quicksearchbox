package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ws */
/* compiled from: PG */
public final class C88304ws extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88304ws f238817c;

    /* renamed from: d */
    private static volatile C63010eb f238818d;

    /* renamed from: a */
    public int f238819a;

    /* renamed from: b */
    public int f238820b;

    static {
        C88304ws wsVar = new C88304ws();
        f238817c = wsVar;
        C62942bv.registerDefaultInstance(C88304ws.class, wsVar);
    }

    private C88304ws() {
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
                return newMessageInfo(f238817c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88304ws();
            case 4:
                return new C88303wr();
            case 5:
                return f238817c;
            case 6:
                C63010eb ebVar = f238818d;
                if (ebVar == null) {
                    synchronized (C88304ws.class) {
                        ebVar = f238818d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238817c);
                            f238818d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
