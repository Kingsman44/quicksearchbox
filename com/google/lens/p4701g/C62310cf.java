package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19648b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cf */
/* compiled from: PG */
public final class C62310cf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62310cf f168209d;

    /* renamed from: e */
    private static volatile C63010eb f168210e;

    /* renamed from: a */
    public int f168211a;

    /* renamed from: b */
    public C19648b f168212b;

    /* renamed from: c */
    public C19651b f168213c;

    static {
        C62310cf cfVar = new C62310cf();
        f168209d = cfVar;
        C62942bv.registerDefaultInstance(C62310cf.class, cfVar);
    }

    private C62310cf() {
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
                return newMessageInfo(f168209d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62310cf();
            case 4:
                return new C62309ce();
            case 5:
                return f168209d;
            case 6:
                C63010eb ebVar = f168210e;
                if (ebVar == null) {
                    synchronized (C62310cf.class) {
                        ebVar = f168210e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168209d);
                            f168210e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
