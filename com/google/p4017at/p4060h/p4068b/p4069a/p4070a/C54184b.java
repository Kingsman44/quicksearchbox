package com.google.p4017at.p4060h.p4068b.p4069a.p4070a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.b.a.a.b */
/* compiled from: PG */
public final class C54184b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54184b f142198a;

    /* renamed from: c */
    private static volatile C63010eb f142199c;

    /* renamed from: b */
    private byte f142200b = 2;

    static {
        C54184b bVar = new C54184b();
        f142198a = bVar;
        C62942bv.registerDefaultInstance(C54184b.class, bVar);
    }

    private C54184b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142200b);
            case 1:
                this.f142200b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f142198a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54184b();
            case 4:
                return new C54183a();
            case 5:
                return f142198a;
            case 6:
                C63010eb ebVar = f142199c;
                if (ebVar == null) {
                    synchronized (C54184b.class) {
                        ebVar = f142199c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142198a);
                            f142199c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
