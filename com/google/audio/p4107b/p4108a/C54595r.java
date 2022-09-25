package com.google.audio.p4107b.p4108a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.r */
/* compiled from: PG */
public final class C54595r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54595r f143331e;

    /* renamed from: f */
    private static volatile C63010eb f143332f;

    /* renamed from: a */
    public int f143333a;

    /* renamed from: b */
    public int f143334b = 5;

    /* renamed from: c */
    public int f143335c;

    /* renamed from: d */
    public String f143336d = BuildConfig.FLAVOR;

    static {
        C54595r rVar = new C54595r();
        f143331e = rVar;
        C62942bv.registerDefaultInstance(C54595r.class, rVar);
    }

    private C54595r() {
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
                return newMessageInfo(f143331e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C54592o.f143329a, C45240c.f118157a, C54593p.f143330a, "d"});
            case 3:
                return new C54595r();
            case 4:
                return new C54594q();
            case 5:
                return f143331e;
            case 6:
                C63010eb ebVar = f143332f;
                if (ebVar == null) {
                    synchronized (C54595r.class) {
                        ebVar = f143332f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143331e);
                            f143332f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
