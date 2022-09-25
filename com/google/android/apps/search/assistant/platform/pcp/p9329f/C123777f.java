package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.f */
/* compiled from: PG */
public final class C123777f extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C123777f f341922a;

    /* renamed from: c */
    private static volatile C63010eb f341923c;

    /* renamed from: b */
    private byte f341924b = 2;

    static {
        C123777f fVar = new C123777f();
        f341922a = fVar;
        C62942bv.registerDefaultInstance(C123777f.class, fVar);
    }

    private C123777f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341924b);
            case 1:
                this.f341924b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f341922a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C123777f();
            case 4:
                return new C123776e();
            case 5:
                return f341922a;
            case 6:
                C63010eb ebVar = f341923c;
                if (ebVar == null) {
                    synchronized (C123777f.class) {
                        ebVar = f341923c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341922a);
                            f341923c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
