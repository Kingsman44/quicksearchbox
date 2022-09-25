package com.google.p4495cl.p4496a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cl.a.b */
/* compiled from: PG */
public final class C58129b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C58129b f155400a;

    /* renamed from: c */
    private static volatile C63010eb f155401c;

    /* renamed from: b */
    private byte f155402b = 2;

    static {
        C58129b bVar = new C58129b();
        f155400a = bVar;
        C62942bv.registerDefaultInstance(C58129b.class, bVar);
    }

    private C58129b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155402b);
            case 1:
                this.f155402b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f155400a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C58129b();
            case 4:
                return new C58128a();
            case 5:
                return f155400a;
            case 6:
                C63010eb ebVar = f155401c;
                if (ebVar == null) {
                    synchronized (C58129b.class) {
                        ebVar = f155401c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155400a);
                            f155401c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
