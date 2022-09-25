package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.mb */
/* compiled from: PG */
public final class C52285mb extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C52285mb f137252a;

    /* renamed from: c */
    private static volatile C63010eb f137253c;

    /* renamed from: b */
    private byte f137254b = 2;

    static {
        C52285mb mbVar = new C52285mb();
        f137252a = mbVar;
        C62942bv.registerDefaultInstance(C52285mb.class, mbVar);
    }

    private C52285mb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137254b);
            case 1:
                this.f137254b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f137252a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52285mb();
            case 4:
                return new C52284ma();
            case 5:
                return f137252a;
            case 6:
                C63010eb ebVar = f137253c;
                if (ebVar == null) {
                    synchronized (C52285mb.class) {
                        ebVar = f137253c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137252a);
                            f137253c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
