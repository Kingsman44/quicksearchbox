package com.google.assistant.p3996t.p3997a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.p */
/* compiled from: PG */
public final class C53489p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53489p f140377b;

    /* renamed from: c */
    private static volatile C63010eb f140378c;

    /* renamed from: a */
    public C62971cq f140379a = emptyProtobufList();

    static {
        C53489p pVar = new C53489p();
        f140377b = pVar;
        C62942bv.registerDefaultInstance(C53489p.class, pVar);
    }

    private C53489p() {
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
                return newMessageInfo(f140377b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53487n.class});
            case 3:
                return new C53489p();
            case 4:
                return new C53488o();
            case 5:
                return f140377b;
            case 6:
                C63010eb ebVar = f140378c;
                if (ebVar == null) {
                    synchronized (C53489p.class) {
                        ebVar = f140378c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140377b);
                            f140378c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
