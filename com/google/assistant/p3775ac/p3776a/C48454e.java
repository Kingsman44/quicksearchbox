package com.google.assistant.p3775ac.p3776a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.a.e */
/* compiled from: PG */
public final class C48454e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48454e f125180a;

    /* renamed from: b */
    private static volatile C63010eb f125181b;

    static {
        C48454e eVar = new C48454e();
        f125180a = eVar;
        C62942bv.registerDefaultInstance(C48454e.class, eVar);
    }

    private C48454e() {
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
                return newMessageInfo(f125180a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48454e();
            case 4:
                return new C48453d();
            case 5:
                return f125180a;
            case 6:
                C63010eb ebVar = f125181b;
                if (ebVar == null) {
                    synchronized (C48454e.class) {
                        ebVar = f125181b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125180a);
                            f125181b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
