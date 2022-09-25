package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ael */
/* compiled from: PG */
public final class ael extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ael f129106b;

    /* renamed from: d */
    private static volatile C63010eb f129107d;

    /* renamed from: a */
    public int f129108a = 1;

    /* renamed from: c */
    private int f129109c;

    static {
        ael ael = new ael();
        f129106b = ael;
        C62942bv.registerDefaultInstance(ael.class, ael);
    }

    private ael() {
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
                return newMessageInfo(f129106b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", aej.f129105a});
            case 3:
                return new ael();
            case 4:
                return new aei();
            case 5:
                return f129106b;
            case 6:
                C63010eb ebVar = f129107d;
                if (ebVar == null) {
                    synchronized (ael.class) {
                        ebVar = f129107d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129106b);
                            f129107d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
