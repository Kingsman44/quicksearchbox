package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.eb */
/* compiled from: PG */
public final class C52069eb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52069eb f136648b;

    /* renamed from: c */
    private static volatile C63010eb f136649c;

    /* renamed from: a */
    public C62971cq f136650a = emptyProtobufList();

    static {
        C52069eb ebVar = new C52069eb();
        f136648b = ebVar;
        C62942bv.registerDefaultInstance(C52069eb.class, ebVar);
    }

    private C52069eb() {
    }

    /* renamed from: a */
    public final void mo53781a() {
        C62971cq cqVar = this.f136650a;
        if (!cqVar.mo58948c()) {
            this.f136650a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f136648b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52232kc.class});
            case 3:
                return new C52069eb();
            case 4:
                return new C52068ea();
            case 5:
                return f136648b;
            case 6:
                C63010eb ebVar = f136649c;
                if (ebVar == null) {
                    synchronized (C52069eb.class) {
                        ebVar = f136649c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136648b);
                            f136649c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
