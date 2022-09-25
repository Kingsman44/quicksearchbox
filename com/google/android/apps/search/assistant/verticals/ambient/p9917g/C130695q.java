package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.q */
/* compiled from: PG */
public final class C130695q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C130695q f357866a;

    /* renamed from: b */
    private static volatile C63010eb f357867b;

    static {
        C130695q qVar = new C130695q();
        f357866a = qVar;
        C62942bv.registerDefaultInstance(C130695q.class, qVar);
    }

    private C130695q() {
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
                return newMessageInfo(f357866a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C130695q();
            case 4:
                return new C130694p();
            case 5:
                return f357866a;
            case 6:
                C63010eb ebVar = f357867b;
                if (ebVar == null) {
                    synchronized (C130695q.class) {
                        ebVar = f357867b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357866a);
                            f357867b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
