package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ba */
/* compiled from: PG */
public final class C62782ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62782ba f169539b;

    /* renamed from: d */
    private static volatile C63010eb f169540d;

    /* renamed from: a */
    public C62971cq f169541a = emptyProtobufList();

    /* renamed from: c */
    private byte f169542c = 2;

    static {
        C62782ba baVar = new C62782ba();
        f169539b = baVar;
        C62942bv.registerDefaultInstance(C62782ba.class, baVar);
    }

    private C62782ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169542c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169542c = b;
                return null;
            case 2:
                return newMessageInfo(f169539b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C62756at.class});
            case 3:
                return new C62782ba();
            case 4:
                return new C62752ap();
            case 5:
                return f169539b;
            case 6:
                C63010eb ebVar = f169540d;
                if (ebVar == null) {
                    synchronized (C62782ba.class) {
                        ebVar = f169540d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169539b);
                            f169540d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
