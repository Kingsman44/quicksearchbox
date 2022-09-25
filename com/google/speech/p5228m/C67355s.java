package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.s */
/* compiled from: PG */
public final class C67355s extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67355s f183081a;

    /* renamed from: c */
    private static volatile C63010eb f183082c;

    /* renamed from: b */
    private byte f183083b = 2;

    static {
        C67355s sVar = new C67355s();
        f183081a = sVar;
        C62942bv.registerDefaultInstance(C67355s.class, sVar);
    }

    private C67355s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183083b);
            case 1:
                this.f183083b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f183081a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67355s();
            case 4:
                return new C67354r();
            case 5:
                return f183081a;
            case 6:
                C63010eb ebVar = f183082c;
                if (ebVar == null) {
                    synchronized (C67355s.class) {
                        ebVar = f183082c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183081a);
                            f183082c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
