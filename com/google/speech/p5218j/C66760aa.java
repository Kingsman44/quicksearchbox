package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.aa */
/* compiled from: PG */
public final class C66760aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66760aa f181571b;

    /* renamed from: c */
    private static volatile C63010eb f181572c;

    /* renamed from: a */
    public C62971cq f181573a = emptyProtobufList();

    static {
        C66760aa aaVar = new C66760aa();
        f181571b = aaVar;
        C62942bv.registerDefaultInstance(C66760aa.class, aaVar);
    }

    private C66760aa() {
    }

    /* renamed from: a */
    public final void mo59738a() {
        C62971cq cqVar = this.f181573a;
        if (!cqVar.mo58948c()) {
            this.f181573a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181571b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C67180y.class});
            case 3:
                return new C66760aa();
            case 4:
                return new C67181z();
            case 5:
                return f181571b;
            case 6:
                C63010eb ebVar = f181572c;
                if (ebVar == null) {
                    synchronized (C66760aa.class) {
                        ebVar = f181572c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181571b);
                            f181572c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
