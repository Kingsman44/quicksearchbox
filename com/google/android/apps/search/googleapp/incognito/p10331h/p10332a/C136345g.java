package com.google.android.apps.search.googleapp.incognito.p10331h.p10332a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.incognito.h.a.g */
/* compiled from: PG */
public final class C136345g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136345g f371229c;

    /* renamed from: d */
    private static volatile C63010eb f371230d;

    /* renamed from: a */
    public int f371231a;

    /* renamed from: b */
    public boolean f371232b;

    static {
        C136345g gVar = new C136345g();
        f371229c = gVar;
        C62942bv.registerDefaultInstance(C136345g.class, gVar);
    }

    private C136345g() {
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
                return newMessageInfo(f371229c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136345g();
            case 4:
                return new C136344f();
            case 5:
                return f371229c;
            case 6:
                C63010eb ebVar = f371230d;
                if (ebVar == null) {
                    synchronized (C136345g.class) {
                        ebVar = f371230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371229c);
                            f371230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
