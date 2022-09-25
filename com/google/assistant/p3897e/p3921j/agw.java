package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agw */
/* compiled from: PG */
public final class agw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final agw f135082a;

    /* renamed from: b */
    private static volatile C63010eb f135083b;

    static {
        agw agw = new agw();
        f135082a = agw;
        C62942bv.registerDefaultInstance(agw.class, agw);
    }

    private agw() {
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
                return newMessageInfo(f135082a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new agw();
            case 4:
                return new agv();
            case 5:
                return f135082a;
            case 6:
                C63010eb ebVar = f135083b;
                if (ebVar == null) {
                    synchronized (agw.class) {
                        ebVar = f135083b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135082a);
                            f135083b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
