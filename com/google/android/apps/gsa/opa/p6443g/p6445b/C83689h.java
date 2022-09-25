package com.google.android.apps.gsa.opa.p6443g.p6445b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.g.b.h */
/* compiled from: PG */
public final class C83689h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83689h f228122d;

    /* renamed from: f */
    private static volatile C63010eb f228123f;

    /* renamed from: a */
    public int f228124a;

    /* renamed from: b */
    public C83685d f228125b;

    /* renamed from: c */
    public C62971cq f228126c = emptyProtobufList();

    /* renamed from: e */
    private byte f228127e = 2;

    static {
        C83689h hVar = new C83689h();
        f228122d = hVar;
        C62942bv.registerDefaultInstance(C83689h.class, hVar);
    }

    private C83689h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228127e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228127e = b;
                return null;
            case 2:
                return newMessageInfo(f228122d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C83683b.class});
            case 3:
                return new C83689h();
            case 4:
                return new C83688g();
            case 5:
                return f228122d;
            case 6:
                C63010eb ebVar = f228123f;
                if (ebVar == null) {
                    synchronized (C83689h.class) {
                        ebVar = f228123f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228122d);
                            f228123f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
