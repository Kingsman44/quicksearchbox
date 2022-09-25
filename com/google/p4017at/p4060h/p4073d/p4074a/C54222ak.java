package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.ak */
/* compiled from: PG */
public final class C54222ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54222ak f142319a;

    /* renamed from: b */
    private static volatile C63010eb f142320b;

    static {
        C54222ak akVar = new C54222ak();
        f142319a = akVar;
        C62942bv.registerDefaultInstance(C54222ak.class, akVar);
    }

    private C54222ak() {
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
                return newMessageInfo(f142319a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54222ak();
            case 4:
                return new C54221aj();
            case 5:
                return f142319a;
            case 6:
                C63010eb ebVar = f142320b;
                if (ebVar == null) {
                    synchronized (C54222ak.class) {
                        ebVar = f142320b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142319a);
                            f142320b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
