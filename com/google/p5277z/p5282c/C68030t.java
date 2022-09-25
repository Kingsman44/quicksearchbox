package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.t */
/* compiled from: PG */
public final class C68030t extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C68030t f184316b;

    /* renamed from: d */
    private static volatile C63010eb f184317d;

    /* renamed from: a */
    public C62971cq f184318a = emptyProtobufList();

    /* renamed from: c */
    private byte f184319c = 2;

    static {
        C68030t tVar = new C68030t();
        f184316b = tVar;
        C62942bv.registerDefaultInstance(C68030t.class, tVar);
    }

    private C68030t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184319c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184319c = b;
                return null;
            case 2:
                return newMessageInfo(f184316b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C68036z.class});
            case 3:
                return new C68030t();
            case 4:
                return new C68029s();
            case 5:
                return f184316b;
            case 6:
                C63010eb ebVar = f184317d;
                if (ebVar == null) {
                    synchronized (C68030t.class) {
                        ebVar = f184317d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184316b);
                            f184317d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
