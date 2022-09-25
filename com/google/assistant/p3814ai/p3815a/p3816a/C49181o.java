package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.o */
/* compiled from: PG */
public final class C49181o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49181o f127163c;

    /* renamed from: d */
    private static volatile C63010eb f127164d;

    /* renamed from: a */
    public C62971cq f127165a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f127166b = emptyProtobufList();

    static {
        C49181o oVar = new C49181o();
        f127163c = oVar;
        C62942bv.registerDefaultInstance(C49181o.class, oVar);
    }

    private C49181o() {
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
                return newMessageInfo(f127163c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002\u001b", new Object[]{"a", "b", C49179m.class});
            case 3:
                return new C49181o();
            case 4:
                return new C49180n();
            case 5:
                return f127163c;
            case 6:
                C63010eb ebVar = f127164d;
                if (ebVar == null) {
                    synchronized (C49181o.class) {
                        ebVar = f127164d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127163c);
                            f127164d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
