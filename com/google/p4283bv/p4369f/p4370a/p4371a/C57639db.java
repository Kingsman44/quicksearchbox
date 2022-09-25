package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.db */
/* compiled from: PG */
public final class C57639db extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57639db f153941a;

    /* renamed from: b */
    private static volatile C63010eb f153942b;

    static {
        C57639db dbVar = new C57639db();
        f153941a = dbVar;
        C62942bv.registerDefaultInstance(C57639db.class, dbVar);
    }

    private C57639db() {
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
                return newMessageInfo(f153941a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57639db();
            case 4:
                return new C57638da();
            case 5:
                return f153941a;
            case 6:
                C63010eb ebVar = f153942b;
                if (ebVar == null) {
                    synchronized (C57639db.class) {
                        ebVar = f153942b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153941a);
                            f153942b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
