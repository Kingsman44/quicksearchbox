package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pg */
/* compiled from: PG */
public final class C50227pg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50227pg f130596a;

    /* renamed from: b */
    private static volatile C63010eb f130597b;

    static {
        C50227pg pgVar = new C50227pg();
        f130596a = pgVar;
        C62942bv.registerDefaultInstance(C50227pg.class, pgVar);
    }

    private C50227pg() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130596a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50227pg();
            case 4:
                return new C50226pf();
            case 5:
                return f130596a;
            case 6:
                C63010eb ebVar = f130597b;
                if (ebVar == null) {
                    synchronized (C50227pg.class) {
                        ebVar = f130597b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130596a);
                            f130597b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
