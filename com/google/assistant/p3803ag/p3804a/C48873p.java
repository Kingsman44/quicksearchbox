package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.p */
/* compiled from: PG */
public final class C48873p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48873p f126478b;

    /* renamed from: d */
    private static volatile C63010eb f126479d;

    /* renamed from: a */
    public C62971cq f126480a = emptyProtobufList();

    /* renamed from: c */
    private byte f126481c = 2;

    static {
        C48873p pVar = new C48873p();
        f126478b = pVar;
        C62942bv.registerDefaultInstance(C48873p.class, pVar);
    }

    private C48873p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126481c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126481c = b;
                return null;
            case 2:
                return newMessageInfo(f126478b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C48865h.class});
            case 3:
                return new C48873p();
            case 4:
                return new C48872o();
            case 5:
                return f126478b;
            case 6:
                C63010eb ebVar = f126479d;
                if (ebVar == null) {
                    synchronized (C48873p.class) {
                        ebVar = f126479d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126478b);
                            f126479d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
