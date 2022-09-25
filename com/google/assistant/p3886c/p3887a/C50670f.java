package com.google.assistant.p3886c.p3887a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.f */
/* compiled from: PG */
public final class C50670f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50670f f131811d;

    /* renamed from: e */
    private static volatile C63010eb f131812e;

    /* renamed from: a */
    public int f131813a;

    /* renamed from: b */
    public C50672h f131814b;

    /* renamed from: c */
    public C50668d f131815c;

    static {
        C50670f fVar = new C50670f();
        f131811d = fVar;
        C62942bv.registerDefaultInstance(C50670f.class, fVar);
    }

    private C50670f() {
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
                return newMessageInfo(f131811d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50670f();
            case 4:
                return new C50669e();
            case 5:
                return f131811d;
            case 6:
                C63010eb ebVar = f131812e;
                if (ebVar == null) {
                    synchronized (C50670f.class) {
                        ebVar = f131812e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131811d);
                            f131812e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
