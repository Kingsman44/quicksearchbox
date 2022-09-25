package com.google.research.p5181a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.research.a.aa */
/* compiled from: PG */
public final class C66296aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66296aa f180291a;

    /* renamed from: d */
    private static volatile C63010eb f180292d;

    /* renamed from: b */
    private int f180293b;

    /* renamed from: c */
    private C63037fb f180294c;

    static {
        C66296aa aaVar = new C66296aa();
        f180291a = aaVar;
        C62942bv.registerDefaultInstance(C66296aa.class, aaVar);
    }

    private C66296aa() {
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
                return newMessageInfo(f180291a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C66296aa();
            case 4:
                return new C66397z();
            case 5:
                return f180291a;
            case 6:
                C63010eb ebVar = f180292d;
                if (ebVar == null) {
                    synchronized (C66296aa.class) {
                        ebVar = f180292d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180291a);
                            f180292d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
