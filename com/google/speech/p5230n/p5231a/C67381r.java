package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.r */
/* compiled from: PG */
public final class C67381r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67381r f183154a;

    /* renamed from: c */
    private static volatile C63010eb f183155c;

    /* renamed from: b */
    private byte f183156b = 2;

    static {
        C67381r rVar = new C67381r();
        f183154a = rVar;
        C62942bv.registerDefaultInstance(C67381r.class, rVar);
    }

    private C67381r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183156b);
            case 1:
                this.f183156b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f183154a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67381r();
            case 4:
                return new C67380q();
            case 5:
                return f183154a;
            case 6:
                C63010eb ebVar = f183155c;
                if (ebVar == null) {
                    synchronized (C67381r.class) {
                        ebVar = f183155c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183154a);
                            f183155c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
