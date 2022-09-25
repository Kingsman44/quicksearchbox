package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.n */
/* compiled from: PG */
public final class C67153n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67153n f182543c;

    /* renamed from: d */
    private static volatile C63010eb f182544d;

    /* renamed from: a */
    public int f182545a;

    /* renamed from: b */
    public int f182546b;

    static {
        C67153n nVar = new C67153n();
        f182543c = nVar;
        C62942bv.registerDefaultInstance(C67153n.class, nVar);
    }

    private C67153n() {
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
                return newMessageInfo(f182543c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C67099l.f182419a});
            case 3:
                return new C67153n();
            case 4:
                return new C67126m();
            case 5:
                return f182543c;
            case 6:
                C63010eb ebVar = f182544d;
                if (ebVar == null) {
                    synchronized (C67153n.class) {
                        ebVar = f182544d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182543c);
                            f182544d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
