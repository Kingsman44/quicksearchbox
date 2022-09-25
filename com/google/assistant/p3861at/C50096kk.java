package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kk */
/* compiled from: PG */
public final class C50096kk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50096kk f130240b;

    /* renamed from: c */
    private static volatile C63010eb f130241c;

    /* renamed from: a */
    public C62971cq f130242a = emptyProtobufList();

    static {
        C50096kk kkVar = new C50096kk();
        f130240b = kkVar;
        C62942bv.registerDefaultInstance(C50096kk.class, kkVar);
    }

    private C50096kk() {
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
                return newMessageInfo(f130240b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50094ki.class});
            case 3:
                return new C50096kk();
            case 4:
                return new C50095kj();
            case 5:
                return f130240b;
            case 6:
                C63010eb ebVar = f130241c;
                if (ebVar == null) {
                    synchronized (C50096kk.class) {
                        ebVar = f130241c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130240b);
                            f130241c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
