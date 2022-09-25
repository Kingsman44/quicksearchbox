package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ce */
/* compiled from: PG */
public final class C50987ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50987ce f132736c;

    /* renamed from: d */
    private static volatile C63010eb f132737d;

    /* renamed from: a */
    public int f132738a;

    /* renamed from: b */
    public int f132739b = 1;

    static {
        C50987ce ceVar = new C50987ce();
        f132736c = ceVar;
        C62942bv.registerDefaultInstance(C50987ce.class, ceVar);
    }

    private C50987ce() {
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
                return newMessageInfo(f132736c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C50985cc.f132735a});
            case 3:
                return new C50987ce();
            case 4:
                return new C50984cb();
            case 5:
                return f132736c;
            case 6:
                C63010eb ebVar = f132737d;
                if (ebVar == null) {
                    synchronized (C50987ce.class) {
                        ebVar = f132737d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132736c);
                            f132737d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
