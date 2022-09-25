package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4937b.C64274b;

/* renamed from: com.google.speech.recognizer.a.am */
/* compiled from: PG */
public final class C67444am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67444am f183287b;

    /* renamed from: d */
    private static volatile C63010eb f183288d;

    /* renamed from: a */
    public C62971cq f183289a = emptyProtobufList();

    /* renamed from: c */
    private byte f183290c = 2;

    static {
        C67444am amVar = new C67444am();
        f183287b = amVar;
        C62942bv.registerDefaultInstance(C67444am.class, amVar);
    }

    private C67444am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183290c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183290c = b;
                return null;
            case 2:
                return newMessageInfo(f183287b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64274b.class});
            case 3:
                return new C67444am();
            case 4:
                return new C67443al();
            case 5:
                return f183287b;
            case 6:
                C63010eb ebVar = f183288d;
                if (ebVar == null) {
                    synchronized (C67444am.class) {
                        ebVar = f183288d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183287b);
                            f183288d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
