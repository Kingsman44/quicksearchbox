package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.aj */
/* compiled from: PG */
public final class C64291aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64291aj f173833c;

    /* renamed from: e */
    private static volatile C63010eb f173834e;

    /* renamed from: a */
    public C64285ad f173835a;

    /* renamed from: b */
    public C62971cq f173836b = emptyProtobufList();

    /* renamed from: d */
    private int f173837d;

    static {
        C64291aj ajVar = new C64291aj();
        f173833c = ajVar;
        C62942bv.registerDefaultInstance(C64291aj.class, ajVar);
    }

    private C64291aj() {
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
                return newMessageInfo(f173833c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C52023hv.class});
            case 3:
                return new C64291aj();
            case 4:
                return new C64290ai();
            case 5:
                return f173833c;
            case 6:
                C63010eb ebVar = f173834e;
                if (ebVar == null) {
                    synchronized (C64291aj.class) {
                        ebVar = f173834e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173833c);
                            f173834e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
