package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.o */
/* compiled from: PG */
public final class C14567o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14567o f44040d;

    /* renamed from: e */
    private static volatile C63010eb f44041e;

    /* renamed from: a */
    public C14378h f44042a;

    /* renamed from: b */
    public int f44043b;

    /* renamed from: c */
    public C14486l f44044c;

    static {
        C14567o oVar = new C14567o();
        f44040d = oVar;
        C62942bv.registerDefaultInstance(C14567o.class, oVar);
    }

    private C14567o() {
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
                return newMessageInfo(f44040d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14567o();
            case 4:
                return new C14540n();
            case 5:
                return f44040d;
            case 6:
                C63010eb ebVar = f44041e;
                if (ebVar == null) {
                    synchronized (C14567o.class) {
                        ebVar = f44041e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44040d);
                            f44041e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
