package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.l */
/* compiled from: PG */
public final class C53727l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53727l f141047b;

    /* renamed from: d */
    private static volatile C63010eb f141048d;

    /* renamed from: a */
    public int f141049a;

    /* renamed from: c */
    private int f141050c;

    static {
        C53727l lVar = new C53727l();
        f141047b = lVar;
        C62942bv.registerDefaultInstance(C53727l.class, lVar);
    }

    private C53727l() {
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
                return newMessageInfo(f141047b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53727l();
            case 4:
                return new C53726k();
            case 5:
                return f141047b;
            case 6:
                C63010eb ebVar = f141048d;
                if (ebVar == null) {
                    synchronized (C53727l.class) {
                        ebVar = f141048d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141047b);
                            f141048d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
