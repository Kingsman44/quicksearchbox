package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ba */
/* compiled from: PG */
public final class C57246ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57246ba f152819d;

    /* renamed from: f */
    private static volatile C63010eb f152820f;

    /* renamed from: a */
    public int f152821a;

    /* renamed from: b */
    public C57299d f152822b;

    /* renamed from: c */
    public C57244az f152823c;

    /* renamed from: e */
    private byte f152824e = 2;

    static {
        C57246ba baVar = new C57246ba();
        f152819d = baVar;
        C62942bv.registerDefaultInstance(C57246ba.class, baVar);
    }

    private C57246ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152824e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152824e = b;
                return null;
            case 2:
                return newMessageInfo(f152819d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57246ba();
            case 4:
                return new C57240av();
            case 5:
                return f152819d;
            case 6:
                C63010eb ebVar = f152820f;
                if (ebVar == null) {
                    synchronized (C57246ba.class) {
                        ebVar = f152820f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152819d);
                            f152820f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
