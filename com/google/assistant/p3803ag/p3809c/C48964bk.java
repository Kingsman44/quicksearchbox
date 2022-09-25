package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bk */
/* compiled from: PG */
public final class C48964bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48964bk f126680b;

    /* renamed from: d */
    private static volatile C63010eb f126681d;

    /* renamed from: a */
    public int f126682a;

    /* renamed from: c */
    private int f126683c;

    static {
        C48964bk bkVar = new C48964bk();
        f126680b = bkVar;
        C62942bv.registerDefaultInstance(C48964bk.class, bkVar);
    }

    private C48964bk() {
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
                return newMessageInfo(f126680b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48963bj.m85327b()});
            case 3:
                return new C48964bk();
            case 4:
                return new C48961bh();
            case 5:
                return f126680b;
            case 6:
                C63010eb ebVar = f126681d;
                if (ebVar == null) {
                    synchronized (C48964bk.class) {
                        ebVar = f126681d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126680b);
                            f126681d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
