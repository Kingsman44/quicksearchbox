package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.u */
/* compiled from: PG */
public final class C66754u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66754u f181563b;

    /* renamed from: c */
    private static volatile C63010eb f181564c;

    /* renamed from: a */
    public C62971cq f181565a = emptyProtobufList();

    static {
        C66754u uVar = new C66754u();
        f181563b = uVar;
        C62942bv.registerDefaultInstance(C66754u.class, uVar);
    }

    private C66754u() {
    }

    /* renamed from: a */
    public final void mo59736a() {
        C62971cq cqVar = this.f181565a;
        if (!cqVar.mo58948c()) {
            this.f181565a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181563b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            case 3:
                return new C66754u();
            case 4:
                return new C66753t();
            case 5:
                return f181563b;
            case 6:
                C63010eb ebVar = f181564c;
                if (ebVar == null) {
                    synchronized (C66754u.class) {
                        ebVar = f181564c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181563b);
                            f181564c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
