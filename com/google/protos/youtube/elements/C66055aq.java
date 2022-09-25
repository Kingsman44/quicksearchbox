package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.aq */
/* compiled from: PG */
public final class C66055aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66055aq f179639c;

    /* renamed from: d */
    private static volatile C63010eb f179640d;

    /* renamed from: a */
    public int f179641a;

    /* renamed from: b */
    public C66224ek f179642b;

    static {
        C66055aq aqVar = new C66055aq();
        f179639c = aqVar;
        C62942bv.registerDefaultInstance(C66055aq.class, aqVar);
    }

    private C66055aq() {
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
                return newMessageInfo(f179639c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66055aq();
            case 4:
                return new C66054ap();
            case 5:
                return f179639c;
            case 6:
                C63010eb ebVar = f179640d;
                if (ebVar == null) {
                    synchronized (C66055aq.class) {
                        ebVar = f179640d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179639c);
                            f179640d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
