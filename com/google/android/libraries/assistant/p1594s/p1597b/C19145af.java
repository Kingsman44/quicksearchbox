package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.af */
/* compiled from: PG */
public final class C19145af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19145af f53628b;

    /* renamed from: c */
    private static volatile C63010eb f53629c;

    /* renamed from: a */
    public C62971cq f53630a = emptyProtobufList();

    static {
        C19145af afVar = new C19145af();
        f53628b = afVar;
        C62942bv.registerDefaultInstance(C19145af.class, afVar);
    }

    private C19145af() {
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
                return newMessageInfo(f53628b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19143ad.class});
            case 3:
                return new C19145af();
            case 4:
                return new C19144ae();
            case 5:
                return f53628b;
            case 6:
                C63010eb ebVar = f53629c;
                if (ebVar == null) {
                    synchronized (C19145af.class) {
                        ebVar = f53629c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53628b);
                            f53629c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
