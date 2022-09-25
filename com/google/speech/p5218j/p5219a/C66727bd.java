package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.bd */
/* compiled from: PG */
public final class C66727bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66727bd f181507b;

    /* renamed from: d */
    private static volatile C63010eb f181508d;

    /* renamed from: a */
    public C62971cq f181509a = emptyProtobufList();

    /* renamed from: c */
    private byte f181510c = 2;

    static {
        C66727bd bdVar = new C66727bd();
        f181507b = bdVar;
        C62942bv.registerDefaultInstance(C66727bd.class, bdVar);
    }

    private C66727bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181510c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181510c = b;
                return null;
            case 2:
                return newMessageInfo(f181507b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C66707ak.class});
            case 3:
                return new C66727bd();
            case 4:
                return new C66726bc();
            case 5:
                return f181507b;
            case 6:
                C63010eb ebVar = f181508d;
                if (ebVar == null) {
                    synchronized (C66727bd.class) {
                        ebVar = f181508d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181507b);
                            f181508d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
