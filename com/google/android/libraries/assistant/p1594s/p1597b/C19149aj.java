package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.aj */
/* compiled from: PG */
public final class C19149aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19149aj f53636b;

    /* renamed from: c */
    private static volatile C63010eb f53637c;

    /* renamed from: a */
    public C62971cq f53638a = emptyProtobufList();

    static {
        C19149aj ajVar = new C19149aj();
        f53636b = ajVar;
        C62942bv.registerDefaultInstance(C19149aj.class, ajVar);
    }

    private C19149aj() {
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
                return newMessageInfo(f53636b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19148ai.class});
            case 3:
                return new C19149aj();
            case 4:
                return new C19146ag();
            case 5:
                return f53636b;
            case 6:
                C63010eb ebVar = f53637c;
                if (ebVar == null) {
                    synchronized (C19149aj.class) {
                        ebVar = f53637c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53636b);
                            f53637c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
