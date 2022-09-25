package com.google.assistant.p3745ab.p3749ac;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ac.b */
/* compiled from: PG */
public final class C48213b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48213b f124743a;

    /* renamed from: b */
    private static volatile C63010eb f124744b;

    static {
        C48213b bVar = new C48213b();
        f124743a = bVar;
        C62942bv.registerDefaultInstance(C48213b.class, bVar);
    }

    private C48213b() {
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
                return newMessageInfo(f124743a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48213b();
            case 4:
                return new C48212a();
            case 5:
                return f124743a;
            case 6:
                C63010eb ebVar = f124744b;
                if (ebVar == null) {
                    synchronized (C48213b.class) {
                        ebVar = f124744b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124743a);
                            f124744b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
