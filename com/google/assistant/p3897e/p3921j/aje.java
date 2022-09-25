package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aje */
/* compiled from: PG */
public final class aje extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aje f135214a;

    /* renamed from: b */
    private static volatile C63010eb f135215b;

    static {
        aje aje = new aje();
        f135214a = aje;
        C62942bv.registerDefaultInstance(aje.class, aje);
    }

    private aje() {
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
                return newMessageInfo(f135214a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aje();
            case 4:
                return new ajd();
            case 5:
                return f135214a;
            case 6:
                C63010eb ebVar = f135215b;
                if (ebVar == null) {
                    synchronized (aje.class) {
                        ebVar = f135215b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135214a);
                            f135215b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
