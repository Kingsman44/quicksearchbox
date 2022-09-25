package com.google.assistant.p3745ab.p3749ac;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ac.d */
/* compiled from: PG */
public final class C48215d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48215d f124745a;

    /* renamed from: b */
    private static volatile C63010eb f124746b;

    static {
        C48215d dVar = new C48215d();
        f124745a = dVar;
        C62942bv.registerDefaultInstance(C48215d.class, dVar);
    }

    private C48215d() {
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
                return newMessageInfo(f124745a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48215d();
            case 4:
                return new C48214c();
            case 5:
                return f124745a;
            case 6:
                C63010eb ebVar = f124746b;
                if (ebVar == null) {
                    synchronized (C48215d.class) {
                        ebVar = f124746b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124745a);
                            f124746b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
