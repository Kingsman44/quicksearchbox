package com.google.android.apps.search.googleapp.search.p10409e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.e.j */
/* compiled from: PG */
public final class C137421j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137421j f373789c;

    /* renamed from: d */
    private static volatile C63010eb f373790d;

    /* renamed from: a */
    public int f373791a;

    /* renamed from: b */
    public boolean f373792b;

    static {
        C137421j jVar = new C137421j();
        f373789c = jVar;
        C62942bv.registerDefaultInstance(C137421j.class, jVar);
    }

    private C137421j() {
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
                return newMessageInfo(f373789c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137421j();
            case 4:
                return new C137420i();
            case 5:
                return f373789c;
            case 6:
                C63010eb ebVar = f373790d;
                if (ebVar == null) {
                    synchronized (C137421j.class) {
                        ebVar = f373790d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373789c);
                            f373790d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
