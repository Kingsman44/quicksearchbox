package com.google.android.apps.gsa.smartspace;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.smartspace.y */
/* compiled from: PG */
public final class C92130y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C92130y f256859c;

    /* renamed from: e */
    private static volatile C63010eb f256860e;

    /* renamed from: a */
    public int f256861a;

    /* renamed from: b */
    public int f256862b;

    /* renamed from: d */
    private int f256863d;

    static {
        C92130y yVar = new C92130y();
        f256859c = yVar;
        C62942bv.registerDefaultInstance(C92130y.class, yVar);
    }

    private C92130y() {
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
                return newMessageInfo(f256859c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C92115k.f256823a, "b", C92128w.f256858a});
            case 3:
                return new C92130y();
            case 4:
                return new C92127v();
            case 5:
                return f256859c;
            case 6:
                C63010eb ebVar = f256860e;
                if (ebVar == null) {
                    synchronized (C92130y.class) {
                        ebVar = f256860e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256859c);
                            f256860e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
