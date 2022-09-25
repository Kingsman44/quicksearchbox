package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.av */
/* compiled from: PG */
public final class C65009av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65009av f176050c;

    /* renamed from: e */
    private static volatile C63010eb f176051e;

    /* renamed from: a */
    public C52378pn f176052a;

    /* renamed from: b */
    public int f176053b;

    /* renamed from: d */
    private int f176054d;

    static {
        C65009av avVar = new C65009av();
        f176050c = avVar;
        C62942bv.registerDefaultInstance(C65009av.class, avVar);
    }

    private C65009av() {
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
                return newMessageInfo(f176050c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002", new Object[]{"d", "a", "b", C65080ba.f176227a});
            case 3:
                return new C65009av();
            case 4:
                return new C65008au();
            case 5:
                return f176050c;
            case 6:
                C63010eb ebVar = f176051e;
                if (ebVar == null) {
                    synchronized (C65009av.class) {
                        ebVar = f176051e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176050c);
                            f176051e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
