package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.w */
/* compiled from: PG */
public final class C25284w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25284w f68778d;

    /* renamed from: e */
    private static volatile C63010eb f68779e;

    /* renamed from: a */
    public boolean f68780a;

    /* renamed from: b */
    public C25265d f68781b;

    /* renamed from: c */
    public C25269h f68782c;

    static {
        C25284w wVar = new C25284w();
        f68778d = wVar;
        C62942bv.registerDefaultInstance(C25284w.class, wVar);
    }

    private C25284w() {
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
                return newMessageInfo(f68778d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007", new Object[]{"b", C45240c.f118157a, "a"});
            case 3:
                return new C25284w();
            case 4:
                return new C25283v();
            case 5:
                return f68778d;
            case 6:
                C63010eb ebVar = f68779e;
                if (ebVar == null) {
                    synchronized (C25284w.class) {
                        ebVar = f68779e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68778d);
                            f68779e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
