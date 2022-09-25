package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.am */
/* compiled from: PG */
public final class C62749am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62749am f169472a;

    /* renamed from: c */
    private static volatile C63010eb f169473c;

    /* renamed from: b */
    private byte f169474b = 2;

    static {
        C62749am amVar = new C62749am();
        f169472a = amVar;
        C62942bv.registerDefaultInstance(C62749am.class, amVar);
    }

    private C62749am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169474b);
            case 1:
                this.f169474b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169472a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62749am();
            case 4:
                return new C62748al();
            case 5:
                return f169472a;
            case 6:
                C63010eb ebVar = f169473c;
                if (ebVar == null) {
                    synchronized (C62749am.class) {
                        ebVar = f169473c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169472a);
                            f169473c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
