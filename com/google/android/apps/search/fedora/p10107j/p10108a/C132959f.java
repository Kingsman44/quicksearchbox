package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.f */
/* compiled from: PG */
public final class C132959f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132959f f362648a;

    /* renamed from: b */
    private static volatile C63010eb f362649b;

    static {
        C132959f fVar = new C132959f();
        f362648a = fVar;
        C62942bv.registerDefaultInstance(C132959f.class, fVar);
    }

    private C132959f() {
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
                return newMessageInfo(f362648a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132959f();
            case 4:
                return new C132958e();
            case 5:
                return f362648a;
            case 6:
                C63010eb ebVar = f362649b;
                if (ebVar == null) {
                    synchronized (C132959f.class) {
                        ebVar = f362649b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362648a);
                            f362649b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
