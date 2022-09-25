package com.google.assistant.p3745ab.p3758j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.j.b */
/* compiled from: PG */
public final class C48348b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48348b f125013a;

    /* renamed from: b */
    private static volatile C63010eb f125014b;

    static {
        C48348b bVar = new C48348b();
        f125013a = bVar;
        C62942bv.registerDefaultInstance(C48348b.class, bVar);
    }

    private C48348b() {
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
                return newMessageInfo(f125013a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48348b();
            case 4:
                return new C48347a();
            case 5:
                return f125013a;
            case 6:
                C63010eb ebVar = f125014b;
                if (ebVar == null) {
                    synchronized (C48348b.class) {
                        ebVar = f125014b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125013a);
                            f125014b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
