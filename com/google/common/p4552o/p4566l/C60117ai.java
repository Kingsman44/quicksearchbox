package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ai */
/* compiled from: PG */
public final class C60117ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60117ai f162581b;

    /* renamed from: d */
    private static volatile C63010eb f162582d;

    /* renamed from: a */
    public C62971cq f162583a = emptyProtobufList();

    /* renamed from: c */
    private byte f162584c = 2;

    static {
        C60117ai aiVar = new C60117ai();
        f162581b = aiVar;
        C62942bv.registerDefaultInstance(C60117ai.class, aiVar);
    }

    private C60117ai() {
    }

    /* renamed from: a */
    public final void mo57068a() {
        C62971cq cqVar = this.f162583a;
        if (!cqVar.mo58948c()) {
            this.f162583a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162584c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162584c = b;
                return null;
            case 2:
                return newMessageInfo(f162581b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C60119ak.class});
            case 3:
                return new C60117ai();
            case 4:
                return new C60116ah();
            case 5:
                return f162581b;
            case 6:
                C63010eb ebVar = f162582d;
                if (ebVar == null) {
                    synchronized (C60117ai.class) {
                        ebVar = f162582d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162581b);
                            f162582d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
