package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.shared.p7040g.C89768b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.tn */
/* compiled from: PG */
public final class C88218tn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88218tn f238450c;

    /* renamed from: e */
    private static volatile C63010eb f238451e;

    /* renamed from: a */
    public int f238452a;

    /* renamed from: b */
    public C89768b f238453b;

    /* renamed from: d */
    private byte f238454d = 2;

    static {
        C88218tn tnVar = new C88218tn();
        f238450c = tnVar;
        C62942bv.registerDefaultInstance(C88218tn.class, tnVar);
    }

    private C88218tn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238454d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238454d = b;
                return null;
            case 2:
                return newMessageInfo(f238450c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88218tn();
            case 4:
                return new C88217tm();
            case 5:
                return f238450c;
            case 6:
                C63010eb ebVar = f238451e;
                if (ebVar == null) {
                    synchronized (C88218tn.class) {
                        ebVar = f238451e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238450c);
                            f238451e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
