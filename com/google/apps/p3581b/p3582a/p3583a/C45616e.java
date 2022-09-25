package com.google.apps.p3581b.p3582a.p3583a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.b.a.a.e */
/* compiled from: PG */
public final class C45616e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45616e f119983a;

    /* renamed from: b */
    private static volatile C63010eb f119984b;

    static {
        C45616e eVar = new C45616e();
        f119983a = eVar;
        C62942bv.registerDefaultInstance(C45616e.class, eVar);
    }

    private C45616e() {
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
                return newMessageInfo(f119983a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C45616e();
            case 4:
                return new C45615d();
            case 5:
                return f119983a;
            case 6:
                C63010eb ebVar = f119984b;
                if (ebVar == null) {
                    synchronized (C45616e.class) {
                        ebVar = f119984b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119983a);
                            f119984b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
