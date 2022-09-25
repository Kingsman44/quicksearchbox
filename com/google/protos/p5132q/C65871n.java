package com.google.protos.p5132q;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.n */
/* compiled from: PG */
public final class C65871n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65871n f179055f;

    /* renamed from: h */
    private static volatile C63010eb f179056h;

    /* renamed from: a */
    public int f179057a;

    /* renamed from: b */
    public int f179058b;

    /* renamed from: c */
    public int f179059c;

    /* renamed from: d */
    public int f179060d;

    /* renamed from: e */
    public int f179061e;

    /* renamed from: g */
    private int f179062g;

    static {
        C65871n nVar = new C65871n();
        f179055f = nVar;
        C62942bv.registerDefaultInstance(C65871n.class, nVar);
    }

    private C65871n() {
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
                return newMessageInfo(f179055f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65871n();
            case 4:
                return new C65870m();
            case 5:
                return f179055f;
            case 6:
                C63010eb ebVar = f179056h;
                if (ebVar == null) {
                    synchronized (C65871n.class) {
                        ebVar = f179056h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179055f);
                            f179056h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
