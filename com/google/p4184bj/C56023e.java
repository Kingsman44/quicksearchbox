package com.google.p4184bj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4102au.p4103a.p4104a.p4105a.C54566d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.e */
/* compiled from: PG */
public final class C56023e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56023e f149193a;

    /* renamed from: e */
    private static volatile C63010eb f149194e;

    /* renamed from: b */
    private int f149195b;

    /* renamed from: c */
    private C54566d f149196c;

    /* renamed from: d */
    private byte f149197d = 2;

    static {
        C56023e eVar = new C56023e();
        f149193a = eVar;
        C62942bv.registerDefaultInstance(C56023e.class, eVar);
    }

    private C56023e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149197d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149197d = b;
                return null;
            case 2:
                return newMessageInfo(f149193a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56023e();
            case 4:
                return new C56004d();
            case 5:
                return f149193a;
            case 6:
                C63010eb ebVar = f149194e;
                if (ebVar == null) {
                    synchronized (C56023e.class) {
                        ebVar = f149194e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149193a);
                            f149194e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
