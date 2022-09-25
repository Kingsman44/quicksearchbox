package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.r */
/* compiled from: PG */
public final class C65733r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65733r f178575c;

    /* renamed from: e */
    private static volatile C63010eb f178576e;

    /* renamed from: a */
    public C65716ao f178577a;

    /* renamed from: b */
    public C62971cq f178578b = emptyProtobufList();

    /* renamed from: d */
    private int f178579d;

    static {
        C65733r rVar = new C65733r();
        f178575c = rVar;
        C62942bv.registerDefaultInstance(C65733r.class, rVar);
    }

    private C65733r() {
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
                return newMessageInfo(f178575c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C65732q.class});
            case 3:
                return new C65733r();
            case 4:
                return new C65730o();
            case 5:
                return f178575c;
            case 6:
                C63010eb ebVar = f178576e;
                if (ebVar == null) {
                    synchronized (C65733r.class) {
                        ebVar = f178576e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178575c);
                            f178576e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
