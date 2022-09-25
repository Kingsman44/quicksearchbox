package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.t */
/* compiled from: PG */
public final class C63709t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63709t f172246d;

    /* renamed from: f */
    private static volatile C63010eb f172247f;

    /* renamed from: a */
    public C63698i f172248a;

    /* renamed from: b */
    public C62971cq f172249b = emptyProtobufList();

    /* renamed from: c */
    public int f172250c;

    /* renamed from: e */
    private int f172251e;

    static {
        C63709t tVar = new C63709t();
        f172246d = tVar;
        C62942bv.registerDefaultInstance(C63709t.class, tVar);
    }

    private C63709t() {
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
                return newMessageInfo(f172246d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"e", "a", "b", C63694e.class, C45240c.f118157a});
            case 3:
                return new C63709t();
            case 4:
                return new C63708s();
            case 5:
                return f172246d;
            case 6:
                C63010eb ebVar = f172247f;
                if (ebVar == null) {
                    synchronized (C63709t.class) {
                        ebVar = f172247f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172246d);
                            f172247f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
