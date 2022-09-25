package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.ba */
/* compiled from: PG */
public final class C57144ba extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57144ba f152543a;

    /* renamed from: c */
    private static volatile C63010eb f152544c;

    /* renamed from: b */
    private byte f152545b = 2;

    static {
        C57144ba baVar = new C57144ba();
        f152543a = baVar;
        C62942bv.registerDefaultInstance(C57144ba.class, baVar);
    }

    private C57144ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152545b);
            case 1:
                this.f152545b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152543a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57144ba();
            case 4:
                return new C57142az();
            case 5:
                return f152543a;
            case 6:
                C63010eb ebVar = f152544c;
                if (ebVar == null) {
                    synchronized (C57144ba.class) {
                        ebVar = f152544c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152543a);
                            f152544c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
