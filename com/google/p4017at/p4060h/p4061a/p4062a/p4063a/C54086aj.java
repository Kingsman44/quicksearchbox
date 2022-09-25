package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.aj */
/* compiled from: PG */
public final class C54086aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54086aj f141917a;

    /* renamed from: c */
    private static volatile C63010eb f141918c;

    /* renamed from: b */
    private byte f141919b = 2;

    static {
        C54086aj ajVar = new C54086aj();
        f141917a = ajVar;
        C62942bv.registerDefaultInstance(C54086aj.class, ajVar);
    }

    private C54086aj() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141919b);
            case 1:
                this.f141919b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f141917a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54086aj();
            case 4:
                return new C54085ai();
            case 5:
                return f141917a;
            case 6:
                C63010eb ebVar = f141918c;
                if (ebVar == null) {
                    synchronized (C54086aj.class) {
                        ebVar = f141918c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141917a);
                            f141918c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
