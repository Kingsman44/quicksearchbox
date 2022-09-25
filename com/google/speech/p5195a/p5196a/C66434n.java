package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.n */
/* compiled from: PG */
public final class C66434n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66434n f180635d;

    /* renamed from: e */
    private static volatile C63010eb f180636e;

    /* renamed from: a */
    public int f180637a;

    /* renamed from: b */
    public String f180638b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f180639c = BuildConfig.FLAVOR;

    static {
        C66434n nVar = new C66434n();
        f180635d = nVar;
        C62942bv.registerDefaultInstance(C66434n.class, nVar);
    }

    private C66434n() {
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
                return newMessageInfo(f180635d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66434n();
            case 4:
                return new C66433m();
            case 5:
                return f180635d;
            case 6:
                C63010eb ebVar = f180636e;
                if (ebVar == null) {
                    synchronized (C66434n.class) {
                        ebVar = f180636e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180635d);
                            f180636e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
