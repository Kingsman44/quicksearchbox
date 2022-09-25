package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3861at.C50081jw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afp */
/* compiled from: PG */
public final class afp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final afp f135012b;

    /* renamed from: c */
    private static volatile C63010eb f135013c;

    /* renamed from: a */
    public C62971cq f135014a = emptyProtobufList();

    static {
        afp afp = new afp();
        f135012b = afp;
        C62942bv.registerDefaultInstance(afp.class, afp);
    }

    private afp() {
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
                return newMessageInfo(f135012b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50081jw.class});
            case 3:
                return new afp();
            case 4:
                return new afo();
            case 5:
                return f135012b;
            case 6:
                C63010eb ebVar = f135013c;
                if (ebVar == null) {
                    synchronized (afp.class) {
                        ebVar = f135013c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135012b);
                            f135013c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
