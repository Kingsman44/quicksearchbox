package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ub */
/* compiled from: PG */
public final class C52501ub extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52501ub f137826c;

    /* renamed from: d */
    private static volatile C63010eb f137827d;

    /* renamed from: a */
    public int f137828a;

    /* renamed from: b */
    public C52500ua f137829b;

    static {
        C52501ub ubVar = new C52501ub();
        f137826c = ubVar;
        C62942bv.registerDefaultInstance(C52501ub.class, ubVar);
    }

    private C52501ub() {
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
                return newMessageInfo(f137826c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52501ub();
            case 4:
                return new C52497ty();
            case 5:
                return f137826c;
            case 6:
                C63010eb ebVar = f137827d;
                if (ebVar == null) {
                    synchronized (C52501ub.class) {
                        ebVar = f137827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137826c);
                            f137827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
