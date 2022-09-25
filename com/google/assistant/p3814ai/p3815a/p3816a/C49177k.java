package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.k */
/* compiled from: PG */
public final class C49177k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49177k f127156b;

    /* renamed from: c */
    private static volatile C63010eb f127157c;

    /* renamed from: a */
    public C62971cq f127158a = C62942bv.emptyProtobufList();

    static {
        C49177k kVar = new C49177k();
        f127156b = kVar;
        C62942bv.registerDefaultInstance(C49177k.class, kVar);
    }

    private C49177k() {
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
                return newMessageInfo(f127156b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C49177k();
            case 4:
                return new C49176j();
            case 5:
                return f127156b;
            case 6:
                C63010eb ebVar = f127157c;
                if (ebVar == null) {
                    synchronized (C49177k.class) {
                        ebVar = f127157c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127156b);
                            f127157c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
