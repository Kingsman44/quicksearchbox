package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.adz */
/* compiled from: PG */
public final class adz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final adz f129082c;

    /* renamed from: d */
    private static volatile C63010eb f129083d;

    /* renamed from: a */
    public int f129084a;

    /* renamed from: b */
    public int f129085b;

    static {
        adz adz = new adz();
        f129082c = adz;
        C62942bv.registerDefaultInstance(adz.class, adz);
    }

    private adz() {
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
                return newMessageInfo(f129082c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ady.f129081a});
            case 3:
                return new adz();
            case 4:
                return new adx();
            case 5:
                return f129082c;
            case 6:
                C63010eb ebVar = f129083d;
                if (ebVar == null) {
                    synchronized (adz.class) {
                        ebVar = f129083d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129082c);
                            f129083d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
