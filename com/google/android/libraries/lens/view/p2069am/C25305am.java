package com.google.android.libraries.lens.view.p2069am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.am */
/* compiled from: PG */
public final class C25305am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25305am f68828d;

    /* renamed from: e */
    private static volatile C63010eb f68829e;

    /* renamed from: a */
    public C25318az f68830a;

    /* renamed from: b */
    public float f68831b;

    /* renamed from: c */
    public boolean f68832c;

    static {
        C25305am amVar = new C25305am();
        f68828d = amVar;
        C62942bv.registerDefaultInstance(C25305am.class, amVar);
    }

    private C25305am() {
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
                return newMessageInfo(f68828d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0001\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C25305am();
            case 4:
                return new C25304al();
            case 5:
                return f68828d;
            case 6:
                C63010eb ebVar = f68829e;
                if (ebVar == null) {
                    synchronized (C25305am.class) {
                        ebVar = f68829e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68828d);
                            f68829e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
