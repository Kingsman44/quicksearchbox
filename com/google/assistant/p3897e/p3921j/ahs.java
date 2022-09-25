package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahs */
/* compiled from: PG */
public final class ahs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahs f135117a;

    /* renamed from: b */
    private static volatile C63010eb f135118b;

    static {
        ahs ahs = new ahs();
        f135117a = ahs;
        C62942bv.registerDefaultInstance(ahs.class, ahs);
    }

    private ahs() {
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
                return newMessageInfo(f135117a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahs();
            case 4:
                return new ahr();
            case 5:
                return f135117a;
            case 6:
                C63010eb ebVar = f135118b;
                if (ebVar == null) {
                    synchronized (ahs.class) {
                        ebVar = f135118b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135117a);
                            f135118b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
