package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.d.l */
/* compiled from: PG */
public final class C57206l extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57206l f152722a;

    /* renamed from: c */
    private static volatile C63010eb f152723c;

    /* renamed from: b */
    private byte f152724b = 2;

    static {
        C57206l lVar = new C57206l();
        f152722a = lVar;
        C62942bv.registerDefaultInstance(C57206l.class, lVar);
    }

    private C57206l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152724b);
            case 1:
                this.f152724b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152722a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57206l();
            case 4:
                return new C57205k();
            case 5:
                return f152722a;
            case 6:
                C63010eb ebVar = f152723c;
                if (ebVar == null) {
                    synchronized (C57206l.class) {
                        ebVar = f152723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152722a);
                            f152723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
