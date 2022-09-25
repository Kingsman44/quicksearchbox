package com.google.android.apps.search.googleapp.discover.p10184f;

import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.f.m */
/* compiled from: PG */
public final class C134262m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134262m f365745c;

    /* renamed from: d */
    private static volatile C63010eb f365746d;

    /* renamed from: a */
    public int f365747a;

    /* renamed from: b */
    public C134587e f365748b;

    static {
        C134262m mVar = new C134262m();
        f365745c = mVar;
        C62942bv.registerDefaultInstance(C134262m.class, mVar);
    }

    private C134262m() {
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
                return newMessageInfo(f365745c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134262m();
            case 4:
                return new C134261l();
            case 5:
                return f365745c;
            case 6:
                C63010eb ebVar = f365746d;
                if (ebVar == null) {
                    synchronized (C134262m.class) {
                        ebVar = f365746d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365745c);
                            f365746d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
