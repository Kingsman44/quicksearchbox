package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.v */
/* compiled from: PG */
public final class C64153v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64153v f173448b;

    /* renamed from: d */
    private static volatile C63010eb f173449d;

    /* renamed from: a */
    public int f173450a;

    /* renamed from: c */
    private int f173451c;

    static {
        C64153v vVar = new C64153v();
        f173448b = vVar;
        C62942bv.registerDefaultInstance(C64153v.class, vVar);
    }

    private C64153v() {
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
                return newMessageInfo(f173448b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C64152u.f173447a});
            case 3:
                return new C64153v();
            case 4:
                return new C64151t();
            case 5:
                return f173448b;
            case 6:
                C63010eb ebVar = f173449d;
                if (ebVar == null) {
                    synchronized (C64153v.class) {
                        ebVar = f173449d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173448b);
                            f173449d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
