package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.z */
/* compiled from: PG */
public final class C53470z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53470z f140330c;

    /* renamed from: e */
    private static volatile C63010eb f140331e;

    /* renamed from: a */
    public C62971cq f140332a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C53469y f140333b;

    /* renamed from: d */
    private int f140334d;

    static {
        C53470z zVar = new C53470z();
        f140330c = zVar;
        C62942bv.registerDefaultInstance(C53470z.class, zVar);
    }

    private C53470z() {
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
                return newMessageInfo(f140330c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C53470z();
            case 4:
                return new C53467w();
            case 5:
                return f140330c;
            case 6:
                C63010eb ebVar = f140331e;
                if (ebVar == null) {
                    synchronized (C53470z.class) {
                        ebVar = f140331e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140330c);
                            f140331e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
