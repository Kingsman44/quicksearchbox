package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.ay */
/* compiled from: PG */
public final class C44012ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C44012ay f114567c;

    /* renamed from: d */
    private static volatile C63010eb f114568d;

    /* renamed from: a */
    public int f114569a;

    /* renamed from: b */
    public int f114570b;

    static {
        C44012ay ayVar = new C44012ay();
        f114567c = ayVar;
        C62942bv.registerDefaultInstance(C44012ay.class, ayVar);
    }

    private C44012ay() {
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
                return newMessageInfo(f114567c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C44012ay();
            case 4:
                return new C44011ax();
            case 5:
                return f114567c;
            case 6:
                C63010eb ebVar = f114568d;
                if (ebVar == null) {
                    synchronized (C44012ay.class) {
                        ebVar = f114568d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f114567c);
                            f114568d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
