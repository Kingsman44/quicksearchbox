package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.bf */
/* compiled from: PG */
public final class C66729bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66729bf f181511c;

    /* renamed from: d */
    private static volatile C63010eb f181512d;

    /* renamed from: a */
    public int f181513a;

    /* renamed from: b */
    public C66716at f181514b;

    static {
        C66729bf bfVar = new C66729bf();
        f181511c = bfVar;
        C62942bv.registerDefaultInstance(C66729bf.class, bfVar);
    }

    private C66729bf() {
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
                return newMessageInfo(f181511c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66729bf();
            case 4:
                return new C66728be();
            case 5:
                return f181511c;
            case 6:
                C63010eb ebVar = f181512d;
                if (ebVar == null) {
                    synchronized (C66729bf.class) {
                        ebVar = f181512d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181511c);
                            f181512d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
