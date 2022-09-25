package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.c.f */
/* compiled from: PG */
public final class C32337f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32337f f86678b;

    /* renamed from: c */
    private static volatile C63010eb f86679c;

    /* renamed from: a */
    public C32849cq f86680a;

    static {
        C32337f fVar = new C32337f();
        f86678b = fVar;
        C62942bv.registerDefaultInstance(C32337f.class, fVar);
    }

    private C32337f() {
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
                return newMessageInfo(f86678b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C32337f();
            case 4:
                return new C32336e();
            case 5:
                return f86678b;
            case 6:
                C63010eb ebVar = f86679c;
                if (ebVar == null) {
                    synchronized (C32337f.class) {
                        ebVar = f86679c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86678b);
                            f86679c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
