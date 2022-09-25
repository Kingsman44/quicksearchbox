package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.f */
/* compiled from: PG */
public final class C36482f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36482f f95223d;

    /* renamed from: e */
    private static volatile C63010eb f95224e;

    /* renamed from: a */
    public int f95225a;

    /* renamed from: b */
    public C62971cq f95226b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f95227c;

    static {
        C36482f fVar = new C36482f();
        f95223d = fVar;
        C62942bv.registerDefaultInstance(C36482f.class, fVar);
    }

    private C36482f() {
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
                return newMessageInfo(f95223d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဇ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36482f();
            case 4:
                return new C36481e();
            case 5:
                return f95223d;
            case 6:
                C63010eb ebVar = f95224e;
                if (ebVar == null) {
                    synchronized (C36482f.class) {
                        ebVar = f95224e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95223d);
                            f95224e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
