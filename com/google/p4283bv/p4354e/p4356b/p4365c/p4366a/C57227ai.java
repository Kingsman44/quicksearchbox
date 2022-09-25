package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ai */
/* compiled from: PG */
public final class C57227ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57227ai f152768e;

    /* renamed from: f */
    private static volatile C63010eb f152769f;

    /* renamed from: a */
    public int f152770a;

    /* renamed from: b */
    public int f152771b;

    /* renamed from: c */
    public long f152772c;

    /* renamed from: d */
    public long f152773d;

    static {
        C57227ai aiVar = new C57227ai();
        f152768e = aiVar;
        C62942bv.registerDefaultInstance(C57227ai.class, aiVar);
    }

    private C57227ai() {
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
                return newMessageInfo(f152768e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57227ai();
            case 4:
                return new C57226ah();
            case 5:
                return f152768e;
            case 6:
                C63010eb ebVar = f152769f;
                if (ebVar == null) {
                    synchronized (C57227ai.class) {
                        ebVar = f152769f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152768e);
                            f152769f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
