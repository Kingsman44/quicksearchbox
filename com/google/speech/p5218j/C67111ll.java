package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ll */
/* compiled from: PG */
public final class C67111ll extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67111ll f182440c;

    /* renamed from: d */
    private static volatile C63010eb f182441d;

    /* renamed from: a */
    public int f182442a = 0;

    /* renamed from: b */
    public Object f182443b;

    static {
        C67111ll llVar = new C67111ll();
        f182440c = llVar;
        C62942bv.registerDefaultInstance(C67111ll.class, llVar);
    }

    private C67111ll() {
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
                return newMessageInfo(f182440c, "\u0001\n\u0001\u0000\u0001\f\n\u0000\u0000\u0000\u0001်\u0000\u0002်\u0000\u0003်\u0000\u0004ြ\u0000\u0007ြ\u0000\bြ\u0000\t်\u0000\nြ\u0000\u000b်\u0000\fြ\u0000", new Object[]{"b", "a", C66770ak.class, C67109lj.class, C66973gi.class, C66861cg.class, C67107lh.class});
            case 3:
                return new C67111ll();
            case 4:
                return new C67110lk();
            case 5:
                return f182440c;
            case 6:
                C63010eb ebVar = f182441d;
                if (ebVar == null) {
                    synchronized (C67111ll.class) {
                        ebVar = f182441d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182440c);
                            f182441d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
