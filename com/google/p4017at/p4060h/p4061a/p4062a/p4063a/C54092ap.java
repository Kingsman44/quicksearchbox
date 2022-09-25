package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.ap */
/* compiled from: PG */
public final class C54092ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54092ap f141927a;

    /* renamed from: c */
    private static volatile C63010eb f141928c;

    /* renamed from: b */
    private byte f141929b = 2;

    static {
        C54092ap apVar = new C54092ap();
        f141927a = apVar;
        C62942bv.registerDefaultInstance(C54092ap.class, apVar);
    }

    private C54092ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141929b);
            case 1:
                this.f141929b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f141927a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54092ap();
            case 4:
                return new C54091ao();
            case 5:
                return f141927a;
            case 6:
                C63010eb ebVar = f141928c;
                if (ebVar == null) {
                    synchronized (C54092ap.class) {
                        ebVar = f141928c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141927a);
                            f141928c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
