package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jv */
/* compiled from: PG */
public final class C51495jv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51495jv f134170a;

    /* renamed from: c */
    private static volatile C63010eb f134171c;

    /* renamed from: b */
    private byte f134172b = 2;

    static {
        C51495jv jvVar = new C51495jv();
        f134170a = jvVar;
        C62942bv.registerDefaultInstance(C51495jv.class, jvVar);
    }

    private C51495jv() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134172b);
            case 1:
                this.f134172b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f134170a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51495jv();
            case 4:
                return new C51494ju();
            case 5:
                return f134170a;
            case 6:
                C63010eb ebVar = f134171c;
                if (ebVar == null) {
                    synchronized (C51495jv.class) {
                        ebVar = f134171c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134170a);
                            f134171c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
