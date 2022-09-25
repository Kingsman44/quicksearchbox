package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.bw */
/* compiled from: PG */
public final class C66597bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66597bw f181154d;

    /* renamed from: e */
    private static volatile C63010eb f181155e;

    /* renamed from: a */
    public int f181156a;

    /* renamed from: b */
    public String f181157b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f181158c;

    static {
        C66597bw bwVar = new C66597bw();
        f181154d = bwVar;
        C62942bv.registerDefaultInstance(C66597bw.class, bwVar);
    }

    private C66597bw() {
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
                return newMessageInfo(f181154d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66597bw();
            case 4:
                return new C66596bv();
            case 5:
                return f181154d;
            case 6:
                C63010eb ebVar = f181155e;
                if (ebVar == null) {
                    synchronized (C66597bw.class) {
                        ebVar = f181155e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181154d);
                            f181155e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
