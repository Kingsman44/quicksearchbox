package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cp */
/* compiled from: PG */
public final class C66870cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66870cp f181804c;

    /* renamed from: e */
    private static volatile C63010eb f181805e;

    /* renamed from: a */
    public C62971cq f181806a = emptyProtobufList();

    /* renamed from: b */
    public int f181807b;

    /* renamed from: d */
    private int f181808d;

    static {
        C66870cp cpVar = new C66870cp();
        f181804c = cpVar;
        C62942bv.registerDefaultInstance(C66870cp.class, cpVar);
    }

    private C66870cp() {
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
                return newMessageInfo(f181804c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", C66865ck.class, "b", C66856cb.f181779a});
            case 3:
                return new C66870cp();
            case 4:
                return new C66869co();
            case 5:
                return f181804c;
            case 6:
                C63010eb ebVar = f181805e;
                if (ebVar == null) {
                    synchronized (C66870cp.class) {
                        ebVar = f181805e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181804c);
                            f181805e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
