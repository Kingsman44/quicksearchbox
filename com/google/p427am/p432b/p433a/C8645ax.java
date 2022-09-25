package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.ax */
/* compiled from: PG */
public final class C8645ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8645ax f29929b;

    /* renamed from: c */
    private static volatile C63010eb f29930c;

    /* renamed from: a */
    public int f29931a;

    static {
        C8645ax axVar = new C8645ax();
        f29929b = axVar;
        C62942bv.registerDefaultInstance(C8645ax.class, axVar);
    }

    private C8645ax() {
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
                return newMessageInfo(f29929b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8645ax();
            case 4:
                return new C8643av();
            case 5:
                return f29929b;
            case 6:
                C63010eb ebVar = f29930c;
                if (ebVar == null) {
                    synchronized (C8645ax.class) {
                        ebVar = f29930c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29929b);
                            f29930c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
