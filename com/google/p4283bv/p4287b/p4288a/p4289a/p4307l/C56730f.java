package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.f */
/* compiled from: PG */
public final class C56730f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56730f f151413b;

    /* renamed from: d */
    private static volatile C63010eb f151414d;

    /* renamed from: a */
    public int f151415a;

    /* renamed from: c */
    private int f151416c;

    static {
        C56730f fVar = new C56730f();
        f151413b = fVar;
        C62942bv.registerDefaultInstance(C56730f.class, fVar);
    }

    private C56730f() {
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
                return newMessageInfo(f151413b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C56738n.f151430a});
            case 3:
                return new C56730f();
            case 4:
                return new C56729e();
            case 5:
                return f151413b;
            case 6:
                C63010eb ebVar = f151414d;
                if (ebVar == null) {
                    synchronized (C56730f.class) {
                        ebVar = f151414d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151413b);
                            f151414d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
