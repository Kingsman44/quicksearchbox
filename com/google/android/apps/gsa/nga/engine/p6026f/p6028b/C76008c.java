package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5220b.p5221a.C66808l;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.c */
/* compiled from: PG */
public final class C76008c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C76008c f210836d;

    /* renamed from: e */
    private static volatile C63010eb f210837e;

    /* renamed from: a */
    public int f210838a = 0;

    /* renamed from: b */
    public Object f210839b;

    /* renamed from: c */
    public int f210840c;

    static {
        C76008c cVar = new C76008c();
        f210836d = cVar;
        C62942bv.registerDefaultInstance(C76008c.class, cVar);
    }

    private C76008c() {
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
                return newMessageInfo(f210836d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C45240c.f118157a, C66808l.class, C76019n.class, C76021p.class});
            case 3:
                return new C76008c();
            case 4:
                return new C76006a();
            case 5:
                return f210836d;
            case 6:
                C63010eb ebVar = f210837e;
                if (ebVar == null) {
                    synchronized (C76008c.class) {
                        ebVar = f210837e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210836d);
                            f210837e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
