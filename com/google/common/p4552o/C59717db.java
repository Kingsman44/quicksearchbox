package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.db */
/* compiled from: PG */
public final class C59717db extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59717db f160291d;

    /* renamed from: e */
    private static volatile C63010eb f160292e;

    /* renamed from: a */
    public int f160293a;

    /* renamed from: b */
    public boolean f160294b;

    /* renamed from: c */
    public boolean f160295c;

    static {
        C59717db dbVar = new C59717db();
        f160291d = dbVar;
        C62942bv.registerDefaultInstance(C59717db.class, dbVar);
    }

    private C59717db() {
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
                return newMessageInfo(f160291d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59717db();
            case 4:
                return new C59716da();
            case 5:
                return f160291d;
            case 6:
                C63010eb ebVar = f160292e;
                if (ebVar == null) {
                    synchronized (C59717db.class) {
                        ebVar = f160292e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160291d);
                            f160292e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
