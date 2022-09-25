package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ac */
/* compiled from: PG */
public final class C32781ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C32781ac f87950e;

    /* renamed from: f */
    private static volatile C63010eb f87951f;

    /* renamed from: a */
    public int f87952a;

    /* renamed from: b */
    public C32796ar f87953b;

    /* renamed from: c */
    public boolean f87954c;

    /* renamed from: d */
    public boolean f87955d;

    static {
        C32781ac acVar = new C32781ac();
        f87950e = acVar;
        C62942bv.registerDefaultInstance(C32781ac.class, acVar);
    }

    private C32781ac() {
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
                return newMessageInfo(f87950e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C32781ac();
            case 4:
                return new C32780ab();
            case 5:
                return f87950e;
            case 6:
                C63010eb ebVar = f87951f;
                if (ebVar == null) {
                    synchronized (C32781ac.class) {
                        ebVar = f87951f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87950e);
                            f87951f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
