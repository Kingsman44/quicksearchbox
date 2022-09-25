package com.google.assistant.p3980n.p3985c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.c.e */
/* compiled from: PG */
public final class C53014e extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C53014e f138959a;

    /* renamed from: c */
    private static volatile C63010eb f138960c;

    /* renamed from: b */
    private byte f138961b = 2;

    static {
        C53014e eVar = new C53014e();
        f138959a = eVar;
        C62942bv.registerDefaultInstance(C53014e.class, eVar);
    }

    private C53014e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138961b);
            case 1:
                this.f138961b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f138959a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53014e();
            case 4:
                return new C53013d();
            case 5:
                return f138959a;
            case 6:
                C63010eb ebVar = f138960c;
                if (ebVar == null) {
                    synchronized (C53014e.class) {
                        ebVar = f138960c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138959a);
                            f138960c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
