package com.google.assistant.p3775ac.p3778c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.c.b */
/* compiled from: PG */
public final class C48458b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48458b f125184a;

    /* renamed from: b */
    private static volatile C63010eb f125185b;

    static {
        C48458b bVar = new C48458b();
        f125184a = bVar;
        C62942bv.registerDefaultInstance(C48458b.class, bVar);
    }

    private C48458b() {
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
                return newMessageInfo(f125184a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48458b();
            case 4:
                return new C48457a();
            case 5:
                return f125184a;
            case 6:
                C63010eb ebVar = f125185b;
                if (ebVar == null) {
                    synchronized (C48458b.class) {
                        ebVar = f125185b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125184a);
                            f125185b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
