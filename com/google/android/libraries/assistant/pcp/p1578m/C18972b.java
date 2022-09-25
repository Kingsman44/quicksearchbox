package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.b */
/* compiled from: PG */
public final class C18972b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18972b f53301a;

    /* renamed from: b */
    private static volatile C63010eb f53302b;

    static {
        C18972b bVar = new C18972b();
        f53301a = bVar;
        C62942bv.registerDefaultInstance(C18972b.class, bVar);
    }

    private C18972b() {
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
                return newMessageInfo(f53301a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C18972b();
            case 4:
                return new C18959a();
            case 5:
                return f53301a;
            case 6:
                C63010eb ebVar = f53302b;
                if (ebVar == null) {
                    synchronized (C18972b.class) {
                        ebVar = f53302b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53301a);
                            f53302b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
