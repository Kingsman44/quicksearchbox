package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ur */
/* compiled from: PG */
public final class C8077ur extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8077ur f28431c;

    /* renamed from: e */
    private static volatile C63010eb f28432e;

    /* renamed from: a */
    public int f28433a;

    /* renamed from: b */
    public C8098vl f28434b;

    /* renamed from: d */
    private byte f28435d = 2;

    static {
        C8077ur urVar = new C8077ur();
        f28431c = urVar;
        C62942bv.registerDefaultInstance(C8077ur.class, urVar);
    }

    private C8077ur() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28435d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28435d = b;
                return null;
            case 2:
                return newMessageInfo(f28431c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8077ur();
            case 4:
                return new C8076uq();
            case 5:
                return f28431c;
            case 6:
                C63010eb ebVar = f28432e;
                if (ebVar == null) {
                    synchronized (C8077ur.class) {
                        ebVar = f28432e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28431c);
                            f28432e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
