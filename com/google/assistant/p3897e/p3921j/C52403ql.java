package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.ql */
/* compiled from: PG */
public final class C52403ql extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52403ql f137512f;

    /* renamed from: g */
    private static volatile C63010eb f137513g;

    /* renamed from: a */
    public int f137514a;

    /* renamed from: b */
    public int f137515b;

    /* renamed from: c */
    public int f137516c;

    /* renamed from: d */
    public int f137517d;

    /* renamed from: e */
    public int f137518e;

    static {
        C52403ql qlVar = new C52403ql();
        f137512f = qlVar;
        C62942bv.registerDefaultInstance(C52403ql.class, qlVar);
    }

    private C52403ql() {
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
                return newMessageInfo(f137512f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52403ql();
            case 4:
                return new C52402qk();
            case 5:
                return f137512f;
            case 6:
                C63010eb ebVar = f137513g;
                if (ebVar == null) {
                    synchronized (C52403ql.class) {
                        ebVar = f137513g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137512f);
                            f137513g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
