package com.google.protos.p4799ag.p4800a.p4801a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ag.a.a.b */
/* compiled from: PG */
public final class C63160b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63160b f170545a;

    /* renamed from: c */
    private static volatile C63010eb f170546c;

    /* renamed from: b */
    private byte f170547b = 2;

    static {
        C63160b bVar = new C63160b();
        f170545a = bVar;
        C62942bv.registerDefaultInstance(C63160b.class, bVar);
    }

    private C63160b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170547b);
            case 1:
                this.f170547b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f170545a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63160b();
            case 4:
                return new C63159a();
            case 5:
                return f170545a;
            case 6:
                C63010eb ebVar = f170546c;
                if (ebVar == null) {
                    synchronized (C63160b.class) {
                        ebVar = f170546c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170545a);
                            f170546c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
