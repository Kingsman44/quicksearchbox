package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.e */
/* compiled from: PG */
public final class C107556e extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C107556e f299210c;

    /* renamed from: e */
    private static volatile C63010eb f299211e;

    /* renamed from: a */
    public int f299212a;

    /* renamed from: b */
    public int f299213b;

    /* renamed from: d */
    private byte f299214d = 2;

    static {
        C107556e eVar = new C107556e();
        f299210c = eVar;
        C62942bv.registerDefaultInstance(C107556e.class, eVar);
    }

    private C107556e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299214d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299214d = b;
                return null;
            case 2:
                return newMessageInfo(f299210c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C107548b.f299197a});
            case 3:
                return new C107556e();
            case 4:
                return new C107555d();
            case 5:
                return f299210c;
            case 6:
                C63010eb ebVar = f299211e;
                if (ebVar == null) {
                    synchronized (C107556e.class) {
                        ebVar = f299211e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299210c);
                            f299211e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
