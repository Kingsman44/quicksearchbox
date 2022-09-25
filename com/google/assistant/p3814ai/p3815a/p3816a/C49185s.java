package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.s */
/* compiled from: PG */
public final class C49185s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49185s f127170b;

    /* renamed from: c */
    private static volatile C63010eb f127171c;

    /* renamed from: a */
    public C62971cq f127172a = C62942bv.emptyProtobufList();

    static {
        C49185s sVar = new C49185s();
        f127170b = sVar;
        C62942bv.registerDefaultInstance(C49185s.class, sVar);
    }

    private C49185s() {
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
                return newMessageInfo(f127170b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C49185s();
            case 4:
                return new C49184r();
            case 5:
                return f127170b;
            case 6:
                C63010eb ebVar = f127171c;
                if (ebVar == null) {
                    synchronized (C49185s.class) {
                        ebVar = f127171c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127170b);
                            f127171c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
