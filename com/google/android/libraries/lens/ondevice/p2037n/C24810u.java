package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.u */
/* compiled from: PG */
public final class C24810u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24810u f67817d;

    /* renamed from: e */
    private static volatile C63010eb f67818e;

    /* renamed from: a */
    public int f67819a;

    /* renamed from: b */
    public C24471z f67820b;

    /* renamed from: c */
    public boolean f67821c = true;

    static {
        C24810u uVar = new C24810u();
        f67817d = uVar;
        C62942bv.registerDefaultInstance(C24810u.class, uVar);
    }

    private C24810u() {
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
                return newMessageInfo(f67817d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C24810u();
            case 4:
                return new C24809t();
            case 5:
                return f67817d;
            case 6:
                C63010eb ebVar = f67818e;
                if (ebVar == null) {
                    synchronized (C24810u.class) {
                        ebVar = f67818e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67817d);
                            f67818e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
