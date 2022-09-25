package com.google.assistant.p3775ac.p3779d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.d.f */
/* compiled from: PG */
public final class C48466f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48466f f125203a;

    /* renamed from: b */
    private static volatile C63010eb f125204b;

    static {
        C48466f fVar = new C48466f();
        f125203a = fVar;
        C62942bv.registerDefaultInstance(C48466f.class, fVar);
    }

    private C48466f() {
        emptyProtobufList();
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
                return newMessageInfo(f125203a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48466f();
            case 4:
                return new C48465e();
            case 5:
                return f125203a;
            case 6:
                C63010eb ebVar = f125204b;
                if (ebVar == null) {
                    synchronized (C48466f.class) {
                        ebVar = f125204b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125203a);
                            f125204b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
