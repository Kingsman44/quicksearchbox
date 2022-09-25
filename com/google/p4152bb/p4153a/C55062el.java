package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.el */
/* compiled from: PG */
public final class C55062el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55062el f144853d;

    /* renamed from: e */
    private static volatile C63010eb f144854e;

    /* renamed from: a */
    public int f144855a;

    /* renamed from: b */
    public double f144856b;

    /* renamed from: c */
    public double f144857c;

    static {
        C55062el elVar = new C55062el();
        f144853d = elVar;
        C62942bv.registerDefaultInstance(C55062el.class, elVar);
    }

    private C55062el() {
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
                return newMessageInfo(f144853d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55062el();
            case 4:
                return new C55061ek();
            case 5:
                return f144853d;
            case 6:
                C63010eb ebVar = f144854e;
                if (ebVar == null) {
                    synchronized (C55062el.class) {
                        ebVar = f144854e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144853d);
                            f144854e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
