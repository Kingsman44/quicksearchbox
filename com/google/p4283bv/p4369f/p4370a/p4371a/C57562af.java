package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.af */
/* compiled from: PG */
public final class C57562af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57562af f153778a;

    /* renamed from: b */
    private static volatile C63010eb f153779b;

    static {
        C57562af afVar = new C57562af();
        f153778a = afVar;
        C62942bv.registerDefaultInstance(C57562af.class, afVar);
    }

    private C57562af() {
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
                return newMessageInfo(f153778a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57562af();
            case 4:
                return new C57561ae();
            case 5:
                return f153778a;
            case 6:
                C63010eb ebVar = f153779b;
                if (ebVar == null) {
                    synchronized (C57562af.class) {
                        ebVar = f153779b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153778a);
                            f153779b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
