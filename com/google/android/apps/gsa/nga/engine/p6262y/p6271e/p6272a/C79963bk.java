package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bk */
/* compiled from: PG */
public final class C79963bk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79963bk f219302f;

    /* renamed from: g */
    private static volatile C63010eb f219303g;

    /* renamed from: a */
    public int f219304a;

    /* renamed from: b */
    public C79967bo f219305b;

    /* renamed from: c */
    public C79967bo f219306c;

    /* renamed from: d */
    public C79967bo f219307d;

    /* renamed from: e */
    public C79967bo f219308e;

    static {
        C79963bk bkVar = new C79963bk();
        f219302f = bkVar;
        C62942bv.registerDefaultInstance(C79963bk.class, bkVar);
    }

    private C79963bk() {
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
                return newMessageInfo(f219302f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C79963bk();
            case 4:
                return new C79962bj();
            case 5:
                return f219302f;
            case 6:
                C63010eb ebVar = f219303g;
                if (ebVar == null) {
                    synchronized (C79963bk.class) {
                        ebVar = f219303g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219302f);
                            f219303g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
