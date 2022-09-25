package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mt */
/* compiled from: PG */
public final class C50159mt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50159mt f130398b;

    /* renamed from: c */
    private static volatile C63010eb f130399c;

    /* renamed from: a */
    public int f130400a;

    static {
        C50159mt mtVar = new C50159mt();
        f130398b = mtVar;
        C62942bv.registerDefaultInstance(C50159mt.class, mtVar);
    }

    private C50159mt() {
        emptyProtobufList();
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
                return newMessageInfo(f130398b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C50159mt();
            case 4:
                return new C50158ms();
            case 5:
                return f130398b;
            case 6:
                C63010eb ebVar = f130399c;
                if (ebVar == null) {
                    synchronized (C50159mt.class) {
                        ebVar = f130399c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130398b);
                            f130399c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
