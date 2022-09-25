package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.common.p4552o.air;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.onegoogle.c.b.x */
/* compiled from: PG */
public final class C30895x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C30895x f83301c;

    /* renamed from: d */
    private static volatile C63010eb f83302d;

    /* renamed from: a */
    public int f83303a;

    /* renamed from: b */
    public air f83304b;

    static {
        C30895x xVar = new C30895x();
        f83301c = xVar;
        C62942bv.registerDefaultInstance(C30895x.class, xVar);
    }

    private C30895x() {
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
                return newMessageInfo(f83301c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C30895x();
            case 4:
                return new C30894w();
            case 5:
                return f83301c;
            case 6:
                C63010eb ebVar = f83302d;
                if (ebVar == null) {
                    synchronized (C30895x.class) {
                        ebVar = f83302d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f83301c);
                            f83302d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
