package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.r */
/* compiled from: PG */
public final class C106290r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106290r f296555c;

    /* renamed from: d */
    private static volatile C63010eb f296556d;

    /* renamed from: a */
    public int f296557a;

    /* renamed from: b */
    public String f296558b = BuildConfig.FLAVOR;

    static {
        C106290r rVar = new C106290r();
        f296555c = rVar;
        C62942bv.registerDefaultInstance(C106290r.class, rVar);
    }

    private C106290r() {
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
                return newMessageInfo(f296555c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106290r();
            case 4:
                return new C106289q();
            case 5:
                return f296555c;
            case 6:
                C63010eb ebVar = f296556d;
                if (ebVar == null) {
                    synchronized (C106290r.class) {
                        ebVar = f296556d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296555c);
                            f296556d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
