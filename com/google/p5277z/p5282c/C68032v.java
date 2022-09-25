package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.v */
/* compiled from: PG */
public final class C68032v extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C68032v f184320b;

    /* renamed from: d */
    private static volatile C63010eb f184321d;

    /* renamed from: a */
    public C62971cq f184322a = emptyProtobufList();

    /* renamed from: c */
    private byte f184323c = 2;

    static {
        C68032v vVar = new C68032v();
        f184320b = vVar;
        C62942bv.registerDefaultInstance(C68032v.class, vVar);
    }

    private C68032v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184323c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184323c = b;
                return null;
            case 2:
                return newMessageInfo(f184320b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C67992ab.class});
            case 3:
                return new C68032v();
            case 4:
                return new C68031u();
            case 5:
                return f184320b;
            case 6:
                C63010eb ebVar = f184321d;
                if (ebVar == null) {
                    synchronized (C68032v.class) {
                        ebVar = f184321d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184320b);
                            f184321d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
