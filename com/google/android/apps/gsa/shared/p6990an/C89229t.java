package com.google.android.apps.gsa.shared.p6990an;

import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.an.t */
/* compiled from: PG */
public final class C89229t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C89229t f241959d;

    /* renamed from: f */
    private static volatile C63010eb f241960f;

    /* renamed from: a */
    public int f241961a;

    /* renamed from: b */
    public C41658m f241962b;

    /* renamed from: c */
    public C89227r f241963c;

    /* renamed from: e */
    private byte f241964e = 2;

    static {
        C89229t tVar = new C89229t();
        f241959d = tVar;
        C62942bv.registerDefaultInstance(C89229t.class, tVar);
    }

    private C89229t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f241964e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f241964e = b;
                return null;
            case 2:
                return newMessageInfo(f241959d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C89229t();
            case 4:
                return new C89228s();
            case 5:
                return f241959d;
            case 6:
                C63010eb ebVar = f241960f;
                if (ebVar == null) {
                    synchronized (C89229t.class) {
                        ebVar = f241960f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241959d);
                            f241960f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
