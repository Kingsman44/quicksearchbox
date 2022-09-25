package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.g */
/* compiled from: PG */
public final class C136166g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136166g f370833f;

    /* renamed from: g */
    private static volatile C63010eb f370834g;

    /* renamed from: a */
    public int f370835a;

    /* renamed from: b */
    public C62961ch f370836b = emptyIntList();

    /* renamed from: c */
    public C63042fg f370837c;

    /* renamed from: d */
    public float f370838d;

    /* renamed from: e */
    public float f370839e;

    static {
        C136166g gVar = new C136166g();
        f370833f = gVar;
        C62942bv.registerDefaultInstance(C136166g.class, gVar);
    }

    private C136166g() {
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
                return newMessageInfo(f370833f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u0016\u0003ဉ\u0000\u0004ခ\u0001\u0005ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C136166g();
            case 4:
                return new C136165f();
            case 5:
                return f370833f;
            case 6:
                C63010eb ebVar = f370834g;
                if (ebVar == null) {
                    synchronized (C136166g.class) {
                        ebVar = f370834g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370833f);
                            f370834g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
