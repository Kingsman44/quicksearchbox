package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bm */
/* compiled from: PG */
public final class C51270bm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51270bm f133476f;

    /* renamed from: g */
    private static volatile C63010eb f133477g;

    /* renamed from: a */
    public int f133478a;

    /* renamed from: b */
    public int f133479b = 0;

    /* renamed from: c */
    public Object f133480c;

    /* renamed from: d */
    public C51267bj f133481d;

    /* renamed from: e */
    public C52522uw f133482e;

    static {
        C51270bm bmVar = new C51270bm();
        f133476f = bmVar;
        C62942bv.registerDefaultInstance(C51270bm.class, bmVar);
    }

    private C51270bm() {
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
                return newMessageInfo(f133476f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ဵ\u0000\u0003ဿ\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{C45240c.f118157a, "b", "a", C51264bg.class, C51269bl.m86103b(), "d", "e"});
            case 3:
                return new C51270bm();
            case 4:
                return new C51265bh();
            case 5:
                return f133476f;
            case 6:
                C63010eb ebVar = f133477g;
                if (ebVar == null) {
                    synchronized (C51270bm.class) {
                        ebVar = f133477g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133476f);
                            f133477g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
