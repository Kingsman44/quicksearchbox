package com.google.android.libraries.mdi.p2213d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.j */
/* compiled from: PG */
public final class C28689j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28689j f77956d;

    /* renamed from: e */
    private static volatile C63010eb f77957e;

    /* renamed from: a */
    public int f77958a;

    /* renamed from: b */
    public boolean f77959b;

    /* renamed from: c */
    public boolean f77960c;

    static {
        C28689j jVar = new C28689j();
        f77956d = jVar;
        C62942bv.registerDefaultInstance(C28689j.class, jVar);
    }

    private C28689j() {
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
                return newMessageInfo(f77956d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C28689j();
            case 4:
                return new C28688i();
            case 5:
                return f77956d;
            case 6:
                C63010eb ebVar = f77957e;
                if (ebVar == null) {
                    synchronized (C28689j.class) {
                        ebVar = f77957e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77956d);
                            f77957e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
