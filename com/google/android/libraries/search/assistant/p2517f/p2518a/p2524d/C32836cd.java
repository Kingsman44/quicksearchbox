package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cd */
/* compiled from: PG */
public final class C32836cd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C32836cd f88040e;

    /* renamed from: f */
    private static volatile C63010eb f88041f;

    /* renamed from: a */
    public int f88042a;

    /* renamed from: b */
    public C32796ar f88043b;

    /* renamed from: c */
    public boolean f88044c;

    /* renamed from: d */
    public boolean f88045d;

    static {
        C32836cd cdVar = new C32836cd();
        f88040e = cdVar;
        C62942bv.registerDefaultInstance(C32836cd.class, cdVar);
    }

    private C32836cd() {
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
                return newMessageInfo(f88040e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C32836cd();
            case 4:
                return new C32835cc();
            case 5:
                return f88040e;
            case 6:
                C63010eb ebVar = f88041f;
                if (ebVar == null) {
                    synchronized (C32836cd.class) {
                        ebVar = f88041f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88040e);
                            f88041f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
