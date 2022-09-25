package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.av */
/* compiled from: PG */
public final class C62758av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62758av f169489a;

    /* renamed from: c */
    private static volatile C63010eb f169490c;

    /* renamed from: b */
    private byte f169491b = 2;

    static {
        C62758av avVar = new C62758av();
        f169489a = avVar;
        C62942bv.registerDefaultInstance(C62758av.class, avVar);
    }

    private C62758av() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169491b);
            case 1:
                this.f169491b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169489a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62758av();
            case 4:
                return new C62757au();
            case 5:
                return f169489a;
            case 6:
                C63010eb ebVar = f169490c;
                if (ebVar == null) {
                    synchronized (C62758av.class) {
                        ebVar = f169490c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169489a);
                            f169490c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
