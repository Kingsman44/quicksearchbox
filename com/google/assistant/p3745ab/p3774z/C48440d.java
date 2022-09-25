package com.google.assistant.p3745ab.p3774z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.z.d */
/* compiled from: PG */
public final class C48440d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48440d f125162a;

    /* renamed from: b */
    private static volatile C63010eb f125163b;

    static {
        C48440d dVar = new C48440d();
        f125162a = dVar;
        C62942bv.registerDefaultInstance(C48440d.class, dVar);
    }

    private C48440d() {
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
                return newMessageInfo(f125162a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48440d();
            case 4:
                return new C48439c();
            case 5:
                return f125162a;
            case 6:
                C63010eb ebVar = f125163b;
                if (ebVar == null) {
                    synchronized (C48440d.class) {
                        ebVar = f125163b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125162a);
                            f125163b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
