package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.lw */
/* compiled from: PG */
public final class C50135lw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50135lw f130333e;

    /* renamed from: f */
    private static volatile C63010eb f130334f;

    /* renamed from: a */
    public int f130335a;

    /* renamed from: b */
    public C50149mj f130336b;

    /* renamed from: c */
    public acv f130337c;

    /* renamed from: d */
    public C50144me f130338d;

    static {
        C50135lw lwVar = new C50135lw();
        f130333e = lwVar;
        C62942bv.registerDefaultInstance(C50135lw.class, lwVar);
    }

    private C50135lw() {
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
                return newMessageInfo(f130333e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50135lw();
            case 4:
                return new C50134lv();
            case 5:
                return f130333e;
            case 6:
                C63010eb ebVar = f130334f;
                if (ebVar == null) {
                    synchronized (C50135lw.class) {
                        ebVar = f130334f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130333e);
                            f130334f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
