package com.google.android.apps.search.fedora.p10099e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.v */
/* compiled from: PG */
public final class C132814v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132814v f362359c;

    /* renamed from: d */
    private static volatile C63010eb f362360d;

    /* renamed from: a */
    public int f362361a;

    /* renamed from: b */
    public boolean f362362b;

    static {
        C132814v vVar = new C132814v();
        f362359c = vVar;
        C62942bv.registerDefaultInstance(C132814v.class, vVar);
    }

    private C132814v() {
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
                return newMessageInfo(f362359c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132814v();
            case 4:
                return new C132813u();
            case 5:
                return f362359c;
            case 6:
                C63010eb ebVar = f362360d;
                if (ebVar == null) {
                    synchronized (C132814v.class) {
                        ebVar = f362360d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362359c);
                            f362360d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
