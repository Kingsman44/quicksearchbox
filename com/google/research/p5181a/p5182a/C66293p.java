package com.google.research.p5181a.p5182a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.a.p */
/* compiled from: PG */
public final class C66293p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66293p f180286d;

    /* renamed from: e */
    private static volatile C63010eb f180287e;

    /* renamed from: a */
    public int f180288a;

    /* renamed from: b */
    public int f180289b;

    /* renamed from: c */
    public String f180290c = BuildConfig.FLAVOR;

    static {
        C66293p pVar = new C66293p();
        f180286d = pVar;
        C62942bv.registerDefaultInstance(C66293p.class, pVar);
    }

    private C66293p() {
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
                return newMessageInfo(f180286d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66293p();
            case 4:
                return new C66292o();
            case 5:
                return f180286d;
            case 6:
                C63010eb ebVar = f180287e;
                if (ebVar == null) {
                    synchronized (C66293p.class) {
                        ebVar = f180287e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180286d);
                            f180287e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
