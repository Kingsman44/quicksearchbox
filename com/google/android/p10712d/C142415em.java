package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.em */
/* compiled from: PG */
public final class C142415em extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142415em f386437c;

    /* renamed from: d */
    private static volatile C63010eb f386438d;

    /* renamed from: a */
    public int f386439a;

    /* renamed from: b */
    public int f386440b;

    static {
        C142415em emVar = new C142415em();
        f386437c = emVar;
        C62942bv.registerDefaultInstance(C142415em.class, emVar);
    }

    private C142415em() {
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
                return newMessageInfo(f386437c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C142413ek.m231080b()});
            case 3:
                return new C142415em();
            case 4:
                return new C142414el();
            case 5:
                return f386437c;
            case 6:
                C63010eb ebVar = f386438d;
                if (ebVar == null) {
                    synchronized (C142415em.class) {
                        ebVar = f386438d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386437c);
                            f386438d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
