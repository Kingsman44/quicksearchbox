package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.ci */
/* compiled from: PG */
public final class C9404ci extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C9404ci f32670a;

    /* renamed from: c */
    private static volatile C63010eb f32671c;

    /* renamed from: b */
    private byte f32672b = 2;

    static {
        C9404ci ciVar = new C9404ci();
        f32670a = ciVar;
        C62942bv.registerDefaultInstance(C9404ci.class, ciVar);
    }

    private C9404ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32672b);
            case 1:
                this.f32672b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f32670a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C9404ci();
            case 4:
                return new C9403ch();
            case 5:
                return f32670a;
            case 6:
                C63010eb ebVar = f32671c;
                if (ebVar == null) {
                    synchronized (C9404ci.class) {
                        ebVar = f32671c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32670a);
                            f32671c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
