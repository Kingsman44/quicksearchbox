package com.google.assistant.p3781ad.p3789d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.ab */
/* compiled from: PG */
public final class C48568ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48568ab f125477a;

    /* renamed from: d */
    private static volatile C63010eb f125478d;

    /* renamed from: b */
    private int f125479b;

    /* renamed from: c */
    private C52081en f125480c;

    static {
        C48568ab abVar = new C48568ab();
        f125477a = abVar;
        C62942bv.registerDefaultInstance(C48568ab.class, abVar);
    }

    private C48568ab() {
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
                return newMessageInfo(f125477a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48568ab();
            case 4:
                return new C48567aa();
            case 5:
                return f125477a;
            case 6:
                C63010eb ebVar = f125478d;
                if (ebVar == null) {
                    synchronized (C48568ab.class) {
                        ebVar = f125478d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125477a);
                            f125478d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
