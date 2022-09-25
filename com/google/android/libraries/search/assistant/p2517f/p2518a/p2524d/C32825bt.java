package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bt */
/* compiled from: PG */
public final class C32825bt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32825bt f88021b;

    /* renamed from: c */
    private static volatile C63010eb f88022c;

    /* renamed from: a */
    public C32796ar f88023a;

    static {
        C32825bt btVar = new C32825bt();
        f88021b = btVar;
        C62942bv.registerDefaultInstance(C32825bt.class, btVar);
    }

    private C32825bt() {
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
                return newMessageInfo(f88021b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C32825bt();
            case 4:
                return new C32824bs();
            case 5:
                return f88021b;
            case 6:
                C63010eb ebVar = f88022c;
                if (ebVar == null) {
                    synchronized (C32825bt.class) {
                        ebVar = f88022c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88021b);
                            f88022c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
