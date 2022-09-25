package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3897e.p3921j.C52274lr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.fx */
/* compiled from: PG */
public final class C51389fx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51389fx f133834c;

    /* renamed from: d */
    private static volatile C63010eb f133835d;

    /* renamed from: a */
    public int f133836a;

    /* renamed from: b */
    public int f133837b;

    static {
        C51389fx fxVar = new C51389fx();
        f133834c = fxVar;
        C62942bv.registerDefaultInstance(C51389fx.class, fxVar);
    }

    private C51389fx() {
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
                return newMessageInfo(f133834c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52274lr.f137222a});
            case 3:
                return new C51389fx();
            case 4:
                return new C51388fw();
            case 5:
                return f133834c;
            case 6:
                C63010eb ebVar = f133835d;
                if (ebVar == null) {
                    synchronized (C51389fx.class) {
                        ebVar = f133835d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133834c);
                            f133835d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
