package com.google.protos.p4985f.p5002e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.e.d */
/* compiled from: PG */
public final class C64835d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64835d f175689d;

    /* renamed from: e */
    private static volatile C63010eb f175690e;

    /* renamed from: a */
    public int f175691a;

    /* renamed from: b */
    public int f175692b;

    /* renamed from: c */
    public String f175693c = BuildConfig.FLAVOR;

    static {
        C64835d dVar = new C64835d();
        f175689d = dVar;
        C62942bv.registerDefaultInstance(C64835d.class, dVar);
    }

    private C64835d() {
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
                return newMessageInfo(f175689d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C64840i.m96469b(), C45240c.f118157a});
            case 3:
                return new C64835d();
            case 4:
                return new C64834c();
            case 5:
                return f175689d;
            case 6:
                C63010eb ebVar = f175690e;
                if (ebVar == null) {
                    synchronized (C64835d.class) {
                        ebVar = f175690e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175689d);
                            f175690e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
