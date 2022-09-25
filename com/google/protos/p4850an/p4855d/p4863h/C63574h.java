package com.google.protos.p4850an.p4855d.p4863h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.h.h */
/* compiled from: PG */
public final class C63574h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63574h f171954a;

    /* renamed from: c */
    private static volatile C63010eb f171955c;

    /* renamed from: b */
    private byte f171956b = 2;

    static {
        C63574h hVar = new C63574h();
        f171954a = hVar;
        C62942bv.registerDefaultInstance(C63574h.class, hVar);
    }

    private C63574h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171956b);
            case 1:
                this.f171956b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f171954a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63574h();
            case 4:
                return new C63573g();
            case 5:
                return f171954a;
            case 6:
                C63010eb ebVar = f171955c;
                if (ebVar == null) {
                    synchronized (C63574h.class) {
                        ebVar = f171955c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171954a);
                            f171955c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
