package com.google.speech.recognizer.p5233a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.l */
/* compiled from: PG */
public final class C67464l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67464l f183356e;

    /* renamed from: f */
    private static volatile C63010eb f183357f;

    /* renamed from: a */
    public int f183358a;

    /* renamed from: b */
    public int f183359b;

    /* renamed from: c */
    public long f183360c;

    /* renamed from: d */
    public long f183361d;

    static {
        C67464l lVar = new C67464l();
        f183356e = lVar;
        C62942bv.registerDefaultInstance(C67464l.class, lVar);
    }

    private C67464l() {
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
                return newMessageInfo(f183356e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C67463k.m97476b(), C45240c.f118157a, "d"});
            case 3:
                return new C67464l();
            case 4:
                return new C67461i();
            case 5:
                return f183356e;
            case 6:
                C63010eb ebVar = f183357f;
                if (ebVar == null) {
                    synchronized (C67464l.class) {
                        ebVar = f183357f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183356e);
                            f183357f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
