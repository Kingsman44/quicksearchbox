package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.af */
/* compiled from: PG */
public final class C54082af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54082af f141903f;

    /* renamed from: g */
    private static volatile C63010eb f141904g;

    /* renamed from: a */
    public int f141905a;

    /* renamed from: b */
    public boolean f141906b;

    /* renamed from: c */
    public int f141907c = 5;

    /* renamed from: d */
    public boolean f141908d;

    /* renamed from: e */
    public int f141909e;

    static {
        C54082af afVar = new C54082af();
        f141903f = afVar;
        C62942bv.registerDefaultInstance(C54082af.class, afVar);
    }

    private C54082af() {
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
                return newMessageInfo(f141903f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0003\u0004ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C54081ae.f141902a});
            case 3:
                return new C54082af();
            case 4:
                return new C54080ad();
            case 5:
                return f141903f;
            case 6:
                C63010eb ebVar = f141904g;
                if (ebVar == null) {
                    synchronized (C54082af.class) {
                        ebVar = f141904g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141903f);
                            f141904g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
