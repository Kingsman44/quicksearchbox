package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ge */
/* compiled from: PG */
public final class C66969ge extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66969ge f182035d;

    /* renamed from: e */
    private static volatile C63010eb f182036e;

    /* renamed from: a */
    public int f182037a;

    /* renamed from: b */
    public boolean f182038b;

    /* renamed from: c */
    public boolean f182039c = true;

    static {
        C66969ge geVar = new C66969ge();
        f182035d = geVar;
        C62942bv.registerDefaultInstance(C66969ge.class, geVar);
    }

    private C66969ge() {
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
                return newMessageInfo(f182035d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66969ge();
            case 4:
                return new C66968gd();
            case 5:
                return f182035d;
            case 6:
                C63010eb ebVar = f182036e;
                if (ebVar == null) {
                    synchronized (C66969ge.class) {
                        ebVar = f182036e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182035d);
                            f182036e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
