package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.at */
/* compiled from: PG */
public final class C83631at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83631at f227986c;

    /* renamed from: e */
    private static volatile C63010eb f227987e;

    /* renamed from: a */
    public int f227988a;

    /* renamed from: b */
    public C51986gl f227989b;

    /* renamed from: d */
    private byte f227990d = 2;

    static {
        C83631at atVar = new C83631at();
        f227986c = atVar;
        C62942bv.registerDefaultInstance(C83631at.class, atVar);
    }

    private C83631at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f227990d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f227990d = b;
                return null;
            case 2:
                return newMessageInfo(f227986c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83631at();
            case 4:
                return new C83630as();
            case 5:
                return f227986c;
            case 6:
                C63010eb ebVar = f227987e;
                if (ebVar == null) {
                    synchronized (C83631at.class) {
                        ebVar = f227987e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227986c);
                            f227987e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
