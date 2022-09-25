package com.google.assistant.p3741aa.p3742a.p3743a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.h */
/* compiled from: PG */
public final class C48160h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48160h f124608d;

    /* renamed from: f */
    private static volatile C63010eb f124609f;

    /* renamed from: a */
    public int f124610a;

    /* renamed from: b */
    public int f124611b;

    /* renamed from: c */
    public C62971cq f124612c = emptyProtobufList();

    /* renamed from: e */
    private byte f124613e = 2;

    static {
        C48160h hVar = new C48160h();
        f124608d = hVar;
        C62942bv.registerDefaultInstance(C48160h.class, hVar);
    }

    private C48160h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124613e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124613e = b;
                return null;
            case 2:
                return newMessageInfo(f124608d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"a", "b", C48158f.f124607a, C45240c.f118157a, C48162j.class});
            case 3:
                return new C48160h();
            case 4:
                return new C48157e();
            case 5:
                return f124608d;
            case 6:
                C63010eb ebVar = f124609f;
                if (ebVar == null) {
                    synchronized (C48160h.class) {
                        ebVar = f124609f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124608d);
                            f124609f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
