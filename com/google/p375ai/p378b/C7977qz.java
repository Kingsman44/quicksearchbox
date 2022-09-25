package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qz */
/* compiled from: PG */
public final class C7977qz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7977qz f28030b;

    /* renamed from: d */
    private static volatile C63010eb f28031d;

    /* renamed from: a */
    public C7980rb f28032a;

    /* renamed from: c */
    private int f28033c;

    static {
        C7977qz qzVar = new C7977qz();
        f28030b = qzVar;
        C62942bv.registerDefaultInstance(C7977qz.class, qzVar);
    }

    private C7977qz() {
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
                return newMessageInfo(f28030b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7977qz();
            case 4:
                return new C7976qy();
            case 5:
                return f28030b;
            case 6:
                C63010eb ebVar = f28031d;
                if (ebVar == null) {
                    synchronized (C7977qz.class) {
                        ebVar = f28031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28030b);
                            f28031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
