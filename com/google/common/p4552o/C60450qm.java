package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qm */
/* compiled from: PG */
public final class C60450qm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60450qm f163590b;

    /* renamed from: d */
    private static volatile C63010eb f163591d;

    /* renamed from: a */
    public C62971cq f163592a = emptyProtobufList();

    /* renamed from: c */
    private byte f163593c = 2;

    static {
        C60450qm qmVar = new C60450qm();
        f163590b = qmVar;
        C62942bv.registerDefaultInstance(C60450qm.class, qmVar);
    }

    private C60450qm() {
    }

    /* renamed from: a */
    public final void mo57092a() {
        C62971cq cqVar = this.f163592a;
        if (!cqVar.mo58948c()) {
            this.f163592a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163593c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163593c = b;
                return null;
            case 2:
                return newMessageInfo(f163590b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C60448qk.class});
            case 3:
                return new C60450qm();
            case 4:
                return new C60449ql();
            case 5:
                return f163590b;
            case 6:
                C63010eb ebVar = f163591d;
                if (ebVar == null) {
                    synchronized (C60450qm.class) {
                        ebVar = f163591d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163590b);
                            f163591d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
