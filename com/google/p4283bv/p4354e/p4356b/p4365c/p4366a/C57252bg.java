package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.bg */
/* compiled from: PG */
public final class C57252bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57252bg f152831d;

    /* renamed from: e */
    private static volatile C63010eb f152832e;

    /* renamed from: a */
    public int f152833a;

    /* renamed from: b */
    public int f152834b;

    /* renamed from: c */
    public int f152835c;

    static {
        C57252bg bgVar = new C57252bg();
        f152831d = bgVar;
        C62942bv.registerDefaultInstance(C57252bg.class, bgVar);
    }

    private C57252bg() {
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
                return newMessageInfo(f152831d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57252bg();
            case 4:
                return new C57251bf();
            case 5:
                return f152831d;
            case 6:
                C63010eb ebVar = f152832e;
                if (ebVar == null) {
                    synchronized (C57252bg.class) {
                        ebVar = f152832e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152831d);
                            f152832e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
