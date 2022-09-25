package com.google.android.gms.measurement.p10848a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.z */
/* compiled from: PG */
public final class C145177z extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C145177z f392404f;

    /* renamed from: g */
    private static volatile C63010eb f392405g;

    /* renamed from: a */
    public int f392406a;

    /* renamed from: b */
    public int f392407b;

    /* renamed from: c */
    public C145138ap f392408c;

    /* renamed from: d */
    public C145138ap f392409d;

    /* renamed from: e */
    public boolean f392410e;

    static {
        C145177z zVar = new C145177z();
        f392404f = zVar;
        C62942bv.registerDefaultInstance(C145177z.class, zVar);
    }

    private C145177z() {
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
                return newMessageInfo(f392404f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C145177z();
            case 4:
                return new C145176y();
            case 5:
                return f392404f;
            case 6:
                C63010eb ebVar = f392405g;
                if (ebVar == null) {
                    synchronized (C145177z.class) {
                        ebVar = f392405g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392404f);
                            f392405g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
