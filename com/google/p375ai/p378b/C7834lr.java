package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lr */
/* compiled from: PG */
public final class C7834lr extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C7834lr f27467c;

    /* renamed from: f */
    private static volatile C63010eb f27468f;

    /* renamed from: a */
    public C62971cq f27469a = emptyProtobufList();

    /* renamed from: b */
    public boolean f27470b = true;

    /* renamed from: d */
    private int f27471d;

    /* renamed from: e */
    private byte f27472e = 2;

    static {
        C7834lr lrVar = new C7834lr();
        f27467c = lrVar;
        C62942bv.registerDefaultInstance(C7834lr.class, lrVar);
    }

    private C7834lr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27472e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27472e = b;
                return null;
            case 2:
                return newMessageInfo(f27467c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"d", "a", C7994rp.class, "b"});
            case 3:
                return new C7834lr();
            case 4:
                return new C7833lq();
            case 5:
                return f27467c;
            case 6:
                C63010eb ebVar = f27468f;
                if (ebVar == null) {
                    synchronized (C7834lr.class) {
                        ebVar = f27468f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27467c);
                            f27468f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
