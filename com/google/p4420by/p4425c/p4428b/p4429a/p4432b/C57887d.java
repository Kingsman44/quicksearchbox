package com.google.p4420by.p4425c.p4428b.p4429a.p4432b;

import com.google.p4420by.p4423b.p4424a.C57870b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.c.b.a.b.d */
/* compiled from: PG */
public final class C57887d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57887d f154846c;

    /* renamed from: e */
    private static volatile C63010eb f154847e;

    /* renamed from: a */
    public int f154848a;

    /* renamed from: b */
    public C62971cq f154849b = emptyProtobufList();

    /* renamed from: d */
    private int f154850d;

    static {
        C57887d dVar = new C57887d();
        f154846c = dVar;
        C62942bv.registerDefaultInstance(C57887d.class, dVar);
    }

    private C57887d() {
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
                return newMessageInfo(f154846c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b", new Object[]{"d", "a", C57888e.f154851a, "b", C57870b.class});
            case 3:
                return new C57887d();
            case 4:
                return new C57886c();
            case 5:
                return f154846c;
            case 6:
                C63010eb ebVar = f154847e;
                if (ebVar == null) {
                    synchronized (C57887d.class) {
                        ebVar = f154847e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154846c);
                            f154847e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
