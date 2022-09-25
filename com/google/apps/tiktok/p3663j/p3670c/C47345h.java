package com.google.apps.tiktok.p3663j.p3670c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.j.c.h */
/* compiled from: PG */
public final class C47345h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C47345h f123059d;

    /* renamed from: e */
    private static volatile C63010eb f123060e;

    /* renamed from: a */
    public int f123061a;

    /* renamed from: b */
    public C47343f f123062b;

    /* renamed from: c */
    public int f123063c;

    static {
        C47345h hVar = new C47345h();
        f123059d = hVar;
        C62942bv.registerDefaultInstance(C47345h.class, hVar);
    }

    private C47345h() {
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
                return newMessageInfo(f123059d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C47345h();
            case 4:
                return new C47344g();
            case 5:
                return f123059d;
            case 6:
                C63010eb ebVar = f123060e;
                if (ebVar == null) {
                    synchronized (C47345h.class) {
                        ebVar = f123060e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123059d);
                            f123060e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
