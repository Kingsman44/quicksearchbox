package com.google.common.p4552o.p4563i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cy */
/* compiled from: PG */
public final class C59943cy extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59943cy f162002g;

    /* renamed from: h */
    private static volatile C63010eb f162003h;

    /* renamed from: a */
    public int f162004a;

    /* renamed from: b */
    public int f162005b;

    /* renamed from: c */
    public int f162006c;

    /* renamed from: d */
    public int f162007d;

    /* renamed from: e */
    public C62995dn f162008e = C62995dn.f170057a;

    /* renamed from: f */
    public C62995dn f162009f = C62995dn.f170057a;

    static {
        C59943cy cyVar = new C59943cy();
        f162002g = cyVar;
        C62942bv.registerDefaultInstance(C59943cy.class, cyVar);
    }

    private C59943cy() {
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
                return newMessageInfo(f162002g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u00042\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C59942cx.f162001a, C10662f.f35572a, C59941cw.f162000a});
            case 3:
                return new C59943cy();
            case 4:
                return new C59940cv();
            case 5:
                return f162002g;
            case 6:
                C63010eb ebVar = f162003h;
                if (ebVar == null) {
                    synchronized (C59943cy.class) {
                        ebVar = f162003h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162002g);
                            f162003h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
