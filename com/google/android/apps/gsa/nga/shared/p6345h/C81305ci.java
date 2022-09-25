package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ci */
/* compiled from: PG */
public final class C81305ci extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C81305ci f222556g;

    /* renamed from: h */
    private static volatile C63010eb f222557h;

    /* renamed from: a */
    public int f222558a;

    /* renamed from: b */
    public boolean f222559b;

    /* renamed from: c */
    public boolean f222560c;

    /* renamed from: d */
    public boolean f222561d;

    /* renamed from: e */
    public boolean f222562e;

    /* renamed from: f */
    public boolean f222563f;

    static {
        C81305ci ciVar = new C81305ci();
        f222556g = ciVar;
        C62942bv.registerDefaultInstance(C81305ci.class, ciVar);
    }

    private C81305ci() {
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
                return newMessageInfo(f222556g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C81305ci();
            case 4:
                return new C81304ch();
            case 5:
                return f222556g;
            case 6:
                C63010eb ebVar = f222557h;
                if (ebVar == null) {
                    synchronized (C81305ci.class) {
                        ebVar = f222557h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222556g);
                            f222557h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
