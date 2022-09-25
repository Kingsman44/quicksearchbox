package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.gw */
/* compiled from: PG */
public final class C7704gw extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C7704gw f26884c;

    /* renamed from: e */
    private static volatile C63010eb f26885e;

    /* renamed from: a */
    public int f26886a;

    /* renamed from: b */
    public long f26887b;

    /* renamed from: d */
    private byte f26888d = 2;

    static {
        C7704gw gwVar = new C7704gw();
        f26884c = gwVar;
        C62942bv.registerDefaultInstance(C7704gw.class, gwVar);
    }

    private C7704gw() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26888d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26888d = b;
                return null;
            case 2:
                return newMessageInfo(f26884c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7704gw();
            case 4:
                return new C7703gv();
            case 5:
                return f26884c;
            case 6:
                C63010eb ebVar = f26885e;
                if (ebVar == null) {
                    synchronized (C7704gw.class) {
                        ebVar = f26885e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26884c);
                            f26885e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
