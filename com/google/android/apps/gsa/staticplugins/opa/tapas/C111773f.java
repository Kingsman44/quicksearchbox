package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.f */
/* compiled from: PG */
public final class C111773f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C111773f f310673c;

    /* renamed from: e */
    private static volatile C63010eb f310674e;

    /* renamed from: a */
    public String f310675a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f310676b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f310677d;

    static {
        C111773f fVar = new C111773f();
        f310673c = fVar;
        C62942bv.registerDefaultInstance(C111773f.class, fVar);
    }

    private C111773f() {
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
                return newMessageInfo(f310673c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C111773f();
            case 4:
                return new C111763e();
            case 5:
                return f310673c;
            case 6:
                C63010eb ebVar = f310674e;
                if (ebVar == null) {
                    synchronized (C111773f.class) {
                        ebVar = f310674e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f310673c);
                            f310674e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
