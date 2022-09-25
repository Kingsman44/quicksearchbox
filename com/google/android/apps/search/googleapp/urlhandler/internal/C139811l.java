package com.google.android.apps.search.googleapp.urlhandler.internal;

import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.l */
/* compiled from: PG */
public final class C139811l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C139811l f380009g;

    /* renamed from: h */
    private static volatile C63010eb f380010h;

    /* renamed from: a */
    public int f380011a;

    /* renamed from: b */
    public C139823j f380012b;

    /* renamed from: c */
    public long f380013c;

    /* renamed from: d */
    public boolean f380014d;

    /* renamed from: e */
    public boolean f380015e;

    /* renamed from: f */
    public long f380016f;

    static {
        C139811l lVar = new C139811l();
        f380009g = lVar;
        C62942bv.registerDefaultInstance(C139811l.class, lVar);
    }

    private C139811l() {
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
                return newMessageInfo(f380009g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C139811l();
            case 4:
                return new C139810k();
            case 5:
                return f380009g;
            case 6:
                C63010eb ebVar = f380010h;
                if (ebVar == null) {
                    synchronized (C139811l.class) {
                        ebVar = f380010h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380009g);
                            f380010h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
