package com.google.p5173q.p5174a.p5175a.p5176a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.q.a.a.a.b */
/* compiled from: PG */
public final class C66272b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66272b f180229a;

    /* renamed from: b */
    private static volatile C63010eb f180230b;

    static {
        C66272b bVar = new C66272b();
        f180229a = bVar;
        C62942bv.registerDefaultInstance(C66272b.class, bVar);
    }

    private C66272b() {
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
                return newMessageInfo(f180229a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66272b();
            case 4:
                return new C66271a();
            case 5:
                return f180229a;
            case 6:
                C63010eb ebVar = f180230b;
                if (ebVar == null) {
                    synchronized (C66272b.class) {
                        ebVar = f180230b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180229a);
                            f180230b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
