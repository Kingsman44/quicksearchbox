package com.google.protos.p4985f.p5009j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.h */
/* compiled from: PG */
public final class C64891h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64891h f175799a;

    /* renamed from: c */
    private static volatile C63010eb f175800c;

    /* renamed from: b */
    private byte f175801b = 2;

    static {
        C64891h hVar = new C64891h();
        f175799a = hVar;
        C62942bv.registerDefaultInstance(C64891h.class, hVar);
    }

    private C64891h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175801b);
            case 1:
                this.f175801b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f175799a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64891h();
            case 4:
                return new C64886g();
            case 5:
                return f175799a;
            case 6:
                C63010eb ebVar = f175800c;
                if (ebVar == null) {
                    synchronized (C64891h.class) {
                        ebVar = f175800c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175799a);
                            f175800c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
