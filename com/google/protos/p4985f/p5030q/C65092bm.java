package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.bm */
/* compiled from: PG */
public final class C65092bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65092bm f176244c;

    /* renamed from: d */
    private static volatile C63010eb f176245d;

    /* renamed from: a */
    public int f176246a;

    /* renamed from: b */
    public C51594nm f176247b;

    static {
        C65092bm bmVar = new C65092bm();
        f176244c = bmVar;
        C62942bv.registerDefaultInstance(C65092bm.class, bmVar);
    }

    private C65092bm() {
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
                return newMessageInfo(f176244c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65092bm();
            case 4:
                return new C65091bl();
            case 5:
                return f176244c;
            case 6:
                C63010eb ebVar = f176245d;
                if (ebVar == null) {
                    synchronized (C65092bm.class) {
                        ebVar = f176245d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176244c);
                            f176245d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
