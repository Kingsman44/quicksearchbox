package com.google.protos.p4799ag.p4802b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ag.b.d */
/* compiled from: PG */
public final class C63164d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63164d f170556b;

    /* renamed from: d */
    private static volatile C63010eb f170557d;

    /* renamed from: a */
    public int f170558a;

    /* renamed from: c */
    private int f170559c;

    static {
        C63164d dVar = new C63164d();
        f170556b = dVar;
        C62942bv.registerDefaultInstance(C63164d.class, dVar);
    }

    private C63164d() {
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
                return newMessageInfo(f170556b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C63162b.m96190b()});
            case 3:
                return new C63164d();
            case 4:
                return new C63163c();
            case 5:
                return f170556b;
            case 6:
                C63010eb ebVar = f170557d;
                if (ebVar == null) {
                    synchronized (C63164d.class) {
                        ebVar = f170557d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170556b);
                            f170557d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
