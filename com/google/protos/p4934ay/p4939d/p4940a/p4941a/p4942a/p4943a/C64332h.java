package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.h */
/* compiled from: PG */
public final class C64332h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64332h f173923a;

    /* renamed from: d */
    private static volatile C63010eb f173924d;

    /* renamed from: b */
    private int f173925b;

    /* renamed from: c */
    private C51805du f173926c;

    static {
        C64332h hVar = new C64332h();
        f173923a = hVar;
        C62942bv.registerDefaultInstance(C64332h.class, hVar);
    }

    private C64332h() {
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
                return newMessageInfo(f173923a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64332h();
            case 4:
                return new C64331g();
            case 5:
                return f173923a;
            case 6:
                C63010eb ebVar = f173924d;
                if (ebVar == null) {
                    synchronized (C64332h.class) {
                        ebVar = f173924d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173923a);
                            f173924d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
