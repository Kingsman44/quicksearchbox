package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.r */
/* compiled from: PG */
public final class C52953r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52953r f138840b;

    /* renamed from: c */
    private static volatile C63010eb f138841c;

    /* renamed from: a */
    public C62971cq f138842a = emptyProtobufList();

    static {
        C52953r rVar = new C52953r();
        f138840b = rVar;
        C62942bv.registerDefaultInstance(C52953r.class, rVar);
    }

    private C52953r() {
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
                return newMessageInfo(f138840b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C52955t.class});
            case 3:
                return new C52953r();
            case 4:
                return new C52952q();
            case 5:
                return f138840b;
            case 6:
                C63010eb ebVar = f138841c;
                if (ebVar == null) {
                    synchronized (C52953r.class) {
                        ebVar = f138841c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138840b);
                            f138841c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
