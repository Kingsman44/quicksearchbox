package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cb */
/* compiled from: PG */
public final class C54376cb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54376cb f142833a;

    /* renamed from: b */
    private static volatile C63010eb f142834b;

    static {
        C54376cb cbVar = new C54376cb();
        f142833a = cbVar;
        C62942bv.registerDefaultInstance(C54376cb.class, cbVar);
    }

    private C54376cb() {
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
                return newMessageInfo(f142833a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54376cb();
            case 4:
                return new C54375ca();
            case 5:
                return f142833a;
            case 6:
                C63010eb ebVar = f142834b;
                if (ebVar == null) {
                    synchronized (C54376cb.class) {
                        ebVar = f142834b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142833a);
                            f142834b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
