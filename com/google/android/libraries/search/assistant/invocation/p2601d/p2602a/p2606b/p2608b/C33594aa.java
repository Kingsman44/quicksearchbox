package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.aa */
/* compiled from: PG */
public final class C33594aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33594aa f89811a;

    /* renamed from: b */
    private static volatile C63010eb f89812b;

    static {
        C33594aa aaVar = new C33594aa();
        f89811a = aaVar;
        C62942bv.registerDefaultInstance(C33594aa.class, aaVar);
    }

    private C33594aa() {
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
                return newMessageInfo(f89811a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33594aa();
            case 4:
                return new C33632z();
            case 5:
                return f89811a;
            case 6:
                C63010eb ebVar = f89812b;
                if (ebVar == null) {
                    synchronized (C33594aa.class) {
                        ebVar = f89812b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89811a);
                            f89812b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
