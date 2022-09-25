package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.ab */
/* compiled from: PG */
public final class C50894ab extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50894ab f132504f;

    /* renamed from: g */
    private static volatile C63010eb f132505g;

    /* renamed from: a */
    public int f132506a;

    /* renamed from: b */
    public C62971cq f132507b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f132508c = emptyProtobufList();

    /* renamed from: d */
    public C50894ab f132509d;

    /* renamed from: e */
    public C50923z f132510e;

    static {
        C50894ab abVar = new C50894ab();
        f132504f = abVar;
        C62942bv.registerDefaultInstance(C50894ab.class, abVar);
    }

    private C50894ab() {
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
                return newMessageInfo(f132504f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", C50894ab.class, C45240c.f118157a, C50894ab.class, "d", "e"});
            case 3:
                return new C50894ab();
            case 4:
                return new C50893aa();
            case 5:
                return f132504f;
            case 6:
                C63010eb ebVar = f132505g;
                if (ebVar == null) {
                    synchronized (C50894ab.class) {
                        ebVar = f132505g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132504f);
                            f132505g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
