package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.db */
/* compiled from: PG */
public final class C55025db extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55025db f144764b;

    /* renamed from: c */
    private static volatile C63010eb f144765c;

    /* renamed from: a */
    public C62971cq f144766a = emptyProtobufList();

    static {
        C55025db dbVar = new C55025db();
        f144764b = dbVar;
        C62942bv.registerDefaultInstance(C55025db.class, dbVar);
    }

    private C55025db() {
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
                return newMessageInfo(f144764b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C55024da.class});
            case 3:
                return new C55025db();
            case 4:
                return new C55021cy();
            case 5:
                return f144764b;
            case 6:
                C63010eb ebVar = f144765c;
                if (ebVar == null) {
                    synchronized (C55025db.class) {
                        ebVar = f144765c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144764b);
                            f144765c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
