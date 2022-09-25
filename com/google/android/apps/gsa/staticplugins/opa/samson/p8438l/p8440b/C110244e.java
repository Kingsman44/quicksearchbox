package com.google.android.apps.gsa.staticplugins.opa.samson.p8438l.p8440b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.l.b.e */
/* compiled from: PG */
public final class C110244e extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C110244e f307207c;

    /* renamed from: e */
    private static volatile C63010eb f307208e;

    /* renamed from: a */
    public int f307209a;

    /* renamed from: b */
    public int f307210b;

    /* renamed from: d */
    private byte f307211d = 2;

    static {
        C110244e eVar = new C110244e();
        f307207c = eVar;
        C62942bv.registerDefaultInstance(C110244e.class, eVar);
    }

    private C110244e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f307211d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f307211d = b;
                return null;
            case 2:
                return newMessageInfo(f307207c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C110241b.f307206a});
            case 3:
                return new C110244e();
            case 4:
                return new C110243d();
            case 5:
                return f307207c;
            case 6:
                C63010eb ebVar = f307208e;
                if (ebVar == null) {
                    synchronized (C110244e.class) {
                        ebVar = f307208e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f307207c);
                            f307208e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
