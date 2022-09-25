package com.google.android.apps.search.fedora.p10099e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.c */
/* compiled from: PG */
public final class C132795c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132795c f362303c;

    /* renamed from: d */
    private static volatile C63010eb f362304d;

    /* renamed from: a */
    public int f362305a;

    /* renamed from: b */
    public boolean f362306b;

    static {
        C132795c cVar = new C132795c();
        f362303c = cVar;
        C62942bv.registerDefaultInstance(C132795c.class, cVar);
    }

    private C132795c() {
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
                return newMessageInfo(f362303c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132795c();
            case 4:
                return new C132794b();
            case 5:
                return f362303c;
            case 6:
                C63010eb ebVar = f362304d;
                if (ebVar == null) {
                    synchronized (C132795c.class) {
                        ebVar = f362304d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362303c);
                            f362304d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
