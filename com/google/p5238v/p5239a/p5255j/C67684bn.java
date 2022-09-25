package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.bn */
/* compiled from: PG */
public final class C67684bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67684bn f183665d;

    /* renamed from: e */
    private static volatile C63010eb f183666e;

    /* renamed from: a */
    public C67690bt f183667a;

    /* renamed from: b */
    public C67680bj f183668b;

    /* renamed from: c */
    public int f183669c;

    static {
        C67684bn bnVar = new C67684bn();
        f183665d = bnVar;
        C62942bv.registerDefaultInstance(C67684bn.class, bnVar);
    }

    private C67684bn() {
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
                return newMessageInfo(f183665d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67684bn();
            case 4:
                return new C67683bm();
            case 5:
                return f183665d;
            case 6:
                C63010eb ebVar = f183666e;
                if (ebVar == null) {
                    synchronized (C67684bn.class) {
                        ebVar = f183666e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183665d);
                            f183666e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
