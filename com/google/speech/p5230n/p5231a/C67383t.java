package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.t */
/* compiled from: PG */
public final class C67383t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67383t f183157a;

    /* renamed from: c */
    private static volatile C63010eb f183158c;

    /* renamed from: b */
    private byte f183159b = 2;

    static {
        C67383t tVar = new C67383t();
        f183157a = tVar;
        C62942bv.registerDefaultInstance(C67383t.class, tVar);
    }

    private C67383t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183159b);
            case 1:
                this.f183159b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f183157a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67383t();
            case 4:
                return new C67382s();
            case 5:
                return f183157a;
            case 6:
                C63010eb ebVar = f183158c;
                if (ebVar == null) {
                    synchronized (C67383t.class) {
                        ebVar = f183158c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183157a);
                            f183158c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
