package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.dw */
/* compiled from: PG */
public final class C49919dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49919dw f129746c;

    /* renamed from: d */
    private static volatile C63010eb f129747d;

    /* renamed from: a */
    public int f129748a;

    /* renamed from: b */
    public int f129749b;

    static {
        C49919dw dwVar = new C49919dw();
        f129746c = dwVar;
        C62942bv.registerDefaultInstance(C49919dw.class, dwVar);
    }

    private C49919dw() {
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
                return newMessageInfo(f129746c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C49917du.f129745a});
            case 3:
                return new C49919dw();
            case 4:
                return new C49916dt();
            case 5:
                return f129746c;
            case 6:
                C63010eb ebVar = f129747d;
                if (ebVar == null) {
                    synchronized (C49919dw.class) {
                        ebVar = f129747d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129746c);
                            f129747d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
