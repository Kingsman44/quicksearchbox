package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aii */
/* compiled from: PG */
public final class aii extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aii f135172c;

    /* renamed from: d */
    private static volatile C63010eb f135173d;

    /* renamed from: a */
    public int f135174a;

    /* renamed from: b */
    public boolean f135175b;

    static {
        aii aii = new aii();
        f135172c = aii;
        C62942bv.registerDefaultInstance(aii.class, aii);
    }

    private aii() {
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
                return newMessageInfo(f135172c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aii();
            case 4:
                return new aih();
            case 5:
                return f135172c;
            case 6:
                C63010eb ebVar = f135173d;
                if (ebVar == null) {
                    synchronized (aii.class) {
                        ebVar = f135173d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135172c);
                            f135173d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
