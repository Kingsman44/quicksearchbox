package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hc */
/* compiled from: PG */
public final class C49118hc extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C49118hc f127034a;

    /* renamed from: c */
    private static volatile C63010eb f127035c;

    /* renamed from: b */
    private byte f127036b = 2;

    static {
        C49118hc hcVar = new C49118hc();
        f127034a = hcVar;
        C62942bv.registerDefaultInstance(C49118hc.class, hcVar);
    }

    private C49118hc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127036b);
            case 1:
                this.f127036b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f127034a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49118hc();
            case 4:
                return new C49117hb();
            case 5:
                return f127034a;
            case 6:
                C63010eb ebVar = f127035c;
                if (ebVar == null) {
                    synchronized (C49118hc.class) {
                        ebVar = f127035c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127034a);
                            f127035c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
