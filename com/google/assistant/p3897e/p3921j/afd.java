package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afd */
/* compiled from: PG */
public final class afd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final afd f134990d;

    /* renamed from: e */
    private static volatile C63010eb f134991e;

    /* renamed from: a */
    public int f134992a = 0;

    /* renamed from: b */
    public Object f134993b;

    /* renamed from: c */
    public C62971cq f134994c = C62942bv.emptyProtobufList();

    static {
        afd afd = new afd();
        f134990d = afd;
        C62942bv.registerDefaultInstance(afd.class, afd);
    }

    private afd() {
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
                return newMessageInfo(f134990d, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004\u001a", new Object[]{"b", "a", aeo.class, aff.class, afh.class, C45240c.f118157a});
            case 3:
                return new afd();
            case 4:
                return new afc();
            case 5:
                return f134990d;
            case 6:
                C63010eb ebVar = f134991e;
                if (ebVar == null) {
                    synchronized (afd.class) {
                        ebVar = f134991e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134990d);
                            f134991e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
