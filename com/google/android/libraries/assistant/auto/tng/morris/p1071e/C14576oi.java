package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oi */
/* compiled from: PG */
public final class C14576oi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14576oi f44070d;

    /* renamed from: e */
    private static volatile C63010eb f44071e;

    /* renamed from: a */
    public C14348fx f44072a;

    /* renamed from: b */
    public C14580om f44073b;

    /* renamed from: c */
    public boolean f44074c;

    static {
        C14576oi oiVar = new C14576oi();
        f44070d = oiVar;
        C62942bv.registerDefaultInstance(C14576oi.class, oiVar);
    }

    private C14576oi() {
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
                return newMessageInfo(f44070d, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\t\u0004\t\u0005\u0007", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C14576oi();
            case 4:
                return new C14575oh();
            case 5:
                return f44070d;
            case 6:
                C63010eb ebVar = f44071e;
                if (ebVar == null) {
                    synchronized (C14576oi.class) {
                        ebVar = f44071e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44070d);
                            f44071e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
