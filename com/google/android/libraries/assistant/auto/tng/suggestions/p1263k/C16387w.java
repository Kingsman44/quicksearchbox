package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.w */
/* compiled from: PG */
public final class C16387w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16387w f48230b;

    /* renamed from: d */
    private static volatile C63010eb f48231d;

    /* renamed from: a */
    public int f48232a;

    /* renamed from: c */
    private int f48233c;

    static {
        C16387w wVar = new C16387w();
        f48230b = wVar;
        C62942bv.registerDefaultInstance(C16387w.class, wVar);
    }

    private C16387w() {
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
                return newMessageInfo(f48230b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C16389y.m33346b()});
            case 3:
                return new C16387w();
            case 4:
                return new C16386v();
            case 5:
                return f48230b;
            case 6:
                C63010eb ebVar = f48231d;
                if (ebVar == null) {
                    synchronized (C16387w.class) {
                        ebVar = f48231d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48230b);
                            f48231d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
