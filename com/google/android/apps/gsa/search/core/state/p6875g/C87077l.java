package com.google.android.apps.gsa.search.core.state.p6875g;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.l */
/* compiled from: PG */
public final class C87077l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87077l f235287c;

    /* renamed from: d */
    public static final C62940bt f235288d;

    /* renamed from: e */
    private static volatile C63010eb f235289e;

    /* renamed from: a */
    public int f235290a;

    /* renamed from: b */
    public boolean f235291b;

    static {
        C87077l lVar = new C87077l();
        f235287c = lVar;
        C62942bv.registerDefaultInstance(C87077l.class, lVar);
        f235288d = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, lVar, lVar, (C62958ce) null, 206022552, C63066gd.MESSAGE, C87077l.class);
    }

    private C87077l() {
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
                return newMessageInfo(f235287c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87077l();
            case 4:
                return new C87076k();
            case 5:
                return f235287c;
            case 6:
                C63010eb ebVar = f235289e;
                if (ebVar == null) {
                    synchronized (C87077l.class) {
                        ebVar = f235289e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235287c);
                            f235289e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
