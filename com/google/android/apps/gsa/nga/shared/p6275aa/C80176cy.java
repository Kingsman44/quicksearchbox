package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cy */
/* compiled from: PG */
public final class C80176cy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80176cy f219994d;

    /* renamed from: e */
    private static volatile C63010eb f219995e;

    /* renamed from: a */
    public int f219996a;

    /* renamed from: b */
    public boolean f219997b;

    /* renamed from: c */
    public int f219998c;

    static {
        C80176cy cyVar = new C80176cy();
        f219994d = cyVar;
        C62942bv.registerDefaultInstance(C80176cy.class, cyVar);
    }

    private C80176cy() {
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
                return newMessageInfo(f219994d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, e.b()});
            case 3:
                return new C80176cy();
            case 4:
                return new C80175cx();
            case 5:
                return f219994d;
            case 6:
                C63010eb ebVar = f219995e;
                if (ebVar == null) {
                    synchronized (C80176cy.class) {
                        ebVar = f219995e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219994d);
                            f219995e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
