package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5451f.p5452a.p5453a.p5454a.C69451p;

/* renamed from: com.google.android.apps.search.googleapp.p.ar */
/* compiled from: PG */
public final class C136851ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136851ar f372487f;

    /* renamed from: g */
    private static volatile C63010eb f372488g;

    /* renamed from: a */
    public int f372489a;

    /* renamed from: b */
    public int f372490b;

    /* renamed from: c */
    public int f372491c;

    /* renamed from: d */
    public int f372492d;

    /* renamed from: e */
    public int f372493e;

    static {
        C136851ar arVar = new C136851ar();
        f372487f = arVar;
        C62942bv.registerDefaultInstance(C136851ar.class, arVar);
    }

    private C136851ar() {
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
                return newMessageInfo(f372487f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C69451p.m100762b(), C45240c.f118157a, C69451p.m100762b(), "d", C69451p.m100762b(), "e", C69451p.m100762b()});
            case 3:
                return new C136851ar();
            case 4:
                return new C136850aq();
            case 5:
                return f372487f;
            case 6:
                C63010eb ebVar = f372488g;
                if (ebVar == null) {
                    synchronized (C136851ar.class) {
                        ebVar = f372488g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372487f);
                            f372488g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
