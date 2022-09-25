package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahk */
/* compiled from: PG */
public final class ahk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahk f158765a;

    /* renamed from: b */
    private static volatile C63010eb f158766b;

    static {
        ahk ahk = new ahk();
        f158765a = ahk;
        C62942bv.registerDefaultInstance(ahk.class, ahk);
    }

    private ahk() {
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
                return newMessageInfo(f158765a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahk();
            case 4:
                return new ahj();
            case 5:
                return f158765a;
            case 6:
                C63010eb ebVar = f158766b;
                if (ebVar == null) {
                    synchronized (ahk.class) {
                        ebVar = f158766b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158765a);
                            f158766b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
