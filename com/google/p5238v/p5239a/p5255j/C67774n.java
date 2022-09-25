package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.n */
/* compiled from: PG */
public final class C67774n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67774n f183872c;

    /* renamed from: d */
    private static volatile C63010eb f183873d;

    /* renamed from: a */
    public C67776p f183874a;

    /* renamed from: b */
    public int f183875b;

    static {
        C67774n nVar = new C67774n();
        f183872c = nVar;
        C62942bv.registerDefaultInstance(C67774n.class, nVar);
    }

    private C67774n() {
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
                return newMessageInfo(f183872c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
            case 3:
                return new C67774n();
            case 4:
                return new C67773m();
            case 5:
                return f183872c;
            case 6:
                C63010eb ebVar = f183873d;
                if (ebVar == null) {
                    synchronized (C67774n.class) {
                        ebVar = f183873d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183872c);
                            f183873d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
