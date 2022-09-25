package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ee */
/* compiled from: PG */
public final class C66915ee extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66915ee f181900b;

    /* renamed from: d */
    private static volatile C63010eb f181901d;

    /* renamed from: a */
    public C62971cq f181902a = emptyProtobufList();

    /* renamed from: c */
    private byte f181903c = 2;

    static {
        C66915ee eeVar = new C66915ee();
        f181900b = eeVar;
        C62942bv.registerDefaultInstance(C66915ee.class, eeVar);
    }

    private C66915ee() {
    }

    /* renamed from: a */
    public final void mo59748a() {
        C62971cq cqVar = this.f181902a;
        if (!cqVar.mo58948c()) {
            this.f181902a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181903c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181903c = b;
                return null;
            case 2:
                return newMessageInfo(f181900b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C66913ec.class});
            case 3:
                return new C66915ee();
            case 4:
                return new C66914ed();
            case 5:
                return f181900b;
            case 6:
                C63010eb ebVar = f181901d;
                if (ebVar == null) {
                    synchronized (C66915ee.class) {
                        ebVar = f181901d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181900b);
                            f181901d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
