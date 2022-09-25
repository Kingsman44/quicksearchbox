package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52762dn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.ap */
/* compiled from: PG */
public final class C48808ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48808ap f126282a;

    /* renamed from: d */
    private static volatile C63010eb f126283d;

    /* renamed from: b */
    private int f126284b;

    /* renamed from: c */
    private C52762dn f126285c;

    static {
        C48808ap apVar = new C48808ap();
        f126282a = apVar;
        C62942bv.registerDefaultInstance(C48808ap.class, apVar);
    }

    private C48808ap() {
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
                return newMessageInfo(f126282a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48808ap();
            case 4:
                return new C48807ao();
            case 5:
                return f126282a;
            case 6:
                C63010eb ebVar = f126283d;
                if (ebVar == null) {
                    synchronized (C48808ap.class) {
                        ebVar = f126283d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126282a);
                            f126283d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
