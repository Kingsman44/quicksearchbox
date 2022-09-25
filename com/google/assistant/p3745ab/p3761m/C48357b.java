package com.google.assistant.p3745ab.p3761m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.m.b */
/* compiled from: PG */
public final class C48357b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48357b f125024a;

    /* renamed from: b */
    private static volatile C63010eb f125025b;

    static {
        C48357b bVar = new C48357b();
        f125024a = bVar;
        C62942bv.registerDefaultInstance(C48357b.class, bVar);
    }

    private C48357b() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f125024a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48357b();
            case 4:
                return new C48356a();
            case 5:
                return f125024a;
            case 6:
                C63010eb ebVar = f125025b;
                if (ebVar == null) {
                    synchronized (C48357b.class) {
                        ebVar = f125025b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125024a);
                            f125025b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
