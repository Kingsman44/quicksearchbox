package com.google.assistant.p3745ab.p3766r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.r.e */
/* compiled from: PG */
public final class C48389e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48389e f125074d;

    /* renamed from: e */
    private static volatile C63010eb f125075e;

    /* renamed from: a */
    public int f125076a;

    /* renamed from: b */
    public int f125077b;

    /* renamed from: c */
    public boolean f125078c;

    static {
        C48389e eVar = new C48389e();
        f125074d = eVar;
        C62942bv.registerDefaultInstance(C48389e.class, eVar);
    }

    private C48389e() {
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
                return newMessageInfo(f125074d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C51474ja.m86197b(), C45240c.f118157a});
            case 3:
                return new C48389e();
            case 4:
                return new C48388d();
            case 5:
                return f125074d;
            case 6:
                C63010eb ebVar = f125075e;
                if (ebVar == null) {
                    synchronized (C48389e.class) {
                        ebVar = f125075e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125074d);
                            f125075e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
