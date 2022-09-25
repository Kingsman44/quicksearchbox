package com.google.android.apps.gsa.shared.p7020bd;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.bd.d */
/* compiled from: PG */
public final class C89411d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89411d f242393c;

    /* renamed from: d */
    private static volatile C63010eb f242394d;

    /* renamed from: a */
    public int f242395a;

    /* renamed from: b */
    public boolean f242396b;

    static {
        C89411d dVar = new C89411d();
        f242393c = dVar;
        C62942bv.registerDefaultInstance(C89411d.class, dVar);
    }

    private C89411d() {
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
                return newMessageInfo(f242393c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C89411d();
            case 4:
                return new C89410c();
            case 5:
                return f242393c;
            case 6:
                C63010eb ebVar = f242394d;
                if (ebVar == null) {
                    synchronized (C89411d.class) {
                        ebVar = f242394d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242393c);
                            f242394d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
