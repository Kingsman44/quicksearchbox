package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.p */
/* compiled from: PG */
public final class C7924p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7924p f27840c;

    /* renamed from: d */
    private static volatile C63010eb f27841d;

    /* renamed from: a */
    public int f27842a;

    /* renamed from: b */
    public long f27843b;

    static {
        C7924p pVar = new C7924p();
        f27840c = pVar;
        C62942bv.registerDefaultInstance(C7924p.class, pVar);
    }

    private C7924p() {
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
                return newMessageInfo(f27840c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7924p();
            case 4:
                return new C7897o();
            case 5:
                return f27840c;
            case 6:
                C63010eb ebVar = f27841d;
                if (ebVar == null) {
                    synchronized (C7924p.class) {
                        ebVar = f27841d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27840c);
                            f27841d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
