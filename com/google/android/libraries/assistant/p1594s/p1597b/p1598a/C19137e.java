package com.google.android.libraries.assistant.p1594s.p1597b.p1598a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.a.e */
/* compiled from: PG */
public final class C19137e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19137e f53607a;

    /* renamed from: b */
    private static volatile C63010eb f53608b;

    static {
        C19137e eVar = new C19137e();
        f53607a = eVar;
        C62942bv.registerDefaultInstance(C19137e.class, eVar);
    }

    private C19137e() {
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
                return newMessageInfo(f53607a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C19137e();
            case 4:
                return new C19136d();
            case 5:
                return f53607a;
            case 6:
                C63010eb ebVar = f53608b;
                if (ebVar == null) {
                    synchronized (C19137e.class) {
                        ebVar = f53608b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53607a);
                            f53608b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
