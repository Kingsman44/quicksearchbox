package com.google.assistant.p3745ab.p3750b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.b.b */
/* compiled from: PG */
public final class C48243b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48243b f124800a;

    /* renamed from: b */
    private static volatile C63010eb f124801b;

    static {
        C48243b bVar = new C48243b();
        f124800a = bVar;
        C62942bv.registerDefaultInstance(C48243b.class, bVar);
    }

    private C48243b() {
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
                return newMessageInfo(f124800a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48243b();
            case 4:
                return new C48242a();
            case 5:
                return f124800a;
            case 6:
                C63010eb ebVar = f124801b;
                if (ebVar == null) {
                    synchronized (C48243b.class) {
                        ebVar = f124801b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124800a);
                            f124801b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
