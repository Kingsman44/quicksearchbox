package com.google.protos.p4948ba;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ba.q */
/* compiled from: PG */
public final class C64387q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64387q f174626d;

    /* renamed from: f */
    private static volatile C63010eb f174627f;

    /* renamed from: a */
    public int f174628a = 0;

    /* renamed from: b */
    public Object f174629b;

    /* renamed from: c */
    public int f174630c;

    /* renamed from: e */
    private int f174631e;

    static {
        C64387q qVar = new C64387q();
        f174626d = qVar;
        C62942bv.registerDefaultInstance(C64387q.class, qVar);
    }

    private C64387q() {
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
                return newMessageInfo(f174626d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002့\u0000\u0003ျ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C64383m.m96398b()});
            case 3:
                return new C64387q();
            case 4:
                return new C64386p();
            case 5:
                return f174626d;
            case 6:
                C63010eb ebVar = f174627f;
                if (ebVar == null) {
                    synchronized (C64387q.class) {
                        ebVar = f174627f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174626d);
                            f174627f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
