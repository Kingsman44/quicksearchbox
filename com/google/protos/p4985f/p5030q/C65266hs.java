package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.hs */
/* compiled from: PG */
public final class C65266hs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65266hs f176571c;

    /* renamed from: d */
    private static volatile C63010eb f176572d;

    /* renamed from: a */
    public int f176573a;

    /* renamed from: b */
    public C65682h f176574b;

    static {
        C65266hs hsVar = new C65266hs();
        f176571c = hsVar;
        C62942bv.registerDefaultInstance(C65266hs.class, hsVar);
    }

    private C65266hs() {
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
                return newMessageInfo(f176571c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65266hs();
            case 4:
                return new C65265hr();
            case 5:
                return f176571c;
            case 6:
                C63010eb ebVar = f176572d;
                if (ebVar == null) {
                    synchronized (C65266hs.class) {
                        ebVar = f176572d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176571c);
                            f176572d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
