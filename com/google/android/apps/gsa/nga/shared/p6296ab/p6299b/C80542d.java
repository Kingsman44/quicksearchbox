package com.google.android.apps.gsa.nga.shared.p6296ab.p6299b;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.b.d */
/* compiled from: PG */
public final class C80542d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80542d f221083f;

    /* renamed from: g */
    private static volatile C63010eb f221084g;

    /* renamed from: a */
    public int f221085a;

    /* renamed from: b */
    public C83320io f221086b;

    /* renamed from: c */
    public long f221087c;

    /* renamed from: d */
    public long f221088d;

    /* renamed from: e */
    public int f221089e;

    static {
        C80542d dVar = new C80542d();
        f221083f = dVar;
        C62942bv.registerDefaultInstance(C80542d.class, dVar);
    }

    private C80542d() {
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
                return newMessageInfo(f221083f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C80540b.f221082a});
            case 3:
                return new C80542d();
            case 4:
                return new C80539a();
            case 5:
                return f221083f;
            case 6:
                C63010eb ebVar = f221084g;
                if (ebVar == null) {
                    synchronized (C80542d.class) {
                        ebVar = f221084g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221083f);
                            f221084g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
