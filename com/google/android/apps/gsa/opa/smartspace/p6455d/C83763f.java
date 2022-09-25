package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.f */
/* compiled from: PG */
public final class C83763f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83763f f228305d;

    /* renamed from: e */
    private static volatile C63010eb f228306e;

    /* renamed from: a */
    public int f228307a;

    /* renamed from: b */
    public long f228308b;

    /* renamed from: c */
    public long f228309c;

    static {
        C83763f fVar = new C83763f();
        f228305d = fVar;
        C62942bv.registerDefaultInstance(C83763f.class, fVar);
    }

    private C83763f() {
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
                return newMessageInfo(f228305d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83763f();
            case 4:
                return new C83762e();
            case 5:
                return f228305d;
            case 6:
                C63010eb ebVar = f228306e;
                if (ebVar == null) {
                    synchronized (C83763f.class) {
                        ebVar = f228306e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228305d);
                            f228306e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
