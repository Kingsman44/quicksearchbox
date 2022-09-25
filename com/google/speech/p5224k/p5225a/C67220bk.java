package com.google.speech.p5224k.p5225a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66548ae;

/* renamed from: com.google.speech.k.a.bk */
/* compiled from: PG */
public final class C67220bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67220bk f182688d;

    /* renamed from: e */
    private static volatile C63010eb f182689e;

    /* renamed from: a */
    public int f182690a;

    /* renamed from: b */
    public C66548ae f182691b;

    /* renamed from: c */
    public int f182692c;

    static {
        C67220bk bkVar = new C67220bk();
        f182688d = bkVar;
        C62942bv.registerDefaultInstance(C67220bk.class, bkVar);
    }

    private C67220bk() {
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
                return newMessageInfo(f182688d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C67219bj.f182687a});
            case 3:
                return new C67220bk();
            case 4:
                return new C67218bi();
            case 5:
                return f182688d;
            case 6:
                C63010eb ebVar = f182689e;
                if (ebVar == null) {
                    synchronized (C67220bk.class) {
                        ebVar = f182689e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182688d);
                            f182689e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
