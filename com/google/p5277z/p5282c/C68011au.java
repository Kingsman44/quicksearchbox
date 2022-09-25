package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.au */
/* compiled from: PG */
public final class C68011au extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68011au f184271a;

    /* renamed from: c */
    private static volatile C63010eb f184272c;

    /* renamed from: b */
    private byte f184273b = 2;

    static {
        C68011au auVar = new C68011au();
        f184271a = auVar;
        C62942bv.registerDefaultInstance(C68011au.class, auVar);
    }

    private C68011au() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184273b);
            case 1:
                this.f184273b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f184271a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C68011au();
            case 4:
                return new C68010at();
            case 5:
                return f184271a;
            case 6:
                C63010eb ebVar = f184272c;
                if (ebVar == null) {
                    synchronized (C68011au.class) {
                        ebVar = f184272c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184271a);
                            f184272c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
