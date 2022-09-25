package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.p */
/* compiled from: PG */
public final class C49339p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49339p f127530e;

    /* renamed from: f */
    private static volatile C63010eb f127531f;

    /* renamed from: a */
    public int f127532a;

    /* renamed from: b */
    public C49335l f127533b;

    /* renamed from: c */
    public C62971cq f127534c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f127535d = C62942bv.emptyProtobufList();

    static {
        C49339p pVar = new C49339p();
        f127530e = pVar;
        C62942bv.registerDefaultInstance(C49339p.class, pVar);
    }

    private C49339p() {
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
                return newMessageInfo(f127530e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001a\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49339p();
            case 4:
                return new C49338o();
            case 5:
                return f127530e;
            case 6:
                C63010eb ebVar = f127531f;
                if (ebVar == null) {
                    synchronized (C49339p.class) {
                        ebVar = f127531f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127530e);
                            f127531f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
