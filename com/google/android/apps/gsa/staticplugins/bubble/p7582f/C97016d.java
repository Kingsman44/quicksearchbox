package com.google.android.apps.gsa.staticplugins.bubble.p7582f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.d */
/* compiled from: PG */
public final class C97016d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C97016d f271129d;

    /* renamed from: f */
    private static volatile C63010eb f271130f;

    /* renamed from: a */
    public boolean f271131a;

    /* renamed from: b */
    public String f271132b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f271133c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f271134e;

    static {
        C97016d dVar = new C97016d();
        f271129d = dVar;
        C62942bv.registerDefaultInstance(C97016d.class, dVar);
    }

    private C97016d() {
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
                return newMessageInfo(f271129d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C97016d();
            case 4:
                return new C96995c();
            case 5:
                return f271129d;
            case 6:
                C63010eb ebVar = f271130f;
                if (ebVar == null) {
                    synchronized (C97016d.class) {
                        ebVar = f271130f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271129d);
                            f271130f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
