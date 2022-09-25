package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.af */
/* compiled from: PG */
public final class C81241af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C81241af f222410f;

    /* renamed from: g */
    private static volatile C63010eb f222411g;

    /* renamed from: a */
    public int f222412a;

    /* renamed from: b */
    public C81272bc f222413b;

    /* renamed from: c */
    public C81245aj f222414c;

    /* renamed from: d */
    public C81270ba f222415d;

    /* renamed from: e */
    public C81326v f222416e;

    static {
        C81241af afVar = new C81241af();
        f222410f = afVar;
        C62942bv.registerDefaultInstance(C81241af.class, afVar);
    }

    private C81241af() {
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
                return newMessageInfo(f222410f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C81241af();
            case 4:
                return new C81240ae();
            case 5:
                return f222410f;
            case 6:
                C63010eb ebVar = f222411g;
                if (ebVar == null) {
                    synchronized (C81241af.class) {
                        ebVar = f222411g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222410f);
                            f222411g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
