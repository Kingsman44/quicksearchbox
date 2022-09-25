package com.google.android.apps.search.googleapp.customtabs.p10156f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60494rz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.f.b */
/* compiled from: PG */
public final class C133771b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C133771b f364368e;

    /* renamed from: f */
    private static volatile C63010eb f364369f;

    /* renamed from: a */
    public int f364370a;

    /* renamed from: b */
    public int f364371b;

    /* renamed from: c */
    public long f364372c;

    /* renamed from: d */
    public long f364373d;

    static {
        C133771b bVar = new C133771b();
        f364368e = bVar;
        C62942bv.registerDefaultInstance(C133771b.class, bVar);
    }

    private C133771b() {
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
                return newMessageInfo(f364368e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C60494rz.m92599b(), C45240c.f118157a, "d"});
            case 3:
                return new C133771b();
            case 4:
                return new C133770a();
            case 5:
                return f364368e;
            case 6:
                C63010eb ebVar = f364369f;
                if (ebVar == null) {
                    synchronized (C133771b.class) {
                        ebVar = f364369f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364368e);
                            f364369f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
