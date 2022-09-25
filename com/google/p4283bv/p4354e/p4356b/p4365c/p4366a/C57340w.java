package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.e.b.c.a.w */
/* compiled from: PG */
public final class C57340w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57340w f153198a;

    /* renamed from: b */
    private static volatile C63010eb f153199b;

    static {
        C57340w wVar = new C57340w();
        f153198a = wVar;
        C62942bv.registerDefaultInstance(C57340w.class, wVar);
    }

    private C57340w() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f153198a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57340w();
            case 4:
                return new C57339v();
            case 5:
                return f153198a;
            case 6:
                C63010eb ebVar = f153199b;
                if (ebVar == null) {
                    synchronized (C57340w.class) {
                        ebVar = f153199b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153198a);
                            f153199b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
