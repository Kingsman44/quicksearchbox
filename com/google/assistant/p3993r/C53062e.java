package com.google.assistant.p3993r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.r.e */
/* compiled from: PG */
public final class C53062e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53062e f139061a;

    /* renamed from: b */
    private static volatile C63010eb f139062b;

    static {
        C53062e eVar = new C53062e();
        f139061a = eVar;
        C62942bv.registerDefaultInstance(C53062e.class, eVar);
    }

    private C53062e() {
        emptyProtobufList();
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
                return newMessageInfo(f139061a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53062e();
            case 4:
                return new C53061d();
            case 5:
                return f139061a;
            case 6:
                C63010eb ebVar = f139062b;
                if (ebVar == null) {
                    synchronized (C53062e.class) {
                        ebVar = f139062b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139061a);
                            f139062b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
