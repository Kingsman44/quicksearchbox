package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.e */
/* compiled from: PG */
public final class C56635e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56635e f151201b;

    /* renamed from: d */
    private static volatile C63010eb f151202d;

    /* renamed from: a */
    public int f151203a;

    /* renamed from: c */
    private int f151204c;

    static {
        C56635e eVar = new C56635e();
        f151201b = eVar;
        C62942bv.registerDefaultInstance(C56635e.class, eVar);
    }

    private C56635e() {
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
                return newMessageInfo(f151201b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56635e();
            case 4:
                return new C56634d();
            case 5:
                return f151201b;
            case 6:
                C63010eb ebVar = f151202d;
                if (ebVar == null) {
                    synchronized (C56635e.class) {
                        ebVar = f151202d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151201b);
                            f151202d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
