package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ga */
/* compiled from: PG */
public final class C82939ga extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C82939ga f226284f;

    /* renamed from: g */
    private static volatile C63010eb f226285g;

    /* renamed from: a */
    public int f226286a;

    /* renamed from: b */
    public int f226287b;

    /* renamed from: c */
    public int f226288c;

    /* renamed from: d */
    public long f226289d;

    /* renamed from: e */
    public boolean f226290e;

    static {
        C82939ga gaVar = new C82939ga();
        f226284f = gaVar;
        C62942bv.registerDefaultInstance(C82939ga.class, gaVar);
    }

    private C82939ga() {
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
                return newMessageInfo(f226284f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C82936fy.m132432b(), C45240c.f118157a, C82941gc.m132434b(), "d", "e"});
            case 3:
                return new C82939ga();
            case 4:
                return new C82937fz();
            case 5:
                return f226284f;
            case 6:
                C63010eb ebVar = f226285g;
                if (ebVar == null) {
                    synchronized (C82939ga.class) {
                        ebVar = f226285g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226284f);
                            f226285g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
