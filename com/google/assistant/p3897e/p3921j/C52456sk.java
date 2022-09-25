package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sk */
/* compiled from: PG */
public final class C52456sk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52456sk f137703e;

    /* renamed from: f */
    private static volatile C63010eb f137704f;

    /* renamed from: a */
    public int f137705a = 0;

    /* renamed from: b */
    public Object f137706b;

    /* renamed from: c */
    public int f137707c;

    /* renamed from: d */
    public C52455sj f137708d;

    static {
        C52456sk skVar = new C52456sk();
        f137703e = skVar;
        C62942bv.registerDefaultInstance(C52456sk.class, skVar);
    }

    private C52456sk() {
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
                return newMessageInfo(f137703e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȼ\u0000", new Object[]{"b", "a", C45240c.f118157a, "d"});
            case 3:
                return new C52456sk();
            case 4:
                return new C52453sh();
            case 5:
                return f137703e;
            case 6:
                C63010eb ebVar = f137704f;
                if (ebVar == null) {
                    synchronized (C52456sk.class) {
                        ebVar = f137704f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137703e);
                            f137704f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
