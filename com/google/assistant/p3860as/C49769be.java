package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.be */
/* compiled from: PG */
public final class C49769be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49769be f128515c;

    /* renamed from: e */
    private static volatile C63010eb f128516e;

    /* renamed from: a */
    public C62971cq f128517a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f128518b = emptyProtobufList();

    /* renamed from: d */
    private byte f128519d = 2;

    static {
        C49769be beVar = new C49769be();
        f128515c = beVar;
        C62942bv.registerDefaultInstance(C49769be.class, beVar);
    }

    private C49769be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128519d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128519d = b;
                return null;
            case 2:
                return newMessageInfo(f128515c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C49777bm.class, "b", C49767bc.class});
            case 3:
                return new C49769be();
            case 4:
                return new C49768bd();
            case 5:
                return f128515c;
            case 6:
                C63010eb ebVar = f128516e;
                if (ebVar == null) {
                    synchronized (C49769be.class) {
                        ebVar = f128516e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128515c);
                            f128516e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
