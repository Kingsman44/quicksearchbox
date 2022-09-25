package com.google.android.apps.p471d.p482b.p483a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.b.a.k */
/* compiled from: PG */
public final class C9050k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9050k f31264b;

    /* renamed from: d */
    private static volatile C63010eb f31265d;

    /* renamed from: a */
    public int f31266a;

    /* renamed from: c */
    private int f31267c;

    static {
        C9050k kVar = new C9050k();
        f31264b = kVar;
        C62942bv.registerDefaultInstance(C9050k.class, kVar);
    }

    private C9050k() {
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
                return newMessageInfo(f31264b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C9049j.m23588b()});
            case 3:
                return new C9050k();
            case 4:
                return new C9047h();
            case 5:
                return f31264b;
            case 6:
                C63010eb ebVar = f31265d;
                if (ebVar == null) {
                    synchronized (C9050k.class) {
                        ebVar = f31265d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31264b);
                            f31265d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
