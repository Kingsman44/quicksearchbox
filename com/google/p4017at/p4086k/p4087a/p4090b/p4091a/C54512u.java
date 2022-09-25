package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.u */
/* compiled from: PG */
public final class C54512u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54512u f143128d;

    /* renamed from: e */
    private static volatile C63010eb f143129e;

    /* renamed from: a */
    public boolean f143130a;

    /* renamed from: b */
    public int f143131b;

    /* renamed from: c */
    public int f143132c;

    static {
        C54512u uVar = new C54512u();
        f143128d = uVar;
        C62942bv.registerDefaultInstance(C54512u.class, uVar);
    }

    private C54512u() {
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
                return newMessageInfo(f143128d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54512u();
            case 4:
                return new C54511t();
            case 5:
                return f143128d;
            case 6:
                C63010eb ebVar = f143129e;
                if (ebVar == null) {
                    synchronized (C54512u.class) {
                        ebVar = f143129e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143128d);
                            f143129e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
