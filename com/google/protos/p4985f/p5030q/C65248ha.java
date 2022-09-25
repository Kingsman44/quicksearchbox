package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.ha */
/* compiled from: PG */
public final class C65248ha extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65248ha f176548c;

    /* renamed from: d */
    private static volatile C63010eb f176549d;

    /* renamed from: a */
    public int f176550a;

    /* renamed from: b */
    public C65682h f176551b;

    static {
        C65248ha haVar = new C65248ha();
        f176548c = haVar;
        C62942bv.registerDefaultInstance(C65248ha.class, haVar);
    }

    private C65248ha() {
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
                return newMessageInfo(f176548c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65248ha();
            case 4:
                return new C65246gz();
            case 5:
                return f176548c;
            case 6:
                C63010eb ebVar = f176549d;
                if (ebVar == null) {
                    synchronized (C65248ha.class) {
                        ebVar = f176549d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176548c);
                            f176549d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
