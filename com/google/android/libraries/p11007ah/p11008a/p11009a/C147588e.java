package com.google.android.libraries.p11007ah.p11008a.p11009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ah.a.a.e */
/* compiled from: PG */
public final class C147588e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147588e f398388c;

    /* renamed from: d */
    private static volatile C63010eb f398389d;

    /* renamed from: a */
    public int f398390a;

    /* renamed from: b */
    public boolean f398391b;

    static {
        C147588e eVar = new C147588e();
        f398388c = eVar;
        C62942bv.registerDefaultInstance(C147588e.class, eVar);
    }

    private C147588e() {
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
                return newMessageInfo(f398388c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C147588e();
            case 4:
                return new C147587d();
            case 5:
                return f398388c;
            case 6:
                C63010eb ebVar = f398389d;
                if (ebVar == null) {
                    synchronized (C147588e.class) {
                        ebVar = f398389d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398388c);
                            f398389d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
