package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lh */
/* compiled from: PG */
public final class C67107lh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67107lh f182436a;

    /* renamed from: b */
    private static volatile C63010eb f182437b;

    static {
        C67107lh lhVar = new C67107lh();
        f182436a = lhVar;
        C62942bv.registerDefaultInstance(C67107lh.class, lhVar);
    }

    private C67107lh() {
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
                return newMessageInfo(f182436a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67107lh();
            case 4:
                return new C67106lg();
            case 5:
                return f182436a;
            case 6:
                C63010eb ebVar = f182437b;
                if (ebVar == null) {
                    synchronized (C67107lh.class) {
                        ebVar = f182437b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182436a);
                            f182437b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
