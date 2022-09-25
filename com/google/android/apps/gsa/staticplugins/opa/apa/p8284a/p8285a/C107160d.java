package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.a.d */
/* compiled from: PG */
public final class C107160d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107160d f298284c;

    /* renamed from: e */
    private static volatile C63010eb f298285e;

    /* renamed from: a */
    public int f298286a;

    /* renamed from: b */
    public C107158b f298287b;

    /* renamed from: d */
    private byte f298288d = 2;

    static {
        C107160d dVar = new C107160d();
        f298284c = dVar;
        C62942bv.registerDefaultInstance(C107160d.class, dVar);
    }

    private C107160d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f298288d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f298288d = b;
                return null;
            case 2:
                return newMessageInfo(f298284c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107160d();
            case 4:
                return new C107159c();
            case 5:
                return f298284c;
            case 6:
                C63010eb ebVar = f298285e;
                if (ebVar == null) {
                    synchronized (C107160d.class) {
                        ebVar = f298285e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298284c);
                            f298285e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
