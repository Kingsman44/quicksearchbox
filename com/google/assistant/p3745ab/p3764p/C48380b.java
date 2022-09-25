package com.google.assistant.p3745ab.p3764p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.p.b */
/* compiled from: PG */
public final class C48380b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48380b f125059a;

    /* renamed from: c */
    private static volatile C63010eb f125060c;

    /* renamed from: b */
    private byte f125061b = 2;

    static {
        C48380b bVar = new C48380b();
        f125059a = bVar;
        C62942bv.registerDefaultInstance(C48380b.class, bVar);
    }

    private C48380b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125061b);
            case 1:
                this.f125061b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f125059a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48380b();
            case 4:
                return new C48379a();
            case 5:
                return f125059a;
            case 6:
                C63010eb ebVar = f125060c;
                if (ebVar == null) {
                    synchronized (C48380b.class) {
                        ebVar = f125060c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125059a);
                            f125060c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
