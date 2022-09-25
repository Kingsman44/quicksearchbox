package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.t */
/* compiled from: PG */
public final class C105970t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105970t f295863c;

    /* renamed from: e */
    private static volatile C63010eb f295864e;

    /* renamed from: a */
    public int f295865a;

    /* renamed from: b */
    public C51953ff f295866b;

    /* renamed from: d */
    private byte f295867d = 2;

    static {
        C105970t tVar = new C105970t();
        f295863c = tVar;
        C62942bv.registerDefaultInstance(C105970t.class, tVar);
    }

    private C105970t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f295867d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f295867d = b;
                return null;
            case 2:
                return newMessageInfo(f295863c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105970t();
            case 4:
                return new C105969s();
            case 5:
                return f295863c;
            case 6:
                C63010eb ebVar = f295864e;
                if (ebVar == null) {
                    synchronized (C105970t.class) {
                        ebVar = f295864e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295863c);
                            f295864e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
