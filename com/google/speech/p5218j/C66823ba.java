package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ba */
/* compiled from: PG */
public final class C66823ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66823ba f181712a;

    /* renamed from: b */
    private static volatile C63010eb f181713b;

    static {
        C66823ba baVar = new C66823ba();
        f181712a = baVar;
        C62942bv.registerDefaultInstance(C66823ba.class, baVar);
    }

    private C66823ba() {
        emptyIntList();
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
                return newMessageInfo(f181712a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66823ba();
            case 4:
                return new C66785az();
            case 5:
                return f181712a;
            case 6:
                C63010eb ebVar = f181713b;
                if (ebVar == null) {
                    synchronized (C66823ba.class) {
                        ebVar = f181713b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181712a);
                            f181713b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
