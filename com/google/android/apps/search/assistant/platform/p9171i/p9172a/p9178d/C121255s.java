package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.s */
/* compiled from: PG */
public final class C121255s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121255s f336817b;

    /* renamed from: c */
    private static volatile C63010eb f336818c;

    /* renamed from: a */
    public C62971cq f336819a = emptyProtobufList();

    static {
        C121255s sVar = new C121255s();
        f336817b = sVar;
        C62942bv.registerDefaultInstance(C121255s.class, sVar);
    }

    private C121255s() {
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
                return newMessageInfo(f336817b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C121253q.class});
            case 3:
                return new C121255s();
            case 4:
                return new C121254r();
            case 5:
                return f336817b;
            case 6:
                C63010eb ebVar = f336818c;
                if (ebVar == null) {
                    synchronized (C121255s.class) {
                        ebVar = f336818c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336817b);
                            f336818c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
