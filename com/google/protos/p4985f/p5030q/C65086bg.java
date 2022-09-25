package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.bg */
/* compiled from: PG */
public final class C65086bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65086bg f176231c;

    /* renamed from: d */
    private static volatile C63010eb f176232d;

    /* renamed from: a */
    public int f176233a;

    /* renamed from: b */
    public C65682h f176234b;

    static {
        C65086bg bgVar = new C65086bg();
        f176231c = bgVar;
        C62942bv.registerDefaultInstance(C65086bg.class, bgVar);
    }

    private C65086bg() {
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
                return newMessageInfo(f176231c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65086bg();
            case 4:
                return new C65085bf();
            case 5:
                return f176231c;
            case 6:
                C63010eb ebVar = f176232d;
                if (ebVar == null) {
                    synchronized (C65086bg.class) {
                        ebVar = f176232d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176231c);
                            f176232d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
