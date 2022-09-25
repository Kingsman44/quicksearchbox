package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fx */
/* compiled from: PG */
public final class C37612fx extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C37612fx f99944d;

    /* renamed from: f */
    private static volatile C63010eb f99945f;

    /* renamed from: a */
    public int f99946a;

    /* renamed from: b */
    public int f99947b;

    /* renamed from: c */
    public int f99948c;

    /* renamed from: e */
    private byte f99949e = 2;

    static {
        C37612fx fxVar = new C37612fx();
        f99944d = fxVar;
        C62942bv.registerDefaultInstance(C37612fx.class, fxVar);
    }

    private C37612fx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99949e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99949e = b;
                return null;
            case 2:
                return newMessageInfo(f99944d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37612fx();
            case 4:
                return new C37611fw();
            case 5:
                return f99944d;
            case 6:
                C63010eb ebVar = f99945f;
                if (ebVar == null) {
                    synchronized (C37612fx.class) {
                        ebVar = f99945f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99944d);
                            f99945f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
