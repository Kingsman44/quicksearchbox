package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.bd */
/* compiled from: PG */
public final class C49285bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49285bd f127385d;

    /* renamed from: e */
    private static volatile C63010eb f127386e;

    /* renamed from: a */
    public int f127387a;

    /* renamed from: b */
    public int f127388b;

    /* renamed from: c */
    public int f127389c;

    static {
        C49285bd bdVar = new C49285bd();
        f127385d = bdVar;
        C62942bv.registerDefaultInstance(C49285bd.class, bdVar);
    }

    private C49285bd() {
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
                return newMessageInfo(f127385d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C49282ba.f127378a, C45240c.f118157a, C49284bc.m85404b()});
            case 3:
                return new C49285bd();
            case 4:
                return new C49280az();
            case 5:
                return f127385d;
            case 6:
                C63010eb ebVar = f127386e;
                if (ebVar == null) {
                    synchronized (C49285bd.class) {
                        ebVar = f127386e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127385d);
                            f127386e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
