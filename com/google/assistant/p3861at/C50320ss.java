package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ss */
/* compiled from: PG */
public final class C50320ss extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50320ss f130967c;

    /* renamed from: d */
    private static volatile C63010eb f130968d;

    /* renamed from: a */
    public C62961ch f130969a = emptyIntList();

    /* renamed from: b */
    public C62971cq f130970b = C62942bv.emptyProtobufList();

    static {
        C50320ss ssVar = new C50320ss();
        f130967c = ssVar;
        C62942bv.registerDefaultInstance(C50320ss.class, ssVar);
    }

    private C50320ss() {
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
                return newMessageInfo(f130967c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u0016\u0003\u001a", new Object[]{"a", "b"});
            case 3:
                return new C50320ss();
            case 4:
                return new C50319sr();
            case 5:
                return f130967c;
            case 6:
                C63010eb ebVar = f130968d;
                if (ebVar == null) {
                    synchronized (C50320ss.class) {
                        ebVar = f130968d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130967c);
                            f130968d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
