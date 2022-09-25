package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.r */
/* compiled from: PG */
public final class C24463r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24463r f66960c;

    /* renamed from: d */
    private static volatile C63010eb f66961d;

    /* renamed from: a */
    public int f66962a;

    /* renamed from: b */
    public C24465t f66963b;

    static {
        C24463r rVar = new C24463r();
        f66960c = rVar;
        C62942bv.registerDefaultInstance(C24463r.class, rVar);
    }

    private C24463r() {
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
                return newMessageInfo(f66960c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C24463r();
            case 4:
                return new C24462q();
            case 5:
                return f66960c;
            case 6:
                C63010eb ebVar = f66961d;
                if (ebVar == null) {
                    synchronized (C24463r.class) {
                        ebVar = f66961d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66960c);
                            f66961d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
