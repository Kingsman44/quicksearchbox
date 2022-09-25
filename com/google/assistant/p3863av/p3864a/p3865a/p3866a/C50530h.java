package com.google.assistant.p3863av.p3864a.p3865a.p3866a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.a.a.a.h */
/* compiled from: PG */
public final class C50530h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50530h f131516a;

    /* renamed from: b */
    private static volatile C63010eb f131517b;

    static {
        C50530h hVar = new C50530h();
        f131516a = hVar;
        C62942bv.registerDefaultInstance(C50530h.class, hVar);
    }

    private C50530h() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f131516a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50530h();
            case 4:
                return new C50529g();
            case 5:
                return f131516a;
            case 6:
                C63010eb ebVar = f131517b;
                if (ebVar == null) {
                    synchronized (C50530h.class) {
                        ebVar = f131517b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131516a);
                            f131517b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
