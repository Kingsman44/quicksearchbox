package com.google.nlp.saft;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.saft.e */
/* compiled from: PG */
public final class C62851e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62851e f169730a;

    /* renamed from: c */
    private static volatile C63010eb f169731c;

    /* renamed from: b */
    private byte f169732b = 2;

    static {
        C62851e eVar = new C62851e();
        f169730a = eVar;
        C62942bv.registerDefaultInstance(C62851e.class, eVar);
    }

    private C62851e() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169732b);
            case 1:
                this.f169732b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169730a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62851e();
            case 4:
                return new C62850d();
            case 5:
                return f169730a;
            case 6:
                C63010eb ebVar = f169731c;
                if (ebVar == null) {
                    synchronized (C62851e.class) {
                        ebVar = f169731c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169730a);
                            f169731c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
