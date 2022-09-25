package com.google.p4283bv.p4287b.p4288a.p4289a.p4301f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.f.d */
/* compiled from: PG */
public final class C56688d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56688d f151310d;

    /* renamed from: e */
    private static volatile C63010eb f151311e;

    /* renamed from: a */
    public int f151312a;

    /* renamed from: b */
    public String f151313b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f151314c;

    static {
        C56688d dVar = new C56688d();
        f151310d = dVar;
        C62942bv.registerDefaultInstance(C56688d.class, dVar);
    }

    private C56688d() {
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
                return newMessageInfo(f151310d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56688d();
            case 4:
                return new C56687c();
            case 5:
                return f151310d;
            case 6:
                C63010eb ebVar = f151311e;
                if (ebVar == null) {
                    synchronized (C56688d.class) {
                        ebVar = f151311e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151310d);
                            f151311e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
