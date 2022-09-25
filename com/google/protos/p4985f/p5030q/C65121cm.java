package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.cm */
/* compiled from: PG */
public final class C65121cm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65121cm f176280c;

    /* renamed from: d */
    private static volatile C63010eb f176281d;

    /* renamed from: a */
    public int f176282a;

    /* renamed from: b */
    public C65682h f176283b;

    static {
        C65121cm cmVar = new C65121cm();
        f176280c = cmVar;
        C62942bv.registerDefaultInstance(C65121cm.class, cmVar);
    }

    private C65121cm() {
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
                return newMessageInfo(f176280c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65121cm();
            case 4:
                return new C65120cl();
            case 5:
                return f176280c;
            case 6:
                C63010eb ebVar = f176281d;
                if (ebVar == null) {
                    synchronized (C65121cm.class) {
                        ebVar = f176281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176280c);
                            f176281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
