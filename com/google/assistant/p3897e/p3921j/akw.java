package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.akw */
/* compiled from: PG */
public final class akw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final akw f135294a;

    /* renamed from: b */
    private static volatile C63010eb f135295b;

    static {
        akw akw = new akw();
        f135294a = akw;
        C62942bv.registerDefaultInstance(akw.class, akw);
    }

    private akw() {
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
                return newMessageInfo(f135294a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new akw();
            case 4:
                return new akv();
            case 5:
                return f135294a;
            case 6:
                C63010eb ebVar = f135295b;
                if (ebVar == null) {
                    synchronized (akw.class) {
                        ebVar = f135295b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135294a);
                            f135295b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
