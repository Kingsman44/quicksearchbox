package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zk */
/* compiled from: PG */
public final class C60695zk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60695zk f164674f;

    /* renamed from: g */
    private static volatile C63010eb f164675g;

    /* renamed from: a */
    public int f164676a;

    /* renamed from: b */
    public int f164677b;

    /* renamed from: c */
    public int f164678c;

    /* renamed from: d */
    public int f164679d;

    /* renamed from: e */
    public int f164680e;

    static {
        C60695zk zkVar = new C60695zk();
        f164674f = zkVar;
        C62942bv.registerDefaultInstance(C60695zk.class, zkVar);
    }

    private C60695zk() {
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
                return newMessageInfo(f164674f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60695zk();
            case 4:
                return new C60694zj();
            case 5:
                return f164674f;
            case 6:
                C63010eb ebVar = f164675g;
                if (ebVar == null) {
                    synchronized (C60695zk.class) {
                        ebVar = f164675g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164674f);
                            f164675g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
