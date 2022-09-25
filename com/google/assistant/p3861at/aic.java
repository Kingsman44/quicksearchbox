package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4109av.p4110a.p4111a.C54604c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aic */
/* compiled from: PG */
public final class aic extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aic f129380b;

    /* renamed from: d */
    private static volatile C63010eb f129381d;

    /* renamed from: a */
    public int f129382a;

    /* renamed from: c */
    private int f129383c;

    static {
        aic aic = new aic();
        f129380b = aic;
        C62942bv.registerDefaultInstance(aic.class, aic);
    }

    private aic() {
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
                return newMessageInfo(f129380b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C54604c.f143365a});
            case 3:
                return new aic();
            case 4:
                return new aib();
            case 5:
                return f129380b;
            case 6:
                C63010eb ebVar = f129381d;
                if (ebVar == null) {
                    synchronized (aic.class) {
                        ebVar = f129381d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129380b);
                            f129381d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
