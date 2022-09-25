package com.google.assistant.p3745ab.p3757i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.i.b */
/* compiled from: PG */
public final class C48345b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48345b f125008a;

    /* renamed from: b */
    private static volatile C63010eb f125009b;

    static {
        C48345b bVar = new C48345b();
        f125008a = bVar;
        C62942bv.registerDefaultInstance(C48345b.class, bVar);
    }

    private C48345b() {
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
                return newMessageInfo(f125008a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48345b();
            case 4:
                return new C48344a();
            case 5:
                return f125008a;
            case 6:
                C63010eb ebVar = f125009b;
                if (ebVar == null) {
                    synchronized (C48345b.class) {
                        ebVar = f125009b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125008a);
                            f125009b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
