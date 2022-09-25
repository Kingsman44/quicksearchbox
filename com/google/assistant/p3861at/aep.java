package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aep */
/* compiled from: PG */
public final class aep extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aep f129118e;

    /* renamed from: f */
    private static volatile C63010eb f129119f;

    /* renamed from: a */
    public int f129120a;

    /* renamed from: b */
    public int f129121b;

    /* renamed from: c */
    public aem f129122c;

    /* renamed from: d */
    public adr f129123d;

    static {
        aep aep = new aep();
        f129118e = aep;
        C62942bv.registerDefaultInstance(aep.class, aep);
    }

    private aep() {
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
                return newMessageInfo(f129118e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", aen.f129117a, C45240c.f118157a, "d"});
            case 3:
                return new aep();
            case 4:
                return new aeg();
            case 5:
                return f129118e;
            case 6:
                C63010eb ebVar = f129119f;
                if (ebVar == null) {
                    synchronized (aep.class) {
                        ebVar = f129119f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129118e);
                            f129119f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
