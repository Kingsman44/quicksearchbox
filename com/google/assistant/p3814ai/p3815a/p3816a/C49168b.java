package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.b */
/* compiled from: PG */
public final class C49168b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49168b f127140b;

    /* renamed from: c */
    private static volatile C63010eb f127141c;

    /* renamed from: a */
    public C62971cq f127142a = C62942bv.emptyProtobufList();

    static {
        C49168b bVar = new C49168b();
        f127140b = bVar;
        C62942bv.registerDefaultInstance(C49168b.class, bVar);
    }

    private C49168b() {
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
                return newMessageInfo(f127140b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C49168b();
            case 4:
                return new C49167a();
            case 5:
                return f127140b;
            case 6:
                C63010eb ebVar = f127141c;
                if (ebVar == null) {
                    synchronized (C49168b.class) {
                        ebVar = f127141c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127140b);
                            f127141c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
