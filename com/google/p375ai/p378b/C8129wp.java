package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wp */
/* compiled from: PG */
public final class C8129wp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8129wp f28563f;

    /* renamed from: g */
    private static volatile C63010eb f28564g;

    /* renamed from: a */
    public int f28565a;

    /* renamed from: b */
    public int f28566b;

    /* renamed from: c */
    public int f28567c;

    /* renamed from: d */
    public int f28568d;

    /* renamed from: e */
    public int f28569e;

    static {
        C8129wp wpVar = new C8129wp();
        f28563f = wpVar;
        C62942bv.registerDefaultInstance(C8129wp.class, wpVar);
    }

    private C8129wp() {
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
                return newMessageInfo(f28563f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8129wp();
            case 4:
                return new C8128wo();
            case 5:
                return f28563f;
            case 6:
                C63010eb ebVar = f28564g;
                if (ebVar == null) {
                    synchronized (C8129wp.class) {
                        ebVar = f28564g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28563f);
                            f28564g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
