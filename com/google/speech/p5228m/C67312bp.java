package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bp */
/* compiled from: PG */
public final class C67312bp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67312bp f182960e;

    /* renamed from: f */
    private static volatile C63010eb f182961f;

    /* renamed from: a */
    public int f182962a;

    /* renamed from: b */
    public boolean f182963b;

    /* renamed from: c */
    public int f182964c;

    /* renamed from: d */
    public int f182965d;

    static {
        C67312bp bpVar = new C67312bp();
        f182960e = bpVar;
        C62942bv.registerDefaultInstance(C67312bp.class, bpVar);
    }

    private C67312bp() {
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
                return newMessageInfo(f182960e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67312bp();
            case 4:
                return new C67311bo();
            case 5:
                return f182960e;
            case 6:
                C63010eb ebVar = f182961f;
                if (ebVar == null) {
                    synchronized (C67312bp.class) {
                        ebVar = f182961f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182960e);
                            f182961f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
