package com.google.nlp.p4735b.p4736a.p4738b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.o */
/* compiled from: PG */
public final class C62833o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62833o f169673c;

    /* renamed from: e */
    private static volatile C63010eb f169674e;

    /* renamed from: a */
    public C62971cq f169675a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f169676b = emptyProtobufList();

    /* renamed from: d */
    private byte f169677d = 2;

    static {
        C62833o oVar = new C62833o();
        f169673c = oVar;
        C62942bv.registerDefaultInstance(C62833o.class, oVar);
    }

    private C62833o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169677d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169677d = b;
                return null;
            case 2:
                return newMessageInfo(f169673c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C62831m.class, "b", C62831m.class});
            case 3:
                return new C62833o();
            case 4:
                return new C62832n();
            case 5:
                return f169673c;
            case 6:
                C63010eb ebVar = f169674e;
                if (ebVar == null) {
                    synchronized (C62833o.class) {
                        ebVar = f169674e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169673c);
                            f169674e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
