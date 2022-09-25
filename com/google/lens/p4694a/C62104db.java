package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.db */
/* compiled from: PG */
public final class C62104db extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62104db f167719a;

    /* renamed from: c */
    private static volatile C63010eb f167720c;

    /* renamed from: b */
    private byte f167721b = 2;

    static {
        C62104db dbVar = new C62104db();
        f167719a = dbVar;
        C62942bv.registerDefaultInstance(C62104db.class, dbVar);
    }

    private C62104db() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167721b);
            case 1:
                this.f167721b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167719a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62104db();
            case 4:
                return new C62103da();
            case 5:
                return f167719a;
            case 6:
                C63010eb ebVar = f167720c;
                if (ebVar == null) {
                    synchronized (C62104db.class) {
                        ebVar = f167720c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167719a);
                            f167720c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
