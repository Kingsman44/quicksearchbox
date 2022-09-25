package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.o */
/* compiled from: PG */
public final class C33998o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33998o f90626a;

    /* renamed from: b */
    private static volatile C63010eb f90627b;

    static {
        C33998o oVar = new C33998o();
        f90626a = oVar;
        C62942bv.registerDefaultInstance(C33998o.class, oVar);
    }

    private C33998o() {
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
                return newMessageInfo(f90626a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33998o();
            case 4:
                return new C33997n();
            case 5:
                return f90626a;
            case 6:
                C63010eb ebVar = f90627b;
                if (ebVar == null) {
                    synchronized (C33998o.class) {
                        ebVar = f90627b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90626a);
                            f90627b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
