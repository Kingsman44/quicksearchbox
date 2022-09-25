package com.google.android.libraries.search.assistant.p2566g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.r */
/* compiled from: PG */
public final class C33423r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C33423r f89502a;

    /* renamed from: c */
    private static volatile C63010eb f89503c;

    /* renamed from: b */
    private byte f89504b = 2;

    static {
        C33423r rVar = new C33423r();
        f89502a = rVar;
        C62942bv.registerDefaultInstance(C33423r.class, rVar);
    }

    private C33423r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89504b);
            case 1:
                this.f89504b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f89502a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C33423r();
            case 4:
                return new C33422q();
            case 5:
                return f89502a;
            case 6:
                C63010eb ebVar = f89503c;
                if (ebVar == null) {
                    synchronized (C33423r.class) {
                        ebVar = f89503c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89502a);
                            f89503c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
