package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jo */
/* compiled from: PG */
public final class C53321jo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53321jo f139819e;

    /* renamed from: f */
    private static volatile C63010eb f139820f;

    /* renamed from: a */
    public int f139821a;

    /* renamed from: b */
    public C53323jq f139822b;

    /* renamed from: c */
    public C62971cq f139823c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f139824d = emptyProtobufList();

    static {
        C53321jo joVar = new C53321jo();
        f139819e = joVar;
        C62942bv.registerDefaultInstance(C53321jo.class, joVar);
    }

    private C53321jo() {
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
                return newMessageInfo(f139819e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C53323jq.class, "d", C53198f.class});
            case 3:
                return new C53321jo();
            case 4:
                return new C53320jn();
            case 5:
                return f139819e;
            case 6:
                C63010eb ebVar = f139820f;
                if (ebVar == null) {
                    synchronized (C53321jo.class) {
                        ebVar = f139820f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139819e);
                            f139820f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
