package com.google.assistant.p3817aj.p3818a.p3819a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aj.a.a.g */
/* compiled from: PG */
public final class C49195g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49195g f127206a;

    /* renamed from: b */
    private static volatile C63010eb f127207b;

    static {
        C49195g gVar = new C49195g();
        f127206a = gVar;
        C62942bv.registerDefaultInstance(C49195g.class, gVar);
    }

    private C49195g() {
        emptyProtobufList();
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
                return newMessageInfo(f127206a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49195g();
            case 4:
                return new C49194f();
            case 5:
                return f127206a;
            case 6:
                C63010eb ebVar = f127207b;
                if (ebVar == null) {
                    synchronized (C49195g.class) {
                        ebVar = f127207b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127206a);
                            f127207b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
