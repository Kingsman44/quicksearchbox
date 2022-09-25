package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.f */
/* compiled from: PG */
public final class C53721f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53721f f141035a;

    /* renamed from: b */
    private static volatile C63010eb f141036b;

    static {
        C53721f fVar = new C53721f();
        f141035a = fVar;
        C62942bv.registerDefaultInstance(C53721f.class, fVar);
    }

    private C53721f() {
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
                return newMessageInfo(f141035a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53721f();
            case 4:
                return new C53720e();
            case 5:
                return f141035a;
            case 6:
                C63010eb ebVar = f141036b;
                if (ebVar == null) {
                    synchronized (C53721f.class) {
                        ebVar = f141036b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141035a);
                            f141036b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
