package com.google.assistant.p4008y.p4009a;

import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.f */
/* compiled from: PG */
public final class C53597f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53597f f140675c;

    /* renamed from: d */
    private static volatile C63010eb f140676d;

    /* renamed from: a */
    public int f140677a = 0;

    /* renamed from: b */
    public Object f140678b;

    static {
        C53597f fVar = new C53597f();
        f140675c = fVar;
        C62942bv.registerDefaultInstance(C53597f.class, fVar);
    }

    private C53597f() {
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
                return newMessageInfo(f140675c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C52003hb.class, C51965fr.class});
            case 3:
                return new C53597f();
            case 4:
                return new C53596e();
            case 5:
                return f140675c;
            case 6:
                C63010eb ebVar = f140676d;
                if (ebVar == null) {
                    synchronized (C53597f.class) {
                        ebVar = f140676d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140675c);
                            f140676d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
