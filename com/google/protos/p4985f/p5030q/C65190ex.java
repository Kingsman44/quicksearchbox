package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ex */
/* compiled from: PG */
public final class C65190ex extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65190ex f176421b;

    /* renamed from: c */
    private static volatile C63010eb f176422c;

    /* renamed from: a */
    public C62971cq f176423a = emptyProtobufList();

    static {
        C65190ex exVar = new C65190ex();
        f176421b = exVar;
        C62942bv.registerDefaultInstance(C65190ex.class, exVar);
    }

    private C65190ex() {
    }

    /* renamed from: a */
    public final void mo59350a() {
        C62971cq cqVar = this.f176423a;
        if (!cqVar.mo58948c()) {
            this.f176423a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f176421b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52083ep.class});
            case 3:
                return new C65190ex();
            case 4:
                return new C65189ew();
            case 5:
                return f176421b;
            case 6:
                C63010eb ebVar = f176422c;
                if (ebVar == null) {
                    synchronized (C65190ex.class) {
                        ebVar = f176422c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176421b);
                            f176422c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
