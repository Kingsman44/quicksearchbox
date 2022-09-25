package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.el */
/* compiled from: PG */
public final class C54440el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54440el f142961d;

    /* renamed from: e */
    private static volatile C63010eb f142962e;

    /* renamed from: a */
    public C54394ct f142963a;

    /* renamed from: b */
    public int f142964b;

    /* renamed from: c */
    public C63042fg f142965c;

    static {
        C54440el elVar = new C54440el();
        f142961d = elVar;
        C62942bv.registerDefaultInstance(C54440el.class, elVar);
    }

    private C54440el() {
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
                return newMessageInfo(f142961d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54440el();
            case 4:
                return new C54439ek();
            case 5:
                return f142961d;
            case 6:
                C63010eb ebVar = f142962e;
                if (ebVar == null) {
                    synchronized (C54440el.class) {
                        ebVar = f142962e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142961d);
                            f142962e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
