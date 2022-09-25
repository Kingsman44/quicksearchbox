package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.d */
/* compiled from: PG */
public final class C53793d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53793d f141190g;

    /* renamed from: h */
    private static volatile C63010eb f141191h;

    /* renamed from: a */
    public int f141192a;

    /* renamed from: b */
    public boolean f141193b;

    /* renamed from: c */
    public C53799j f141194c;

    /* renamed from: d */
    public C53799j f141195d;

    /* renamed from: e */
    public C53799j f141196e;

    /* renamed from: f */
    public C53799j f141197f;

    static {
        C53793d dVar = new C53793d();
        f141190g = dVar;
        C62942bv.registerDefaultInstance(C53793d.class, dVar);
    }

    private C53793d() {
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
                return newMessageInfo(f141190g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C53793d();
            case 4:
                return new C53792c();
            case 5:
                return f141190g;
            case 6:
                C63010eb ebVar = f141191h;
                if (ebVar == null) {
                    synchronized (C53793d.class) {
                        ebVar = f141191h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141190g);
                            f141191h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
