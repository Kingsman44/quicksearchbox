package com.google.assistant.p3775ac.p3777b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.b.b */
/* compiled from: PG */
public final class C48456b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48456b f125182a;

    /* renamed from: b */
    private static volatile C63010eb f125183b;

    static {
        C48456b bVar = new C48456b();
        f125182a = bVar;
        C62942bv.registerDefaultInstance(C48456b.class, bVar);
    }

    private C48456b() {
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
                return newMessageInfo(f125182a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48456b();
            case 4:
                return new C48455a();
            case 5:
                return f125182a;
            case 6:
                C63010eb ebVar = f125183b;
                if (ebVar == null) {
                    synchronized (C48456b.class) {
                        ebVar = f125183b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125182a);
                            f125183b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
