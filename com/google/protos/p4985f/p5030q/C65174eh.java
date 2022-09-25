package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.eh */
/* compiled from: PG */
public final class C65174eh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65174eh f176377b;

    /* renamed from: c */
    private static volatile C63010eb f176378c;

    /* renamed from: a */
    public int f176379a;

    static {
        C65174eh ehVar = new C65174eh();
        f176377b = ehVar;
        C62942bv.registerDefaultInstance(C65174eh.class, ehVar);
    }

    private C65174eh() {
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
                return newMessageInfo(f176377b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C65174eh();
            case 4:
                return new C65173eg();
            case 5:
                return f176377b;
            case 6:
                C63010eb ebVar = f176378c;
                if (ebVar == null) {
                    synchronized (C65174eh.class) {
                        ebVar = f176378c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176377b);
                            f176378c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
