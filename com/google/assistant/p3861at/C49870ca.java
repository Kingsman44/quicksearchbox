package com.google.assistant.p3861at;

import com.google.assistant.p3825an.p3830c.p3831a.C49262ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ca */
/* compiled from: PG */
public final class C49870ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49870ca f129588c;

    /* renamed from: e */
    private static volatile C63010eb f129589e;

    /* renamed from: a */
    public boolean f129590a;

    /* renamed from: b */
    public int f129591b;

    /* renamed from: d */
    private int f129592d;

    static {
        C49870ca caVar = new C49870ca();
        f129588c = caVar;
        C62942bv.registerDefaultInstance(C49870ca.class, caVar);
    }

    private C49870ca() {
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
                return newMessageInfo(f129588c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C49262ah.f127341a});
            case 3:
                return new C49870ca();
            case 4:
                return new C49868bz();
            case 5:
                return f129588c;
            case 6:
                C63010eb ebVar = f129589e;
                if (ebVar == null) {
                    synchronized (C49870ca.class) {
                        ebVar = f129589e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129588c);
                            f129589e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
