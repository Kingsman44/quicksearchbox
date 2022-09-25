package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.f */
/* compiled from: PG */
public final class C66802f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66802f f181666b;

    /* renamed from: c */
    private static volatile C63010eb f181667c;

    /* renamed from: a */
    public C62971cq f181668a = emptyProtobufList();

    static {
        C66802f fVar = new C66802f();
        f181666b = fVar;
        C62942bv.registerDefaultInstance(C66802f.class, fVar);
    }

    private C66802f() {
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
                return newMessageInfo(f181666b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C66806j.class});
            case 3:
                return new C66802f();
            case 4:
                return new C66801e();
            case 5:
                return f181666b;
            case 6:
                C63010eb ebVar = f181667c;
                if (ebVar == null) {
                    synchronized (C66802f.class) {
                        ebVar = f181667c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181666b);
                            f181667c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
