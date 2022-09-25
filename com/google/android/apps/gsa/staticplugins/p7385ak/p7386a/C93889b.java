package com.google.android.apps.gsa.staticplugins.p7385ak.p7386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.a.b */
/* compiled from: PG */
public final class C93889b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C93889b f262231c;

    /* renamed from: d */
    private static volatile C63010eb f262232d;

    /* renamed from: a */
    public int f262233a;

    /* renamed from: b */
    public C63042fg f262234b;

    static {
        C93889b bVar = new C93889b();
        f262231c = bVar;
        C62942bv.registerDefaultInstance(C93889b.class, bVar);
    }

    private C93889b() {
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
                return newMessageInfo(f262231c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C93889b();
            case 4:
                return new C93888a();
            case 5:
                return f262231c;
            case 6:
                C63010eb ebVar = f262232d;
                if (ebVar == null) {
                    synchronized (C93889b.class) {
                        ebVar = f262232d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f262231c);
                            f262232d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
