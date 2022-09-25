package com.google.p4605f.p4606a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.f.a.e */
/* compiled from: PG */
public final class C61077e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61077e f165352b;

    /* renamed from: d */
    private static volatile C63010eb f165353d;

    /* renamed from: a */
    public int f165354a;

    /* renamed from: c */
    private int f165355c;

    static {
        C61077e eVar = new C61077e();
        f165352b = eVar;
        C62942bv.registerDefaultInstance(C61077e.class, eVar);
    }

    private C61077e() {
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
                return newMessageInfo(f165352b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C61075c.f165351a});
            case 3:
                return new C61077e();
            case 4:
                return new C61074b();
            case 5:
                return f165352b;
            case 6:
                C63010eb ebVar = f165353d;
                if (ebVar == null) {
                    synchronized (C61077e.class) {
                        ebVar = f165353d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165352b);
                            f165353d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
