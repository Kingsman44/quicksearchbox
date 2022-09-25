package com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.c.b.b */
/* compiled from: PG */
public final class C80547b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80547b f221090g;

    /* renamed from: h */
    private static volatile C63010eb f221091h;

    /* renamed from: a */
    public int f221092a;

    /* renamed from: b */
    public C63088z f221093b = C63088z.f170246b;

    /* renamed from: c */
    public int f221094c;

    /* renamed from: d */
    public int f221095d;

    /* renamed from: e */
    public C83320io f221096e;

    /* renamed from: f */
    public C80549d f221097f;

    static {
        C80547b bVar = new C80547b();
        f221090g = bVar;
        C62942bv.registerDefaultInstance(C80547b.class, bVar);
    }

    private C80547b() {
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
                return newMessageInfo(f221090g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C80547b();
            case 4:
                return new C80546a();
            case 5:
                return f221090g;
            case 6:
                C63010eb ebVar = f221091h;
                if (ebVar == null) {
                    synchronized (C80547b.class) {
                        ebVar = f221091h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221090g);
                            f221091h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
