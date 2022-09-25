package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.aj */
/* compiled from: PG */
public final class C66706aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66706aj f181455b;

    /* renamed from: c */
    private static volatile C63010eb f181456c;

    /* renamed from: a */
    public C62971cq f181457a = emptyProtobufList();

    static {
        C66706aj ajVar = new C66706aj();
        f181455b = ajVar;
        C62942bv.registerDefaultInstance(C66706aj.class, ajVar);
    }

    private C66706aj() {
    }

    /* renamed from: a */
    public final void mo59711a() {
        C62971cq cqVar = this.f181457a;
        if (!cqVar.mo58948c()) {
            this.f181457a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181455b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66704ah.class});
            case 3:
                return new C66706aj();
            case 4:
                return new C66705ai();
            case 5:
                return f181455b;
            case 6:
                C63010eb ebVar = f181456c;
                if (ebVar == null) {
                    synchronized (C66706aj.class) {
                        ebVar = f181456c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181455b);
                            f181456c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
