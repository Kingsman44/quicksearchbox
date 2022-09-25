package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.p */
/* compiled from: PG */
public final class C24461p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24461p f66956c;

    /* renamed from: d */
    private static volatile C63010eb f66957d;

    /* renamed from: a */
    public int f66958a;

    /* renamed from: b */
    public C24465t f66959b;

    static {
        C24461p pVar = new C24461p();
        f66956c = pVar;
        C62942bv.registerDefaultInstance(C24461p.class, pVar);
    }

    private C24461p() {
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
                return newMessageInfo(f66956c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C24461p();
            case 4:
                return new C24460o();
            case 5:
                return f66956c;
            case 6:
                C63010eb ebVar = f66957d;
                if (ebVar == null) {
                    synchronized (C24461p.class) {
                        ebVar = f66957d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66956c);
                            f66957d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
