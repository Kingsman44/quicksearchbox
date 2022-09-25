package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agu */
/* compiled from: PG */
public final class agu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final agu f135078c;

    /* renamed from: d */
    private static volatile C63010eb f135079d;

    /* renamed from: a */
    public int f135080a;

    /* renamed from: b */
    public boolean f135081b;

    static {
        agu agu = new agu();
        f135078c = agu;
        C62942bv.registerDefaultInstance(agu.class, agu);
    }

    private agu() {
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
                return newMessageInfo(f135078c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new agu();
            case 4:
                return new agt();
            case 5:
                return f135078c;
            case 6:
                C63010eb ebVar = f135079d;
                if (ebVar == null) {
                    synchronized (agu.class) {
                        ebVar = f135079d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135078c);
                            f135079d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
