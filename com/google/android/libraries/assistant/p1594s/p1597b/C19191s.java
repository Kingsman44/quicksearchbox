package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.s */
/* compiled from: PG */
public final class C19191s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19191s f53741a;

    /* renamed from: b */
    private static volatile C63010eb f53742b;

    static {
        C19191s sVar = new C19191s();
        f53741a = sVar;
        C62942bv.registerDefaultInstance(C19191s.class, sVar);
    }

    private C19191s() {
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
                return newMessageInfo(f53741a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C19191s();
            case 4:
                return new C19190r();
            case 5:
                return f53741a;
            case 6:
                C63010eb ebVar = f53742b;
                if (ebVar == null) {
                    synchronized (C19191s.class) {
                        ebVar = f53742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53741a);
                            f53742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
