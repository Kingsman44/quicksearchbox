package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.w */
/* compiled from: PG */
public final class C66443w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66443w f180655d;

    /* renamed from: e */
    private static volatile C63010eb f180656e;

    /* renamed from: a */
    public int f180657a;

    /* renamed from: b */
    public String f180658b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f180659c;

    static {
        C66443w wVar = new C66443w();
        f180655d = wVar;
        C62942bv.registerDefaultInstance(C66443w.class, wVar);
    }

    private C66443w() {
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
                return newMessageInfo(f180655d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66443w();
            case 4:
                return new C66442v();
            case 5:
                return f180655d;
            case 6:
                C63010eb ebVar = f180656e;
                if (ebVar == null) {
                    synchronized (C66443w.class) {
                        ebVar = f180656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180655d);
                            f180656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
