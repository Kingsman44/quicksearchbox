package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.g.a.a.r */
/* compiled from: PG */
public final class C54066r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54066r f141866d;

    /* renamed from: e */
    private static volatile C63010eb f141867e;

    /* renamed from: a */
    public C63088z f141868a = C63088z.f170246b;

    /* renamed from: b */
    public C53976ak f141869b;

    /* renamed from: c */
    public boolean f141870c;

    static {
        C54066r rVar = new C54066r();
        f141866d = rVar;
        C62942bv.registerDefaultInstance(C54066r.class, rVar);
    }

    private C54066r() {
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
                return newMessageInfo(f141866d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\t\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54066r();
            case 4:
                return new C54065q();
            case 5:
                return f141866d;
            case 6:
                C63010eb ebVar = f141867e;
                if (ebVar == null) {
                    synchronized (C54066r.class) {
                        ebVar = f141867e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141866d);
                            f141867e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
