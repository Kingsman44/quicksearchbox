package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.l */
/* compiled from: PG */
public final class C66808l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66808l f181676a;

    /* renamed from: b */
    private static volatile C63010eb f181677b;

    static {
        C66808l lVar = new C66808l();
        f181676a = lVar;
        C62942bv.registerDefaultInstance(C66808l.class, lVar);
    }

    private C66808l() {
        emptyProtobufList();
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
                return newMessageInfo(f181676a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66808l();
            case 4:
                return new C66807k();
            case 5:
                return f181676a;
            case 6:
                C63010eb ebVar = f181677b;
                if (ebVar == null) {
                    synchronized (C66808l.class) {
                        ebVar = f181677b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181676a);
                            f181677b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
