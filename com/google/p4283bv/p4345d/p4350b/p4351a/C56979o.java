package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.o */
/* compiled from: PG */
public final class C56979o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56979o f152103a;

    /* renamed from: c */
    private static volatile C63010eb f152104c;

    /* renamed from: b */
    private byte f152105b = 2;

    static {
        C56979o oVar = new C56979o();
        f152103a = oVar;
        C62942bv.registerDefaultInstance(C56979o.class, oVar);
    }

    private C56979o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152105b);
            case 1:
                this.f152105b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152103a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56979o();
            case 4:
                return new C56978n();
            case 5:
                return f152103a;
            case 6:
                C63010eb ebVar = f152104c;
                if (ebVar == null) {
                    synchronized (C56979o.class) {
                        ebVar = f152104c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152103a);
                            f152104c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
