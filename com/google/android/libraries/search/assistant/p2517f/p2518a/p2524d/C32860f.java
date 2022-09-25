package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.f */
/* compiled from: PG */
public final class C32860f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32860f f88085b;

    /* renamed from: c */
    private static volatile C63010eb f88086c;

    /* renamed from: a */
    public C34793g f88087a;

    static {
        C32860f fVar = new C32860f();
        f88085b = fVar;
        C62942bv.registerDefaultInstance(C32860f.class, fVar);
    }

    private C32860f() {
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
                return newMessageInfo(f88085b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C32860f();
            case 4:
                return new C32859e();
            case 5:
                return f88085b;
            case 6:
                C63010eb ebVar = f88086c;
                if (ebVar == null) {
                    synchronized (C32860f.class) {
                        ebVar = f88086c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88085b);
                            f88086c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
